package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.NacionalidadDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.NacionalidadDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.Nacionalidad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmiranda on 27/03/2017.
 */
public class NacionalidadEntityToDTOMapper implements Mapper<List<Nacionalidad>, List<NacionalidadDTO>> {

    @Override
    public List<NacionalidadDTO> map(List<Nacionalidad> input) throws InfrastructureException {

        List<NacionalidadDTO> result = new ArrayList<>();

        for (Nacionalidad entity : input) {

            result.add(NacionalidadDTOBuilder.newInstance()
                    .withId(entity.getNacId())
                    .withCodigo(entity.getNacCodigo())
                    .withNombre(entity.getNacNombre())
                    .withCodCobis(entity.getNacCodcobis())
                    .withCodPCIE(entity.getNacCodpcie())
                    .withFechaHoraCrea(entity.getNacFechaHoraCrea())
                    .withFechaHoraModifica(entity.getNacFechaHoraModifica())
                    .withUsuarioCrea(entity.getNacUsuarioCrea())
                    .withUsuarioModifica(entity.getNacUsuarioModifica())
                    .build());
        }
        return result;
    }
}
