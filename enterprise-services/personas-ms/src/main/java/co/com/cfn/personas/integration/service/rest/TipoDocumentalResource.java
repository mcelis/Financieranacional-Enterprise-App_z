package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.TipoDocumentalDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoDocumentalManager;
import co.com.cfn.personas.domain.entity.TipoDocumental;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * Created by Mark on 9/4/2017.
 */
@Path("/tipoDocumentalResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoDocumentalResource {

    private static Logger LOGGER = LogManager.getLogger(TipoDocumentalResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoDocumentalManager boundary;
    private final Mapper<List<TipoDocumental>, List<TipoDocumentalDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoDocumentalResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPODOCUMENTAL_ENTITY_TO_DTO);
    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarTipoDocumental(){

        try{
            LOGGER.info("processing soap request - listartipoDocumental ");
            List<TipoDocumentalDTO> TipoDocumentalList;
            TipoDocumentalList = entityToDtoMapper.map(boundary.listarTipoDocumental());
            return Response.ok(new GenericEntity<List<TipoDocumentalDTO>>(TipoDocumentalList){}).build();

        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
