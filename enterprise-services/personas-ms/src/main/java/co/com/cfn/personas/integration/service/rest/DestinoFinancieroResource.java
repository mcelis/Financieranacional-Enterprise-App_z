package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

import co.com.cfn.foundation.canonical.personas.DestinoFinancieroDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.DestinoFinancieroManager;
import co.com.cfn.personas.domain.entity.DestinoFinanciero;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by Mark on 6/4/2017.
 */
@Path("/destinoFinancieroResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class DestinoFinancieroResource {

    private static Logger LOGGER = LogManager.getLogger(DestinoFinancieroResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private DestinoFinancieroManager boundary;
    private final Mapper<List<DestinoFinanciero>, List<DestinoFinancieroDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public DestinoFinancieroResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.DESTINOFINANCIERO_ENTITY_TO_DTO);
    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarDestinoFinanciero(){
        try {
            LOGGER.info("processing soap request - listarDestinoFinanciero ");
            List<DestinoFinancieroDTO> DestinoFinancieroList;
            DestinoFinancieroList = entityToDtoMapper.map(boundary.listarDesfinoFinanciero());
            return Response.ok(new GenericEntity<List<DestinoFinancieroDTO>>(DestinoFinancieroList){}).build();


        } catch (SystemException | BusinessException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
