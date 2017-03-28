package co.com.cfn.personas.integration.service.rest;

import co.com.cfn.foundation.canonical.personas.NivelEstudioDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.NacionalidadManager;
import co.com.cfn.personas.business.boundary.NivelEstudioManager;
import co.com.cfn.personas.domain.entity.NivelEstudio;
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
 * Created by zmiranda on 27/03/2017.
 */
@Path("/nivelEstudioResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class NivelEstudioResource {

    private static Logger LOGGER = LogManager.getLogger(NacionalidadResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private NivelEstudioManager boundary;
    private final Mapper<List<NivelEstudio>, List<NivelEstudioDTO>> entityToDtoMapper;

    //[constructor] -----------------------------


    public NivelEstudioResource() {
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.NIVELESTUDIO_ENTITY_TO_DTO);
    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarNivelEstudio() {

        try {

            LOGGER.info("processing soap request - listarNivelEstuio ");

            List<NivelEstudioDTO> NivelEstudioList;

            NivelEstudioList = entityToDtoMapper.map(boundary.listarNivelEstuio());

            return Response.ok(new GenericEntity<List<NivelEstudioDTO>>(NivelEstudioList) {}).build();

        } catch (SystemException | BusinessException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
