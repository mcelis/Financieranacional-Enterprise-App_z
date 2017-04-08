package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.EstadoCivilDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.EstadoCivil;
import co.com.cfn.personas.infrastructure.builder.EstadoCivilBuilder;

import java.sql.Timestamp;

/**
 * Created by Mark on 27/3/2017.
 */
public class EstadoCivilDTOToEntityMapper implements Mapper<EstadoCivilDTO,EstadoCivil> {

    @Override
    public EstadoCivil map(EstadoCivilDTO input) throws InfrastructureException{
        return EstadoCivilBuilder.newInstance()
                .withId(input.getId())
                .withCodigo(input.getCodigo())
                .withNombre(input.getNombre())
                .withCodCobis(input.getCodCobis())
                .withCodPCIE(input.getCodPCIE())
                .withFechaHoraCrea((Timestamp) input.getFechaHoraCrea())
                .withFechaHoraModifica((Timestamp) input.getFechaHoraModifica())
                .withUsuarioCrea(input.getUsuarioCrea())
                .withUsuarioModifica(input.getUsuarioModifica())
                .build();

    }
}
