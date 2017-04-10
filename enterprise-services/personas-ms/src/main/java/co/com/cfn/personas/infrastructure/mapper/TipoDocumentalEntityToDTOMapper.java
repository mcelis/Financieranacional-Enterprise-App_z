package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoDocumentalDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoDocumentalDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoDocumental;

import java.sql.Timestamp;
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
                    .withId(entity.getTdoId())
                    .withNombre(entity.getTdoNombre())
                    .withUsuarioCrea(entity.getTdoUsuarioCrea())
                    .withUsuarioModifica(entity.getTdoUsuarioModifica())
                    .withFechaHoraCrea((Timestamp) entity.getTdoFechaHoraCrea())
                    .withFechaHoraModifica((Timestamp) entity.getTdoFechaHoraModifica())
                    .withDescripcion(entity.getTdoDescripcion())
                    .withMesesVigencia(entity.getTdoMesesVigencia())
                    .withEsAnexoF(entity.getTdoEsAnexoF())
                    .build());
        }
        return result;
    }

}
