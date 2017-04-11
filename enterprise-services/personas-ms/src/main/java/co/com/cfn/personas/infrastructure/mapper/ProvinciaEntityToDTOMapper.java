package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.ProvinciaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.ProvinciaDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.Provincia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmiranda on 09/04/2017.
 */
public class ProvinciaEntityToDTOMapper implements Mapper<List<Provincia>, List<ProvinciaDTO>> {

    @Override
    public List<ProvinciaDTO> map(List<Provincia> input) throws InfrastructureException {
        List<ProvinciaDTO> result = new ArrayList<>();

        for (Provincia entity : input) {

            result.add(ProvinciaDTOBuilder.newInstance()
                    .withId(entity.getProId())
                    .withCodigo(entity.getProCodigo())
                    .withNombre(entity.getProNombre())
                    .withCodCobis(entity.getProCodcobis())
                    .withCodPCIE(entity.getProCodpcie())
                    .withFechaHoraCrea(entity.getProFechaHoraCrea())
                    .withFechaHoraModifica(entity.getProFechaHoraModifica())
                    .withUsuarioCrea(entity.getProUsuarioCrea())
                    .withUsuarioModifica(entity.getProUsuarioModifica())
                    .withPaisId(entity.getPaiId())
                    .build());
        }
        return result;
    }
}
