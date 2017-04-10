package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.PeriodicidadDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.PeriodicidadDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.Periodicidad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmiranda on 09/04/2017.
 */
public class PeriodicidadEntityToDTOMapper implements Mapper<List<Periodicidad>, List<PeriodicidadDTO>> {

    @Override
    public List<PeriodicidadDTO> map(List<Periodicidad> input) throws InfrastructureException {

        List<PeriodicidadDTO> result = new ArrayList<>();

        for (Periodicidad entity : input) {

            result.add(PeriodicidadDTOBuilder.newInstance()
                    .withId(entity.getPedId())
                    .withCodigo(entity.getPedCodigo())
                    .withNombre(entity.getPedNombre())
                    .withNumeroDias(entity.getPedNumeroDias())
                    .withCodCobis(entity.getPedCodcobis())
                    .withCodPCIE(entity.getPedCodpcie())
                    .withFechaHoraCrea(entity.getPedFechaHoraCrea())
                    .withFechaHoraModifica(entity.getPedFechaHoraModifica())
                    .withUsuarioCrea(entity.getPedUsuarioCrea())
                    .withUsuarioModifica(entity.getPedUsuarioModifica())
                    .build());
        }
        return result;
    }
}
