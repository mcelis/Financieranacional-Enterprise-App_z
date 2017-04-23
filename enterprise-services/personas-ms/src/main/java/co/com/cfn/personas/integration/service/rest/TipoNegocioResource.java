package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.TipoNegocioDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoNegocioManager;
import co.com.cfn.personas.domain.entity.TipoNegocio;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 21/4/2017.
 */
@Path("/tipoNegocioResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoNegocioResource {

    private static Logger LOGGER = LogManager.getLogger(TipoNegocioResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoNegocioManager boundary;
    private final Mapper<List<TipoNegocio>, List<TipoNegocioDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoNegocioResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPONEGOCIO_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarTipoNegocio(){

        try{
            LOGGER.info("processing soap request - listarTipoNegocio ");
            List<TipoNegocioDTO> TipoNegocioList;
            TipoNegocioList = entityToDtoMapper.map(boundary.listarTipoNegocio());
            return Response.ok(new GenericEntity<List<TipoNegocioDTO>>(TipoNegocioList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
