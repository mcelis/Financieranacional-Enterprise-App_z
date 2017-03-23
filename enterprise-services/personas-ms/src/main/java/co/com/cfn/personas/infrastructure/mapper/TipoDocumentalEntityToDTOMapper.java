package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoDocumentalDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoDocumentalDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoDocumental;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmiranda on 21/02/2017.
 */
public class TipoDocumentalEntityToDTOMapper implements Mapper<List<TipoDocumental>, List<TipoDocumentalDTO>> {

    @Override
    public List<TipoDocumentalDTO> map(List<TipoDocumental> input) throws InfrastructureException {

        List<TipoDocumentalDTO> result = new ArrayList<>();

        for (TipoDocumental entity : input) {

            result.add(TipoDocumentalDTOBuilder.newInstance()
                    .withCodigo(entity.getTdoId())
                    .withNombre(entity.getTdoNombre())
                    .withDescripcion(entity.getTdoDescripcion())
                    .build());
        }
        return result;
    }

}
