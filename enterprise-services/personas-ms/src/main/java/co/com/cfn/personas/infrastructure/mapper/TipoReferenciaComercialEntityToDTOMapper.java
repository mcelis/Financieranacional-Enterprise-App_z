package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoReferenciaComercialDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoReferenciaComercialDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoReferenciaComercial;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 24/4/2017.
 */
public class TipoReferenciaComercialEntityToDTOMapper implements Mapper<List<TipoReferenciaComercial>, List<TipoReferenciaComercialDTO>> {

    @Override
    public List<TipoReferenciaComercialDTO> map(List<TipoReferenciaComercial> input) throws InfrastructureException{
        List<TipoReferenciaComercialDTO> result = new ArrayList<>();
        for (TipoReferenciaComercial entity : input){
            result.add(TipoReferenciaComercialDTOBuilder.newInstance()
                    .withId(entity.getTrcId())
                    .withCodigo(entity.getTrcCodigo())
                    .withNombre(entity.getTrcNombre())
                    .withCodCobis(entity.getTrcCodcobis())
                    .withCodPCIE(entity.getTrcCodpcie())
                    .withFechaHoraCrea(entity.getTrcFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTrcFechaHoraModifica())
                    .withUsuarioCrea(entity.getTrcUsuarioCrea())
                    .withUsuarioModifica(entity.getTrcUsuarioModifica())
                    .build());

        }
        return result;
    }
}
