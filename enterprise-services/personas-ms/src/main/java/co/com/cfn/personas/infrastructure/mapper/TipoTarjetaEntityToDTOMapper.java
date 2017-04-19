package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoTarjetaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoTarjetaDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoTarjeta;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 12/4/2017.
 */
public class TipoTarjetaEntityToDTOMapper implements Mapper<List<TipoTarjeta>, List<TipoTarjetaDTO>> {

    @Override
    public List<TipoTarjetaDTO> map(List<TipoTarjeta> input) throws InfrastructureException{
        List<TipoTarjetaDTO> result = new ArrayList<>();
        for (TipoTarjeta entity : input){
            result.add(TipoTarjetaDTOBuilder.newInstance()
                    .withId(entity.getTtaId())
                    .withCodigo(entity.getTtaCodigo())
                    .withNombre(entity.getTtaNombre())
                    .withCodCobis(entity.getTtaCodcobis())
                    .withCodPCIE(entity.getTtaCodpcie())
                    .withFechaHoraCrea(entity.getTtaFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTtaFechaHoraModifica())
                    .withUsuarioCrea(entity.getTtaUsuarioCrea())
                    .withUsuarioModifica(entity.getTtaUsuarioModifica())
                    .build());

        }
        return result;
    }
}
