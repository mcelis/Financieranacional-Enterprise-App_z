package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.TipoTarjetaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoTarjetaManager;
import co.com.cfn.personas.domain.entity.TipoTarjeta;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 12/4/2017.
 */
@Path("/tipoTarjetaResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoTarjetaResource {

    private static Logger LOGGER = LogManager.getLogger(TipoTarjetaResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoTarjetaManager boundary;
    private final Mapper<List<TipoTarjeta>, List<TipoTarjetaDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoTarjetaResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOTARJETA_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarTipoTarjeta(){

        try{
            LOGGER.info("processing soap request - listartipoTarjeta ");
            List<TipoTarjetaDTO> TipoTarjetaList;
            TipoTarjetaList = entityToDtoMapper.map(boundary.listarTipoTarjeta());
            return Response.ok(new GenericEntity<List<TipoTarjetaDTO>>(TipoTarjetaList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
