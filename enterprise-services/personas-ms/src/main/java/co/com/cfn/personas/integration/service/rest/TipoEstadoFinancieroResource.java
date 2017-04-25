package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.GenericEntity;

import co.com.cfn.foundation.canonical.personas.TipoEstadoFinancieroDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoEstadoFinancieroManager;
import co.com.cfn.personas.domain.entity.TipoEstadoFinanciero;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 24/4/2017.
 */
@Path("/tipoEstadoFinancieroResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoEstadoFinancieroResource {

    private static Logger LOGGER = LogManager.getLogger(TipoEstadoFinancieroResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoEstadoFinancieroManager boundary;
    private final Mapper<List<TipoEstadoFinanciero>, List<TipoEstadoFinancieroDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoEstadoFinancieroResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOESTADOFINANCIERO_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarTipoEstadoFinanciero(){

        try{
            LOGGER.info("processing soap request - listarTipoEstadoFinanciero ");
            List<TipoEstadoFinancieroDTO> TipoEstadoFinancieroList;
            TipoEstadoFinancieroList = entityToDtoMapper.map(boundary.listarTipoEstadoFinanciero());
            return Response.ok(new GenericEntity<List<TipoEstadoFinancieroDTO>>(TipoEstadoFinancieroList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
