package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.EncuestaConocimientoDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.EncuestaConocimientoManager;
import co.com.cfn.personas.domain.entity.EncuestaConocimiento;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 8/4/2017.
 */
@Path("/encuestaConocimientoResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class EncuestaConocimientoResource {

    private static Logger LOGGER = LogManager.getLogger(EncuestaConocimientoManager.class.getName());

    //[fields] -----------------------------

    @Autowired
    private EncuestaConocimientoManager boundary;
    private final Mapper<List<EncuestaConocimiento>, List<EncuestaConocimientoDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public EncuestaConocimientoResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.ENCUESTACONOCIMIENTO_ENTITY_TO_DTO);
    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarEncuestaConocimiento(){
        try{
            LOGGER.info("processing soap request - listarEncuestaConocimiento");
            List<EncuestaConocimientoDTO> EncuestaConocimientoList;
            EncuestaConocimientoList = entityToDtoMapper.map(boundary.listarEncuestaConocimiento());
            return  Response.ok(new GenericEntity<List<EncuestaConocimientoDTO>>(EncuestaConocimientoList){}).build();
        } catch (SystemException | BusinessException e){
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
