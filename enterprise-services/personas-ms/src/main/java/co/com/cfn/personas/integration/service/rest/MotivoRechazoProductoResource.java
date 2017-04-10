package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.MotivoRechazoProductoDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.MotivoRechazoProductoManager;
import co.com.cfn.personas.domain.entity.MotivoRechazoProducto;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 9/4/2017.
 */
@Path("/motivoRechazoProductoResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class MotivoRechazoProductoResource {

    private static Logger LOGGER = LogManager.getLogger(MotivoRechazoProducto.class.getName());

    //[fields] -----------------------------

    @Autowired
    private MotivoRechazoProductoManager boundary;
    private final Mapper<List<MotivoRechazoProducto>, List<MotivoRechazoProductoDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public MotivoRechazoProductoResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.MOTIVORECHAZOPRODUCTO_ENTITY_TO_DTO);
    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarMotivoRechazoProducto(){
        try {
            LOGGER.info("processing soap request - listarMotivoRechazoProducto");
            List<MotivoRechazoProductoDTO> MotivoRechazoProductoList;
            MotivoRechazoProductoList = entityToDtoMapper.map(boundary.listarMotivoRechazoProducto());
            return Response.ok(new GenericEntity<List<MotivoRechazoProductoDTO>>(MotivoRechazoProductoList){}).build();
        } catch (SystemException | BusinessException e){
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

    }

}
