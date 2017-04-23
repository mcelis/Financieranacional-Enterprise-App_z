package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.GenericEntity;

import co.com.cfn.foundation.canonical.personas.TipoPersonaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;

import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoPersonaManager;
import co.com.cfn.personas.domain.entity.TipoPersona;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 22/4/2017.
 */
@Path("/tipoPersonaResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoPersonaResource {

    private static Logger LOGGER = LogManager.getLogger(TipoPersonaResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoPersonaManager boundary;
    private final Mapper<List<TipoPersona>, List<TipoPersonaDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoPersonaResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOPERSONA_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarTipoPersona(){

        try{
            LOGGER.info("processing soap request - listarTipoPersona ");
            List<TipoPersonaDTO> TipoPersonaList;
            TipoPersonaList = entityToDtoMapper.map(boundary.listarTipoPersona());
            return Response.ok(new GenericEntity<List<TipoPersonaDTO>>(TipoPersonaList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
