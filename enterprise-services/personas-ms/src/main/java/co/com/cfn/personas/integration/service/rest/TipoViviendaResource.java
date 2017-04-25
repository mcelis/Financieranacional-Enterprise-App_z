package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.TipoViviendaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoViviendaManager;
import co.com.cfn.personas.domain.entity.TipoVivienda;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 24/4/2017.
 */
@Path("/tipoViviendaResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoViviendaResource {
    private static Logger LOGGER = LogManager.getLogger(TipoViviendaResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoViviendaManager boundary;

    private final Mapper<List<TipoVivienda>, List<TipoViviendaDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoViviendaResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOVIVIENDA_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarTipoVivienda(){

        try{
            LOGGER.info("processing soap request - listarTipoVivienda");
            List<TipoViviendaDTO> TipoViviendaList;
            TipoViviendaList = entityToDtoMapper.map(boundary.listarTipoVivienda());
            return Response.ok(new GenericEntity<List<TipoViviendaDTO>>(TipoViviendaList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
