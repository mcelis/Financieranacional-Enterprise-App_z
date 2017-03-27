package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoTramiteDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoTramiteDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoTramite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 26/3/2017.
 */
public class TipoTramiteEntityToDTOMapper implements Mapper<List<TipoTramite>,List<TipoTramiteDTO>> {
    @Override
    public List<TipoTramiteDTO> map(List<TipoTramite> input) throws InfrastructureException {
        List<TipoTramiteDTO> result = new ArrayList<>();

        for(TipoTramite entity : input){

            result.add(TipoTramiteDTOBuilder.newInstance()
                    .withId(entity.getTtrId())
                    .withNombre(entity.getTtrNombre())
                    .withUsuarioCrea(entity.getTtrUsuarioCrea())
                    .withUsuarioModifica(entity.getTtrUsuarioModifica())
                    .withFechaHoraCrea(entity.getTtrFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTtrFechaHoraModifica())
                    .withSePuedeVolverSolF(entity.getTtrSePuedeVolverSolF())
                    .build());
        }
        return result;
    }
}
