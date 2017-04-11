package co.com.cfn.personas.integration.service.rest;

/**
 * Created by zmiranda on 08/04/2017.
 */

import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

import co.com.cfn.foundation.canonical.personas.OficinaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.OficinaManager;
import co.com.cfn.personas.domain.entity.Oficina;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/oficinaResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class OficinaResource {

    private static Logger LOGGER = LogManager.getLogger(NacionalidadResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private OficinaManager boundary;
    private final Mapper<List<Oficina>, List<OficinaDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public OficinaResource() {
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.OFICINA_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarOficina() {

        try {

            LOGGER.info("processing soap request - listarOficina ");

            List<OficinaDTO> NacionalidadList;

            NacionalidadList = entityToDtoMapper.map(boundary.listarOficina());

            return Response.ok(new GenericEntity<List<OficinaDTO>>(NacionalidadList) {}).build();

        } catch (SystemException | BusinessException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }

}
