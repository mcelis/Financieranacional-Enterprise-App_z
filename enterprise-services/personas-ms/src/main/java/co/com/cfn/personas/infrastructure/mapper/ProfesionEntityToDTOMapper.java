package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.ProfesionDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.ProfesionDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.Profesion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmiranda on 27/03/2017.
 */
public class ProfesionEntityToDTOMapper implements Mapper<List<Profesion>, List<ProfesionDTO>> {

    @Override
    public List<ProfesionDTO> map(List<Profesion> input) throws InfrastructureException {
        List<ProfesionDTO> result = new ArrayList<>();

        for (Profesion entity : input) {

            result.add(ProfesionDTOBuilder.newInstance()
                    .withId(entity.getPrfId())
                    .withCodigo(entity.getPrfCodigo())
                    .withNombre(entity.getPrfNombre())
                    .withCodCobis(entity.getPrfCodcobis())
                    .withCodPCIE(entity.getPrfCodpcie())
                    .withFechaHoraCrea(entity.getPrfFechaHoraCrea())
                    .withFechaHoraModifica(entity.getPrfFechaHoraModifica())
                    .withUsuarioCrea(entity.getPrfUsuarioCrea())
                    .withUsuarioModifica(entity.getPrfUsuarioModifica())
                    .build());
        }
        return result;
    }
}
