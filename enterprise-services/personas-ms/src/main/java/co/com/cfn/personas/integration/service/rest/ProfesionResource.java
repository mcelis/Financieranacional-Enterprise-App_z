package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.ProfesionDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.ProfesionManager;
import co.com.cfn.personas.domain.entity.Profesion;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zmiranda on 27/03/2017.
 */
@Path("/profesionResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class ProfesionResource {

    private static Logger LOGGER = LogManager.getLogger(ProfesionResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private ProfesionManager boundary;
    private final Mapper<List<Profesion>, List<ProfesionDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public ProfesionResource() {
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.PROFESION_ENTITY_TO_DTO);
    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarProfesion() {

        try {

            LOGGER.info("processing soap request - listarProfesion ");

            List<ProfesionDTO> ProfesionList;

            ProfesionList = entityToDtoMapper.map(boundary.listarProfesion());

            return Response.ok(new GenericEntity<List<ProfesionDTO>>(ProfesionList) {}).build();

        } catch (SystemException | BusinessException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }

}
