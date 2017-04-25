package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoUnidadMedidaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoUnidadMedidaDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoUnidadMedida;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 24/4/2017.
 */
public class TipoUnidadMedidaEntityToDTOMapper implements Mapper<List<TipoUnidadMedida>, List<TipoUnidadMedidaDTO>> {

    @Override
    public List<TipoUnidadMedidaDTO> map(List<TipoUnidadMedida> input) throws InfrastructureException{
        List<TipoUnidadMedidaDTO> result = new ArrayList<>();
        for (TipoUnidadMedida entity : input){
            result.add(TipoUnidadMedidaDTOBuilder.newInstance()
                    .withId(entity.getTumId())
                    .withNombre(entity.getTumNombre())
                    .withFechaHoraCrea(entity.getTumFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTumFechaHoraModifica())
                    .withUsuarioCrea(entity.getTumUsuarioCrea())
                    .withUsuarioModifica(entity.getTumUsuarioModifica())
                    .build());

        }
        return result;
    }
}
