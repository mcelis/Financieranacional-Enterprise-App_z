package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.TipoTerceroDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoTerceroManager;
import co.com.cfn.personas.domain.entity.TipoTercero;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 24/4/2017.
 */
@Path("/tipoTerceroResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoTerceroResource {

    private static Logger LOGGER = LogManager.getLogger(TipoTerceroResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoTerceroManager boundary;
    private final Mapper<List<TipoTercero>, List<TipoTerceroDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoTerceroResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOTERCERO_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarTipoTercero(){

        try{
            LOGGER.info("processing soap request - listarTipoTercero ");
            List<TipoTerceroDTO> TipoTerceroList;
            TipoTerceroList = entityToDtoMapper.map(boundary.listarTipoTercero());
            return Response.ok(new GenericEntity<List<TipoTerceroDTO>>(TipoTerceroList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
