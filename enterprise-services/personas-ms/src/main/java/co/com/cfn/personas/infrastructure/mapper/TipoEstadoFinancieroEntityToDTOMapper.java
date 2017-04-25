package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoEstadoFinancieroDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoEstadoFinancieroDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoEstadoFinanciero;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 24/4/2017.
 */
public class TipoEstadoFinancieroEntityToDTOMapper implements Mapper<List<TipoEstadoFinanciero>, List<TipoEstadoFinancieroDTO>> {

    @Override
    public List<TipoEstadoFinancieroDTO> map(List<TipoEstadoFinanciero> input) throws InfrastructureException{
        List<TipoEstadoFinancieroDTO> result = new ArrayList<>();
        for (TipoEstadoFinanciero entity : input){
            result.add(TipoEstadoFinancieroDTOBuilder.newInstance()
                    .withId(entity.getTefId())
                    .withNombre(entity.getTefNombre())
                    .withFechaHoraCrea(entity.getTefFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTefFechaHoraModifica())
                    .withUsuarioCrea(entity.getTefUsuarioCrea())
                    .withUsuarioModifica(entity.getTefUsuarioModifica())
                    .build());

        }
        return result;
    }
}
