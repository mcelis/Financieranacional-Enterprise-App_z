package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoGarantiaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoGarantiaDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoGarantia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 21/4/2017.
 */
public class TipoGarantiaEntityToDTOMapper implements Mapper<List<TipoGarantia>, List<TipoGarantiaDTO>> {

    @Override
    public List<TipoGarantiaDTO> map(List<TipoGarantia> input) throws InfrastructureException{
        List<TipoGarantiaDTO> result = new ArrayList<>();
        for (TipoGarantia entity : input){
            result.add(TipoGarantiaDTOBuilder.newInstance()
                    .withId(entity.getTgaId())
                    .withNombre(entity.getTgaNombre())
                    .withNivel(entity.getTgaNivel())
                    .withIdPadre(entity.getTgaIdPadre())
                    .withCodCobis(entity.getTgaCodcobis())
                    .withCodPCIE(entity.getTgaCodcobis())
                    .withFechaHoraCrea(entity.getTgaFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTgaFechaHoraModifica())
                    .withUsuarioCrea(entity.getTgaUsuarioCrea())
                    .withUsuarioModifica(entity.getTgaUsuarioModifica())
                    .build());

        }
        return result;
    }
}
