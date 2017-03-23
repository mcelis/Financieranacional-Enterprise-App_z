package co.com.cfn.personas.integration.service.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.cfn.foundation.canonical.personas.ActividadPersonaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.business.boundary.PersonasMananger;
import co.com.cfn.personas.domain.entity.ActividadPersona;

import static co.com.cfn.personas.infrastructure.mapper.MapperFactory.*;

import co.com.cfn.personas.infrastructure.mapper.MapperFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * CFN Generic Artifact
 * Author: Admnistrator
 * Created: 4-Ene-2017*
 * Type: JAVA class Artifact
 * Purpose: SOAP Integration Service
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */

@WebService(targetNamespace = "http://cfn.com/soa-artifacts/services/personas/1.0.0")
public class ActividadesPersonasWS {

    private static Logger LOGGER = LogManager.getLogger(ActividadesPersonasWS.class.getName());

    //[fields] -----------------------------

    @Autowired
    private PersonasMananger boundary;
    private final Mapper<ActividadPersonaDTO, ActividadPersona> dtoToEntitymapper;
    private final Mapper<List<ActividadPersona>,List<ActividadPersonaDTO>> entityToDtoMapper;

    //[constructor] -----------------------------

    public ActividadesPersonasWS() {
        dtoToEntitymapper = MapperFactory.getInstance().getMapper(PERSONA_DTO_TO_ENTITY);
        entityToDtoMapper = MapperFactory.getInstance().getMapper(PERSONA_ENTITY_TO_DTO);

    }


    //[service] -----------------------------

    @WebMethod(operationName = "crearPersona", action = "crearPersona")
    public void crearPersona(@WebParam(name = "persona") ActividadPersonaDTO persona) throws SystemException, BusinessException {

        LOGGER.info("processing soap request - crearPersona: {}", persona.toString());
        boundary.crearPersona(dtoToEntitymapper.map(persona));
    }


    //[service] -----------------------------

    @WebMethod(operationName = "listarActividadesPersona", action = "listarActividadesPersona")
    public List<ActividadPersonaDTO> listarActividadesPersona() throws SystemException, BusinessException{

        LOGGER.info("processing soap request - listarActividadesPersona ");
        return entityToDtoMapper.map(boundary.listarActividadesPersona());
    }


}
