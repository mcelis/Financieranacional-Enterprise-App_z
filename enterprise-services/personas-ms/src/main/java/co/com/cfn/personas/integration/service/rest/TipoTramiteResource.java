package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.TipoTramiteDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoTramiteManager;
import co.com.cfn.personas.domain.entity.TipoTramite;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 26/3/2017.
 */
@Path("/tipoTramiteResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoTramiteResource {
    private static Logger LOGGER = LogManager.getLogger(TipoTramiteResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoTramiteManager boundary;
    private final Mapper<TipoTramiteDTO, TipoTramite> dtoToEntityMapper;
    private final Mapper<List<TipoTramite>, List<TipoTramiteDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoTramiteResource(){
        dtoToEntityMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOTRAMITE_DTO_TO_ENTITY);
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOTRAMITE_ENTITY_TO_DTO);
    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarTipoTramite(){

        try{
            LOGGER.info("processing soap request - listarTipoTramite ");

            List<TipoTramiteDTO> TipoTramiteList;

            TipoTramiteList = entityToDtoMapper.map(boundary.listarTiposTramite());

            return Response.ok(new GenericEntity<List<TipoTramiteDTO>>(TipoTramiteList){}).build();
        } catch (SystemException | BusinessException e) {

            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();

        }
    }
}
