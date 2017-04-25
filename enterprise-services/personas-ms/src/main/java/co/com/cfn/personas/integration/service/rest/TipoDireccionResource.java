package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.TipoDireccionDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoDireccionManager;
import co.com.cfn.personas.domain.entity.TipoDireccion;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 24/4/2017.
 */

@Path("/tipoDireccionResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoDireccionResource {

    private static Logger LOGGER = LogManager.getLogger(TipoDireccionResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoDireccionManager boundary;
    private final Mapper<List<TipoDireccion>, List<TipoDireccionDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoDireccionResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPODIRECCION_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarTipoDireccion(){

        try{
            LOGGER.info("processing soap request - listarTipoDireccion ");
            List<TipoDireccionDTO> TipoDireccionList;
            TipoDireccionList = entityToDtoMapper.map(boundary.listarTipoDireccion());
            return Response.ok(new GenericEntity<List<TipoDireccionDTO>>(TipoDireccionList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
