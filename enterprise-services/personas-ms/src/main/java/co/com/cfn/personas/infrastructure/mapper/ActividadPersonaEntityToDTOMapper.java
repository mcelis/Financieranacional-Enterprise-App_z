package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.ActividadPersonaDTO;
import co.com.cfn.foundation.framework.components.builder.ActividadPersonaDTOBuilder;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.ActividadPersona;
import co.com.cfn.personas.infrastructure.builder.ActividadPersonaBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by administrador_1 on 09/01/2017.
 */
public class ActividadPersonaEntityToDTOMapper implements Mapper<List<ActividadPersona>, List<ActividadPersonaDTO>> {


    @Override
    public List<ActividadPersonaDTO> map(List<ActividadPersona> input) throws InfrastructureException {

        List<ActividadPersonaDTO> result = new ArrayList<>();

        for (ActividadPersona entity : input) {

            result.add(ActividadPersonaDTOBuilder.newInstance()
                    .withId(entity.getAcpId())
                    .withCodigo(entity.getAcpCodigo())
                    .withNombre(entity.getAcpNombre())
                    .withTipo(entity.getAcpTipo())
                    .withCodCobis(entity.getAcpCodcobis())
                    .withCodPcie(entity.getAcpCodpcie())
                    .withFechaHoraCreacion(entity.getAcpFechaHoraCrea())
                    .withFechaHoraModifica(entity.getAcpFechaHoraModifica())
                    .withUsuarioCrea(entity.getAcpUsuarioCrea())
                    .withUsuarioModifica(entity.getAcpUsuarioModifica())
                    .build());
        }
        return result;
    }

}
