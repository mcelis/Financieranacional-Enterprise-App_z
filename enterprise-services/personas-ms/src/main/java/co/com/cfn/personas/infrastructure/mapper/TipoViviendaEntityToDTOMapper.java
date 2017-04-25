package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoViviendaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoViviendaDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoVivienda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 24/4/2017.
 */
public class TipoViviendaEntityToDTOMapper implements Mapper<List<TipoVivienda>, List<TipoViviendaDTO>> {

    @Override
    public List<TipoViviendaDTO> map(List<TipoVivienda> input) throws InfrastructureException{
        List<TipoViviendaDTO> result = new ArrayList<>();
        for (TipoVivienda entity : input){
            result.add(TipoViviendaDTOBuilder.newInstance()
                    .withId(entity.getTviId())
                    .withCodigo(entity.getTviCodigo())
                    .withNombre(entity.getTviNombre())
                    .withCodCobis(entity.getTviCodcobis())
                    .withCodPCIE(entity.getTviCodpcie())
                    .withFechaHoraCrea(entity.getTviFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTviFechaHoraModifica())
                    .withUsuarioCrea(entity.getTviUsuarioCrea())
                    .withUsuarioModifica(entity.getTviUsuarioModifica())
                    .build());

        }
        return result;
    }
}
