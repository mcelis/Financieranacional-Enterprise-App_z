package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.DestinoEconomicoDTO;
import co.com.cfn.foundation.framework.components.builder.DestinoEconomicoDTOBuilder;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.DestinoEconomico;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 5/4/2017.
 */
public class DestinoEconomicoEntityToDTOMapper implements Mapper<List<DestinoEconomico>, List<DestinoEconomicoDTO>>{

    @Override
    public List<DestinoEconomicoDTO> map(List<DestinoEconomico> input) throws InfrastructureException{
        List<DestinoEconomicoDTO> result = new ArrayList<>();

        for (DestinoEconomico entity : input){
            result.add(DestinoEconomicoDTOBuilder.newInstance()
                    .withId(entity.getDecId())
                    .withCodigo(entity.getDecCodigo())
                    .withNombre(entity.getDecNombre())
                    .withCodCobis(entity.getDecCodcobis())
                    .withCodPCIE(entity.getDecCodpcie())
                    .withFechaHoraCrea(entity.getDecFechaHoraCrea())
                    .withFechaHoraModifica(entity.getDecFechaHoraModifica())
                    .withUsuarioCrea(entity.getDecUsuarioCrea())
                    .withUsuarioModifica(entity.getDecUsuarioModifica())
                    .build());
        }
        return result;
    }
}
