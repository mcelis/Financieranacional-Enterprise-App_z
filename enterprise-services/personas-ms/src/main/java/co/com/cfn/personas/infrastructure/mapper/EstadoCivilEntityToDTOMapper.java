package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.EstadoCivilDTO;
import co.com.cfn.foundation.framework.components.builder.EstadoCivilDTOBuilder;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.EstadoCivil;
import co.com.cfn.personas.infrastructure.builder.EstadoCivilBuilder;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 27/3/2017.
 */
public class EstadoCivilEntityToDTOMapper implements Mapper<List<EstadoCivil>,List<EstadoCivilDTO>>{

    @Override
    public List<EstadoCivilDTO> map(List<EstadoCivil> input) throws InfrastructureException{
        List<EstadoCivilDTO> result = new ArrayList<>();
        for (EstadoCivil entity : input) {

            result.add(EstadoCivilDTOBuilder.newInstance()
                    .withId(entity.getEcvId())
                    .withCodigo(entity.getEcvCodigo())
                    .withNombre(entity.getEcvNombre())
                    .withCodCobis(entity.getEcvCodcobis())
                    .withCodPCIE(entity.getEcvCodpcie())
                    .withFechaHoraCrea((Timestamp) entity.getEcvFechaHoraCrea())
                    .withFechaHoraModifica((Timestamp) entity.getEcvFechaHoraModifica())
                    .withUsuarioCrea(entity.getEcvUsuarioCrea())
                    .withUsuarioModifica(entity.getEcvUsuarioModifica())
                    .build());
        }
        return result;
    }
}
