package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoIdentificacionDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoIdentificacionDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoIdentificacion;
import co.com.cfn.personas.infrastructure.builder.TipoIdentificacionBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmiranda on 22/03/2017.
 */
public class TipoIdentificacionEntityToDTOMapper implements Mapper<List<TipoIdentificacion>, List<TipoIdentificacionDTO>> {
    @Override
    public List<TipoIdentificacionDTO> map(List<TipoIdentificacion> input) throws InfrastructureException {

        List<TipoIdentificacionDTO> result = new ArrayList<>();

        for (TipoIdentificacion entity : input) {

            result.add(TipoIdentificacionDTOBuilder.newInstance()
                    .withId(entity.getTidId())
                    .withCodigo(entity.getTidCodigo())
                    .withNombre(entity.getTidNombre())
                    .withCodCobis(entity.getTidCodcobis())
                    .withCodPCIE(entity.getTidCodpcie())
                    .withFechaHoraCrea(entity.getTidFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTidFechaHoraModifica())
                    .withUsuarioCrea(entity.getTidUsuarioCrea())
                    .withUsuarioModifica(entity.getTidUsuarioModifica())
                    .build());
        }
        return result;

    }
}
