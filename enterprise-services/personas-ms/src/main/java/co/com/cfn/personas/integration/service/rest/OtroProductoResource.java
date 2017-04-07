package co.com.cfn.personas.integration.service.rest;


import co.com.cfn.foundation.canonical.personas.OtroProductoDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.OtroProductoManager;
import co.com.cfn.personas.domain.entity.OtroProducto;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Mark on 6/4/2017.
 */
@Path("/otroProductoResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class OtroProductoResource {

    private static Logger LOGGER = LogManager.getLogger(GeneroResource.class.getName());

    @Autowired
    private OtroProductoManager boundary;
    private final Mapper<List<OtroProducto>, List<OtroProductoDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public  OtroProductoResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.OTROPRODUCTO_ENTITY_TO_DTO);
    }

    @GET
    @Path("/")
    public Response listarOtroProducto(){
        try {
            LOGGER.info("processing soap request - listarOtroProducto ");
            List<OtroProductoDTO> OtroProductoList;
            OtroProductoList = entityToDtoMapper.map(boundary.listarOtroProducto());
            return Response.ok(new GenericEntity<List<OtroProductoDTO>>(OtroProductoList){}).build();


        } catch (SystemException | BusinessException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
