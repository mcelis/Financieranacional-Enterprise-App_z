package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoDocumentalDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoDocumental;
import co.com.cfn.personas.infrastructure.builder.TipoDocumentalBuilder;

/**
 * Created by zmiranda on 21/02/2017.
 */
public class TipoDocumetalDTOToEntityMapper implements Mapper<TipoDocumentalDTO, TipoDocumental> {

    @Override
    public TipoDocumental map(TipoDocumentalDTO input) throws InfrastructureException {

        return TipoDocumentalBuilder.newInstance()
                .withId(input.getCodigo())
                .withNombre(input.getNombre())
                .withDescripcion(input.getDesripcion())
                .build();
    }
}
