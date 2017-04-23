package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.TipoProyectoDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoProyectoManager;
import co.com.cfn.personas.domain.entity.TipoProyecto;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 21/4/2017.
 */
@Path("/tipoProyectoResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoProyectoResource {

    private static Logger LOGGER = LogManager.getLogger(TipoProyectoResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoProyectoManager boundary;
    private final Mapper<List<TipoProyecto>, List<TipoProyectoDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoProyectoResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOPROYECTO_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarTipoProyecto(){

        try{
            LOGGER.info("processing soap request - listarTipoProyecto ");
            List<TipoProyectoDTO> TipoProyectoList;
            TipoProyectoList = entityToDtoMapper.map(boundary.listarTipoProyecto());
            return Response.ok(new GenericEntity<List<TipoProyectoDTO>>(TipoProyectoList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
