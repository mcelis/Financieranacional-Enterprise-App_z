package co.com.cfn.personas.integration.service.rest;

import co.com.cfn.foundation.canonical.personas.TipoIdentificacionDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.personas.business.boundary.TipoIdentificacionManager;
import co.com.cfn.personas.domain.entity.TipoIdentificacion;
import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by zmiranda on 23/03/2017.
 */

@Path("/tipoIdentificacionResouce")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class TipoIdentificacionResource {

    private static Logger LOGGER = LogManager.getLogger(TipoIdentificacionResource.class.getName());

    //[fields] -----------------------------

    @Autowired
    private TipoIdentificacionManager boundary;
    private final Mapper<TipoIdentificacionDTO, TipoIdentificacion> dtoToEntitymapper;
    private final Mapper<List<TipoIdentificacion>, List<TipoIdentificacionDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public TipoIdentificacionResource() {
        dtoToEntitymapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOIDENTIFICACION_DTO_TO_ENTITY);
        entityToDtoMapper = MapperFactory.getInstance().getMapper(MapperFactory.TIPOIDENTIFICACION_ENTITY_TO_DTO);

    }


}
