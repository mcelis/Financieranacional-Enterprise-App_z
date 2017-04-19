package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.TipoCuentaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.TipoCuentaManager;
import co.com.cfn.personas.domain.entity.TipoCuenta;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 18/4/2017.
 */
@Path("/tipoCuentaResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoCuentaResource {

    private static Logger LOGGER = LogManager.getLogger(TipoCuentaResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoCuentaManager boundary;
    private final Mapper<List<TipoCuenta>, List<TipoCuentaDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoCuentaResource(){
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOCUENTA_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarTipoCuenta(){

        try{
            LOGGER.info("processing soap request - listarTipoCuenta ");
            List<TipoCuentaDTO> TipoCuentaList;
            TipoCuentaList = entityToDtoMapper.map(boundary.listarTipoCuenta());
            return Response.ok(new GenericEntity(TipoCuentaList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
