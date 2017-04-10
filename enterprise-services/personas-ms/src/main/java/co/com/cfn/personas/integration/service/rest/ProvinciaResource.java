package co.com.cfn.personas.integration.service.rest;

/**
 * Created by zmiranda on 09/04/2017.
 */
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

import co.com.cfn.foundation.canonical.personas.ProvinciaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.ProvinciaManager;
import co.com.cfn.personas.domain.entity.Provincia;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/provinciaResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class ProvinciaResource {

    private static Logger LOGGER = LogManager.getLogger(NacionalidadResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private ProvinciaManager boundary;
    private final Mapper<List<Provincia>, List<ProvinciaDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public ProvinciaResource() {
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.PROVINCIA_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarProvincia() {

        try {

            LOGGER.info("processing soap request - listarProvincia ");

            List<ProvinciaDTO> ProvinciaList;

            ProvinciaList = entityToDtoMapper.map(boundary.listarProvincia());

            return Response.ok(new GenericEntity<List<ProvinciaDTO>>(ProvinciaList) {}).build();

        } catch (SystemException | BusinessException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
