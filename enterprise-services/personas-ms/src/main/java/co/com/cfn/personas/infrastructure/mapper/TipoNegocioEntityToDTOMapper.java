package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoNegocioDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoNegocioDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoNegocio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 21/4/2017.
 */
public class TipoNegocioEntityToDTOMapper implements Mapper<List<TipoNegocio>, List<TipoNegocioDTO>> {

    @Override
    public List<TipoNegocioDTO> map(List<TipoNegocio> input) throws InfrastructureException{
        List<TipoNegocioDTO> result = new ArrayList<>();
        for (TipoNegocio entity : input){
            result.add(TipoNegocioDTOBuilder.newInstance()
                    .withId(entity.getTneId())
                    .withNombre(entity.getTneNombre())
                    .withFechaHoraCrea(entity.getTneFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTneFechaHoraModifica())
                    .withUsuarioCrea(entity.getTneUsuarioCrea())
                    .withUsuarioModifica(entity.getTneUsuarioModifica())
                    .build());

        }
        return result;
    }
}
