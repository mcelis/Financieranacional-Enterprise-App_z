package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.OficinaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.OficinaDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.Oficina;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmiranda on 08/04/2017.
 */
public class OficinaEntityToDTOMapper implements Mapper<List<Oficina>, List<OficinaDTO>> {

    @Override
    public List<OficinaDTO> map(List<Oficina> input) throws InfrastructureException {
        List<OficinaDTO> result = new ArrayList<>();

        for (Oficina entity : input) {

            result.add(OficinaDTOBuilder.newInstance()
                    .withId(entity.getId())
                    .withCodigo(entity.getCodigo())
                    .withNombre(entity.getNombre())
                    .build());
        }
        return result;
    }
}
