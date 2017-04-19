package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.ActividadEconomicaDTO;
import co.com.cfn.foundation.framework.components.builder.ActividadEconomicaDTOBuilder;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.ActividadEconomica;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 17/4/2017.
 */
public class ActividadEconomicaEntityToDTOMapper implements Mapper<List<ActividadEconomica>, List<ActividadEconomicaDTO>> {

    @Override
    public List<ActividadEconomicaDTO> map(List<ActividadEconomica> input) throws InfrastructureException {
        List<ActividadEconomicaDTO> result = new ArrayList<>();

        for (ActividadEconomica entity : input){
            result.add(ActividadEconomicaDTOBuilder.newInstance()
                    .withaecId(entity.getAecId())
                    .withNombre(entity.getAecNombre())
                    .withCodCobis(entity.getAecCodcobis())
                    .withCodPCIE(entity.getAecCodpcie())
                    .withFechaHoraCrea(entity.getAecFechaHoraCrea())
                    .withFechaHoraModifica(entity.getAecFechaHoraModifica())
                    .withUsuarioCrea(entity.getAecUsuarioCrea())
                    .withUsuarioModifica(entity.getAecUsuarioModifica())
                    .build());
        }
        return result;
    }
}
