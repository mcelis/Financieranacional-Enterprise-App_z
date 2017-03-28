package co.com.cfn.personas.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import co.com.cfn.foundation.canonical.personas.GeneroDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.GeneroManager;
import co.com.cfn.personas.domain.entity.Genero;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Mark on 27/3/2017.
 */
@Path("/generoResource")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class GeneroResource {

    private static Logger LOGGER = LogManager.getLogger(GeneroResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private GeneroManager boundary;
    private final Mapper<GeneroDTO,Genero> dtoToEntitymapper;
    private final Mapper<List<Genero>, List<GeneroDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public GeneroResource(){
        dtoToEntitymapper = MapperFactory.getInstance().getMapper(MapperFactory.GENERO_DTO_TO_ENTITY);
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.GENERO_ENTITY_TO_DTO);

    }

    //[service] -----------------------------

    @GET
    @Path("/")
    public Response listarGenero(){

        try{
            LOGGER.info("processing soap request - listartipoIdentificacion ");
            List<GeneroDTO> GeneroList;
            GeneroList = entityToDtoMapper.map(boundary.listarActividadesPersona());
            return Response.ok(new GenericEntity<List<GeneroDTO>>(GeneroList){}).build();
        } catch (SystemException | BusinessException e){
            return  Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }
}
