package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.NivelEstudioDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.NivelEstudioDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.NivelEstudio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmiranda on 27/03/2017.
 */
public class NivelEstudioEntityToDTOMapper implements Mapper<List<NivelEstudio>, List<NivelEstudioDTO>> {
    @Override
    public List<NivelEstudioDTO> map(List<NivelEstudio> input) throws InfrastructureException {

        List<NivelEstudioDTO> result = new ArrayList<>();

        for (NivelEstudio entity : input) {

            result.add(NivelEstudioDTOBuilder.newInstance()
                    .withId(entity.getNesId())
                    .withCodigo(entity.getNesCodigo())
                    .withNombre(entity.getNesNombre())
                    .withCodCobis(entity.getNesCodcobis())
                    .withCodPCIE(entity.getNesCodpcie())
                    .withFechaHoraCrea(entity.getNesFechaHoraCrea())
                    .withFechaHoraModifica(entity.getNesFechaHoraModifica())
                    .withUsuarioCrea(entity.getNesUsuarioCrea())
                    .withUsuarioModifica(entity.getNesUsuarioModifica())
                    .build());
        }
        return result;
    }
}
