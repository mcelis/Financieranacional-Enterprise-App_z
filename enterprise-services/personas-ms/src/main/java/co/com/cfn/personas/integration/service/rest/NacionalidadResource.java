package co.com.cfn.personas.integration.service.rest;

import co.com.cfn.foundation.canonical.personas.NacionalidadDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.NacionalidadManager;
import co.com.cfn.personas.domain.entity.Nacionalidad;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;


/**
 * Created by zmiranda on 27/03/2017.
 */
@Path("/nacionalidadResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class NacionalidadResource {

    private static Logger LOGGER = LogManager.getLogger(NacionalidadResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private NacionalidadManager boundary;
    private final Mapper<List<Nacionalidad>, List<NacionalidadDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public NacionalidadResource() {
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.NACIONALIDAD_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarNacionalidad() {

        try {

            LOGGER.info("processing soap request - listarNacionalidad ");

            List<NacionalidadDTO> NacionalidadList;

            NacionalidadList = entityToDtoMapper.map(boundary.listarNacionalidad());

            return Response.ok(new GenericEntity<List<NacionalidadDTO>>(NacionalidadList) {}).build();

        } catch (SystemException | BusinessException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
