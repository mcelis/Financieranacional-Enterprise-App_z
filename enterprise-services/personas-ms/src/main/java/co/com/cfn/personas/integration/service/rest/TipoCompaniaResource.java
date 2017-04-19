package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.TipoCompaniaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoCompaniaManager;
import co.com.cfn.personas.domain.entity.TipoCompania;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 18/4/2017.
 */
@Path("/tipoCompaniaResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoCompaniaResource {

    private static Logger LOGGER = LogManager.getLogger(TipoCompaniaResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoCompaniaManager boundary;
    private final Mapper<List<TipoCompania>, List<TipoCompaniaDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoCompaniaResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOCOMPANIA_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarGenero(){

        try{
            LOGGER.info("processing soap request - listarGenero ");
            List<TipoCompaniaDTO> TipoCompaniaList;
            TipoCompaniaList = entityToDtoMapper.map(boundary.listarTipoCompania());
            return Response.ok(new GenericEntity<List<TipoCompaniaDTO>>(TipoCompaniaList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
