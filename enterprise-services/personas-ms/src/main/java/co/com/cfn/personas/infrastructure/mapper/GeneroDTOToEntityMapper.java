package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.GeneroDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.Genero;
import co.com.cfn.personas.infrastructure.builder.GeneroBuilder;

import java.sql.Timestamp;

/**
 * Created by Mark on 27/3/2017.
 */
public class GeneroDTOToEntityMapper implements Mapper<GeneroDTO, Genero> {

    @Override
    public Genero map(GeneroDTO input) throws InfrastructureException{
        return GeneroBuilder.newInstance()
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



