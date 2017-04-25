package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.TipoUnidadMedidaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoUnidadMedidaManager;
import co.com.cfn.personas.domain.entity.TipoUnidadMedida;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 24/4/2017.
 */
@Path("/tipoUnidadMedidaResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoUnidadMedidaResource {

    private static Logger LOGGER = LogManager.getLogger(TipoUnidadMedidaResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoUnidadMedidaManager boundary;
    private final Mapper<List<TipoUnidadMedida>, List<TipoUnidadMedidaDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoUnidadMedidaResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOUNIDADMEDIDA_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarTipoUnidadMedida(){

        try{
            LOGGER.info("processing soap request - listarTipoUnidadMedida ");
            List<TipoUnidadMedidaDTO> TipoUnidadMedidaList;
            TipoUnidadMedidaList = entityToDtoMapper.map(boundary.listarTipoUnidadMedida());
            return Response.ok(new GenericEntity<List<TipoUnidadMedidaDTO>>(TipoUnidadMedidaList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
