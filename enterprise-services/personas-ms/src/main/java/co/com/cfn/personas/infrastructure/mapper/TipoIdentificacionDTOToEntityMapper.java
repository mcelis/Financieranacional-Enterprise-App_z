package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoIdentificacionDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoIdentificacion;
import co.com.cfn.personas.infrastructure.builder.TipoIdentificacionBuilder;

import java.sql.Timestamp;

/**
 * Created by zmiranda on 22/03/2017.
 */
public class TipoIdentificacionDTOToEntityMapper implements Mapper<TipoIdentificacionDTO,TipoIdentificacion> {

    @Override
    public TipoIdentificacion map(TipoIdentificacionDTO input) throws InfrastructureException {
        return TipoIdentificacionBuilder.newInstance()
                .withId(input.getId())
                .withCodigo(input.getCodigo())
                .withNombre(input.getNombre())
                .withCodCobis(input.getCodCobis())
                .withCodPCIE(input.getCodPCIE())
                .withFechaHoraCrea(new Timestamp(input.getFechaHoraCrea().getTime()))
                .withFechaHoraModifica(new Timestamp(input.getFechaHoraModifica().getTime()))
                .withUsuarioCrea(input.getUsuarioCrea())
                .withUsuarioModifica(input.getUsuarioModifica())
                .build();
    }
}
