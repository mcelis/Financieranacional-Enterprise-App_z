package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

import co.com.cfn.foundation.canonical.personas.GrupoEtnicoDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.GrupoEtnicoManager;
import co.com.cfn.personas.domain.entity.GrupoEtnico;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by Mark on 28/3/2017.
 */
@Path("/grupoEtnicoResource")
@Produces({"application/xml", "application/json"})
@Consumes({"application/xml", "application/json"})
public class GrupoEtnicoResource {
    private static Logger LOGGER = LogManager.getLogger(GrupoEtnicoResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private GrupoEtnicoManager boundary;
    private final Mapper<List<GrupoEtnico>, List<GrupoEtnicoDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public GrupoEtnicoResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.GRUPOETNICO_DTO_TO_ENTITY);
    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarGruposEtnicos() {

        try {

            LOGGER.info("processing soap request - listarGruposEtnicos ");

            List<GrupoEtnicoDTO> GruposEtnicosList;

            GruposEtnicosList = entityToDtoMapper.map(boundary.listarGruposEtnicos());

            return Response.ok(new GenericEntity<List<GrupoEtnicoDTO>>(GruposEtnicosList) {}).build();

        } catch (SystemException | BusinessException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
