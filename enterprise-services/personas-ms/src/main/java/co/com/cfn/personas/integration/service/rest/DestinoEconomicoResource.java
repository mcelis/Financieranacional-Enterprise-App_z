package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

import co.com.cfn.foundation.canonical.personas.DestinoEconomicoDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.DestinoEconomicoManager;
import co.com.cfn.personas.domain.entity.DestinoEconomico;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 5/4/2017.
 */
@Path("/destinoEconomicoResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class DestinoEconomicoResource {

    private static Logger LOGGER = LogManager.getLogger(DestinoEconomicoResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private DestinoEconomicoManager boundary;
    private final Mapper<List<DestinoEconomico>, List<DestinoEconomicoDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public DestinoEconomicoResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.DESTINOECONOMICO_ENTITY_TO_DTO);
    }

    //[service] -----------------------------
    @GET
    @Path("/")
    public Response listarDestinoEconomico(){
        try {
            LOGGER.info("processing soap request - listarDestinoEconomico ");

            List<DestinoEconomicoDTO> DestinoEconomicoList;

            DestinoEconomicoList = entityToDtoMapper.map(boundary.listarDestinoEconomico());

            return Response.ok(new GenericEntity<List<DestinoEconomicoDTO>>(DestinoEconomicoList){}).build();
        } catch (SystemException | BusinessException e){
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
