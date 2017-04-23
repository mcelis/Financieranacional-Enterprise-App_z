package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoProyectoDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoProyectoDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoProyecto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 21/4/2017.
 */
public class TipoProyectoEntityToDTOMapper implements Mapper<List<TipoProyecto>,List<TipoProyectoDTO>> {

    @Override
    public List<TipoProyectoDTO> map(List<TipoProyecto> input) throws InfrastructureException{
        List<TipoProyectoDTO> result = new ArrayList<>();
        for (TipoProyecto entity : input){
            result.add(TipoProyectoDTOBuilder.newInstance()
                    .withId(entity.getTprId())
                    .withNombre(entity.getTprNombre())
                    .withUsuarioCrea(entity.getTprUsuarioCrea())
                    .withUsuarioModifica(entity.getTprUsuarioModifica())
                    .withFechaHoraCrea(entity.getTprFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTprFechaHoraModifica())
                    .build());

        }
        return result;
    }
}
