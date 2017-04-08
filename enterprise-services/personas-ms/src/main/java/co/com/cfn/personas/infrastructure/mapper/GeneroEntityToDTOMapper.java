package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.GeneroDTO;
import co.com.cfn.foundation.framework.components.builder.GeneroDTOBuilder;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.Genero;
import co.com.cfn.personas.infrastructure.builder.GeneroBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 27/3/2017.
 */
public class GeneroEntityToDTOMapper implements Mapper<List<Genero>,List<GeneroDTO>> {

    @Override
    public List<GeneroDTO> map(List<Genero> input) throws InfrastructureException{
        List<GeneroDTO> result = new ArrayList<>();
        for (Genero entity : input){
            result.add(GeneroDTOBuilder.newInstance()
                .withId(entity.getGenId())
                .withCodigo(entity.getGenCodigo())
                .withNombre(entity.getGenNombre())
                .withCodCobis(entity.getGenCodcobis())
                .withCodPCIE(entity.getGenCodpcie())
                .withFechaHoraCrea(entity.getGenFechaHoraCrea())
                .withFechaHoraModifica(entity.getGenFechaModifica())
                .withUsuarioCrea(entity.getGenUsuarioCrea())
                .withUsuarioModifica(entity.getGenUsuarioModifica())
                .build());

        }
        return result;
    }
}
