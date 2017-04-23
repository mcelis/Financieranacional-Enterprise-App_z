package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.TipoGarantiaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoGarantiaManager;
import co.com.cfn.personas.domain.entity.TipoGarantia;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 21/4/2017.
 */
@Path("/tipoGarantiaResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoGarantiaResource {

    private static Logger LOGGER = LogManager.getLogger(TipoGarantiaResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoGarantiaManager boundary;

    private final Mapper<List<TipoGarantia>, List<TipoGarantiaDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoGarantiaResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOGARANTIA_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarTipoGarantia(){

        try{
            LOGGER.info("processing soap request - listarTipoGarantia ");
            List<TipoGarantiaDTO> TipoGarantiaList;
            TipoGarantiaList = entityToDtoMapper.map(boundary.listarTipoGarantia());
            return Response.ok(new GenericEntity<List<TipoGarantiaDTO>>(TipoGarantiaList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
