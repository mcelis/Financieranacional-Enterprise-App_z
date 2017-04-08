package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.DestinoFinancieroDTO;
import co.com.cfn.foundation.framework.components.builder.DestinoFinancieroDTOBuilder;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.DestinoFinanciero;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 6/4/2017.
 */
public class DestinoFinancieroEntityToDTOMapper implements Mapper<List<DestinoFinanciero>, List<DestinoFinancieroDTO>> {

    @Override
    public List<DestinoFinancieroDTO> map(List<DestinoFinanciero> input) throws InfrastructureException{
        List<DestinoFinancieroDTO> result = new ArrayList<>();

        for (DestinoFinanciero entity : input){
            result.add(DestinoFinancieroDTOBuilder.newInstance()
                    .withId(entity.getDfiId())
                    .withCodigo(entity.getDfiCodigo())
                    .withNombre(entity.getDfiNombre())
                    .withCodCobis(entity.getDfiCodcobis())
                    .withCodPCIE(entity.getDfiCodpcie())
                    .withFechaHoraCrea(entity.getDfiFechaHoraCrea())
                    .withFechaHoraModifica(entity.getDfiFechaHoraModifica())
                    .withUsuarioCrea(entity.getDfiUsuarioCrea())
                    .withUsuarioModifica(entity.getDfiUsuarioModifica())
                    .build());
        }
        return result;
    }
}
