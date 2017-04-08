package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoTramiteDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoTramite;
import co.com.cfn.personas.infrastructure.builder.TipoTramiteBuilder;

import java.sql.Timestamp;

/**
 * Created by Mark on 26/3/2017.
 */
public class TipoTramiteDTOToEntityMapper implements Mapper<TipoTramiteDTO,TipoTramite> {
    @Override
    public TipoTramite map(TipoTramiteDTO input) throws InfrastructureException{
        return TipoTramiteBuilder.newInstance()
                .withId(input.getId())
                .withNombre(input.getNombre())
                .withUsuarioCrea(input.getUsuarioCrea())
                .withUsuarioModifica(input.getUsuarioModifica())
                .withFechaHoraCrea((Timestamp) input.getFechaHoraCrea())
                .withFechaHoraModifica((Timestamp) input.getFechaHoraModifica())
                .withSePuedeVolverSolF(input.getSePuedeVolverSolF())
                .build();
    }
}
