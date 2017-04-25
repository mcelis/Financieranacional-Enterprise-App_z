package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoDireccionDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoDireccionDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoDireccion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 24/4/2017.
 */
public class TipoDireccionEntityToDTOManager implements Mapper<List<TipoDireccion>,List<TipoDireccionDTO>> {

    @Override
    public List<TipoDireccionDTO> map(List<TipoDireccion> input) throws InfrastructureException{
        List<TipoDireccionDTO> result = new ArrayList<>();
        for (TipoDireccion entity : input){
            result.add(TipoDireccionDTOBuilder.newInstance()
                    .withId(entity.getTdrId())
                    .withCodigo(entity.getTdrCodigo())
                    .withNombre(entity.getTdrNombre())
                    .withCodCobis(entity.getTdrCodcobis())
                    .withCodPCIE(entity.getTdrCodpcie())
                    .withFechaHoraCrea(entity.getTdrFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTdrFechaHoraModifica())
                    .withUsuarioCrea(entity.getTdrUsuarioModifica())
                    .withUsuarioModifica(entity.getTdrUsuarioModifica())
                    .build());

        }
        return result;
    }
}
