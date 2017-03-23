package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.ActividadPersonaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.ActividadPersona;
import co.com.cfn.personas.infrastructure.builder.ActividadPersonaBuilder;

import java.sql.Timestamp;

public class ActividadPersonaDTOToEntityMapper implements Mapper<ActividadPersonaDTO,ActividadPersona> {

    @Override
    public ActividadPersona map(ActividadPersonaDTO input) throws InfrastructureException {

        return ActividadPersonaBuilder.newInstance()
                .withId(input.getId())
                .withCodigo(input.getCodigo())
                .withNombre(input.getNombre())
                .withTipo(input.getTipo())
                .withCodCobis(input.getCodCobis())
                .withCodPcie(input.getCodPcie())
                .withFechaHoraCreacion(new Timestamp(input.getFechaHoraCreacion().getTime()))
                .withFechaHoraModifica(new Timestamp(input.getFechaHoraModifica().getTime()))
                .withUsuarioCrea(input.getUsuarioCrea())
                .withUsuarioModifica(input.getUsuarioModifica())
                .build();
    }
}
