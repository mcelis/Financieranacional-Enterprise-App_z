package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.MotivoRechazoSolicitudDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.MotivoRechazoSolicitudDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.MotivoRechazoSolicitud;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 8/4/2017.
 */
public class MotivoRechazoSolicitudEntityToDTOMapper implements Mapper<List<MotivoRechazoSolicitud>, List<MotivoRechazoSolicitudDTO>> {

    @Override
    public List<MotivoRechazoSolicitudDTO> map(List<MotivoRechazoSolicitud> input) throws InfrastructureException{

        List<MotivoRechazoSolicitudDTO> result = new ArrayList<>();

        for (MotivoRechazoSolicitud entity : input){
            result.add(MotivoRechazoSolicitudDTOBuilder.newInstance()
                    .withId(entity.getMrsId())
                    .withNombre(entity.getMrsNombre())
                    .withFechaHoraCrea(entity.getMrsFechaHoraCrea())
                    .withFechaHoraModifica(entity.getMrsFechaHoraModifica())
                    .withUsuarioCrea(entity.getMrsUsuarioCrea())
                    .withUsuarioModifica(entity.getMrsUsuarioModifica())
                    .withAbrevMacroProceso(entity.getMrsAbrevMacroProceso())
                    .build());
        }

        return result;
    }
}
