package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoPersonaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoPersonaDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoPersona;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 22/4/2017.
 */
public class TipoPersonaEntityToDTOMapper implements Mapper<List<TipoPersona>, List<TipoPersonaDTO>> {

    @Override
    public List<TipoPersonaDTO> map(List<TipoPersona> input) throws InfrastructureException{
        List<TipoPersonaDTO> result = new ArrayList<>();
        for (TipoPersona entity : input){
            result.add(TipoPersonaDTOBuilder.newInstance()
                    .withId(entity.getTpeId())
                    .withNombre(entity.getTpeNombre())
                    .withUsuarioCrea(entity.getTpeUsuarioCrea())
                    .withUsuarioModifica(entity.getTpeUsuarioModifica())
                    .withFechaHoraCrea(entity.getTpeFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTpeFechaHoraModifica())
                    .build());

        }
        return result;
    }
}
