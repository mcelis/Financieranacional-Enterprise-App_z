package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.EncuestaConocimientoDTO;
import co.com.cfn.foundation.framework.components.builder.EncuestaConocimientoDTOBuilder;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.EncuestaConocimiento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 8/4/2017.
 */
public class EncuestaConocimientoEntityToDTOMapper implements Mapper<List<EncuestaConocimiento>, List<EncuestaConocimientoDTO>> {

    @Override
    public List<EncuestaConocimientoDTO> map(List<EncuestaConocimiento> input) throws InfrastructureException{
        List<EncuestaConocimientoDTO> result = new ArrayList<>();
        for (EncuestaConocimiento entity : input){
            result.add(EncuestaConocimientoDTOBuilder.newInstance()
                    .withId(entity.getEcoId())
                    .withNombre(entity.getEcoNombre())
                    .withUsuarioCrea(entity.getEcoUsuarioCrea())
                    .withUsuarioModifica(entity.getEcoUsuarioModifica())
                    .withFechaHoraCrea(entity.getEcoFechaHoraCrea())
                    .withFechaHoraModifica(entity.getEcoFechaHoraModifica())
                    .build());
        }
        return result;
    }
}
