package co.com.cfn.personas.integration.service.rest;

import co.com.cfn.foundation.canonical.personas.ActividadPersonaDTO;
import co.com.cfn.foundation.canonical.personas.ActividadesPersonasDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.PersonasMananger;
import co.com.cfn.personas.domain.entity.ActividadPersona;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


import javax.jws.WebParam;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

import static co.com.cfn.personas.infrastructure.mapper.MapperFactory.PERSONA_DTO_TO_ENTITY;
import static co.com.cfn.personas.infrastructure.mapper.MapperFactory.PERSONA_ENTITY_TO_DTO;

/**
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * CFN Generic Artifact
 * Author: Administrator
 * Created: 4-Ene-2017*
 * Type: JAVA class Artifact
 * Purpose: REST Integration Service
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */


@Path("/actividadesPersonasResouce")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class ActividadesPersonasResouce {

    private static Logger LOGGER = LogManager.getLogger(ActividadesPersonasResouce.class.getName());

    //[fields] -----------------------------

    @Autowired
    private PersonasMananger boundary;
    private final Mapper<ActividadPersonaDTO, ActividadPersona> dtoToEntitymapper;
    private final Mapper<List<ActividadPersona>, List<ActividadPersonaDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public ActividadesPersonasResouce() {
        dtoToEntitymapper = MapperFactory.getInstance().getMapper(PERSONA_DTO_TO_ENTITY);
        entityToDtoMapper = MapperFactory.getInstance().getMapper(PERSONA_ENTITY_TO_DTO);

    }


    //[service] -----------------------------

    @POST
    @Path("/")
    public Response crearPersona(@WebParam(name = "persona") ActividadPersonaDTO persona) {

        try {

            LOGGER.info("processing soap request - crearPersona: {}", persona.toString());
            boundary.crearPersona(dtoToEntitymapper.map(persona));
            return Response.ok().build();

        } catch (SystemException | BusinessException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }


    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarActividadesPersona() {

        try {

            LOGGER.info("processing soap request - listarActividadesPersona ");
            ActividadesPersonasDTO dto = new ActividadesPersonasDTO();
            dto.setPersonaDTOList(entityToDtoMapper.map(boundary.listarActividadesPersona()));
            return Response.ok().entity(dto).build();

        } catch (SystemException | BusinessException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }


}
