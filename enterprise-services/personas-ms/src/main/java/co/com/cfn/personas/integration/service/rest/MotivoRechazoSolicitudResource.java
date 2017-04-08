package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.MotivoRechazoSolicitudDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.MotivoRechazoSolicitudManager;
import co.com.cfn.personas.domain.entity.MotivoRechazoSolicitud;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 8/4/2017.
 */
@Path("/motivoRechazoSolicitudResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class MotivoRechazoSolicitudResource {

    private static Logger LOGGER = LogManager.getLogger(MotivoRechazoSolicitud.class.getName());

    //[fields] -----------------------------

    @Autowired
    private MotivoRechazoSolicitudManager boundary;
    private final Mapper<List<MotivoRechazoSolicitud>, List<MotivoRechazoSolicitudDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public MotivoRechazoSolicitudResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.MOTIVORECHAZOSOLICITUD_ENTITY_TO_DTO);
    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarMotivoRechazoSolicitud(){
        try{
            LOGGER.info("processing soap request - listarMotivoRechazoSolicitud ");
            List<MotivoRechazoSolicitudDTO> MotivoRechazoSolicitudList;
            MotivoRechazoSolicitudList = entityToDtoMapper.map(boundary.listarMotivoRechazoSolicitud());
            return Response.ok(new GenericEntity<List<MotivoRechazoSolicitudDTO>>(MotivoRechazoSolicitudList){}).build();
        } catch (SystemException | BusinessException e){
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
