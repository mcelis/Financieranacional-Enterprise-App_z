package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.EstadoCivilDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.EstadoCivilManager;
import co.com.cfn.personas.domain.entity.EstadoCivil;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 27/3/2017.
 */
@Path("/estadoCivilResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class EstadoCivilResource {

    private static Logger LOGGER = LogManager.getLogger(EstadoCivilResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private EstadoCivilManager boundary;
    private final Mapper<EstadoCivilDTO,EstadoCivil> dtoToEntitymapper;
    private final Mapper<List<EstadoCivil>, List<EstadoCivilDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public EstadoCivilResource(){
        dtoToEntitymapper = MapperFactory.getInstance().getMapper(MapperFactory.ESTADOCIVIL_DTO_TO_ENTITY);
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.ESTADOCICIL_ENTITY_TO_DTO);
    }

    //[service] -----------------------------
    @GET
    @Path("/")
    public Response listarEstadoCivil(){

        try{
            LOGGER.info("processing soap request - listarEstadoCivil");

            List<EstadoCivilDTO> EstadoCivilList;

            EstadoCivilList = entityToDtoMapper.map(boundary.listarActividadesPersona());

            return Response.ok(new GenericEntity<List<EstadoCivilDTO>>(EstadoCivilList){}).build();

        }catch (SystemException | BusinessException e){
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
