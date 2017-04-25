package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoTerceroDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoTerceroDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoTercero;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 24/4/2017.
 */
public class TipoTerceroEntityToDTOMapper implements Mapper<List<TipoTercero>, List<TipoTerceroDTO>> {

    @Override
    public List<TipoTerceroDTO> map(List<TipoTercero> input) throws InfrastructureException{
        List<TipoTerceroDTO> result = new ArrayList<>();
        for (TipoTercero entity : input){
            result.add(TipoTerceroDTOBuilder.newInstance()
                    .withId(entity.getTteId())
                    .withNombre(entity.getTteNombre())
                    .withFechaHoraCrea(entity.getTteFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTteFechaHoraModifica())
                    .withUsuarioCrea(entity.getTteUsuarioCrea())
                    .withUsuarioModifica(entity.getTteUsuarioModifica())
                    .build());

        }
        return result;
    }
}
