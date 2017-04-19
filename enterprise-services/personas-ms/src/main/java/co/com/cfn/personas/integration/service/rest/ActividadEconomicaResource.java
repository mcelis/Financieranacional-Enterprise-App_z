package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.ActividadEconomicaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.ActividadEconomicaManager;
import co.com.cfn.personas.domain.entity.ActividadEconomica;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 17/4/2017.
 */

@Path("/actividadEconomicaResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class ActividadEconomicaResource {

    private static Logger LOGGER = LogManager.getLogger(ActividadEconomicaResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private ActividadEconomicaManager boundary;
    private final Mapper<List<ActividadEconomica>, List<ActividadEconomicaDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public ActividadEconomicaResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.ACTIVIDADECONOMICA_ENTITY_TO_DTO);
    }

    //[service] -----------------------------
    @GET
    @Path("/")
    public Response listarActividadEconomica(){
        try {
            LOGGER.info("processing soap request - listarActividadEconomica ");
            List<ActividadEconomicaDTO> ActividadEconomicaList;
            ActividadEconomicaList = entityToDtoMapper.map(boundary.listarActividadEconomica());
            return Response.ok(new GenericEntity<List<ActividadEconomicaDTO>>(ActividadEconomicaList){}).build();

        } catch (SystemException | BusinessException e ){
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }


}
