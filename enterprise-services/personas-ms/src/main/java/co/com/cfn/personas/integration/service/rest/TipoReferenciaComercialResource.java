package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.TipoReferenciaComercialDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoReferenciaComercialManager;
import co.com.cfn.personas.domain.entity.TipoReferenciaComercial;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 24/4/2017.
 */
@Path("/tipoReferenciaComercialResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoReferenciaComercialResource {

    private static Logger LOGGER = LogManager.getLogger(TipoReferenciaComercialResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoReferenciaComercialManager boundary;
    private final Mapper<List<TipoReferenciaComercial>, List<TipoReferenciaComercialDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoReferenciaComercialResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOREFERENCIACOMERCIAL_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarGenero(){

        try{
            LOGGER.info("processing soap request - listarTipoReferenciaComercial ");
            List<TipoReferenciaComercialDTO> TipoReferenciaComercialList;
            TipoReferenciaComercialList = entityToDtoMapper.map(boundary.listarTipoReferenciaComercial());
            return Response.ok(new GenericEntity<List<TipoReferenciaComercialDTO>>(TipoReferenciaComercialList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
