package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoCompaniaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoCompaniaDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoCompania;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 18/4/2017.
 */
public class TipoCompaniaEntityToDTOMapper implements Mapper<List<TipoCompania>, List<TipoCompaniaDTO>> {

    @Override
    public List<TipoCompaniaDTO> map(List<TipoCompania> input) throws InfrastructureException{
        List<TipoCompaniaDTO> result = new ArrayList<>();
        for (TipoCompania entity : input){
            result.add(TipoCompaniaDTOBuilder.newInstance()
                    .withId(entity.getTcoId())
                    .withCodigo(entity.getTcoCodigo())
                    .withNombre(entity.getTcoNombre())
                    .withCodCobis(entity.getTcoCodcobis())
                    .withCodPCIE(entity.getTcoCodpcie())
                    .withFechaHoraCrea(entity.getTcoFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTcoFechaHoraModifica())
                    .withUsuarioCrea(entity.getTcoUsuarioCrea())
                    .withUsuarioModifica(entity.getTcoUsuarioModifica())
                    .build());

        }
        return result;
    }
}
