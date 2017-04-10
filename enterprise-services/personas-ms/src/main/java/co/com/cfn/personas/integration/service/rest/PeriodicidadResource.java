package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by zmiranda on 09/04/2017.
 */

import co.com.cfn.foundation.canonical.personas.PeriodicidadDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.PeriodicidadManager;
import co.com.cfn.personas.domain.entity.Periodicidad;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.core.*;

import java.util.List;

@Path("/periodicidadResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class PeriodicidadResource {

    private static Logger LOGGER = LogManager.getLogger(PeriodicidadResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private PeriodicidadManager boundary;
    private final Mapper<List<Periodicidad>, List<PeriodicidadDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public PeriodicidadResource() {
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.PERIODICIDAD_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarPeriodicidad() {

        try {

            LOGGER.info("processing soap request - listarPeriodicidad ");

            List<PeriodicidadDTO> PeriodicidadList;

            PeriodicidadList = entityToDtoMapper.map(boundary.listarPeriodicidad());

            return Response.ok(new GenericEntity<List<PeriodicidadDTO>>(PeriodicidadList) {}).build();

        } catch (SystemException | BusinessException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }

}
