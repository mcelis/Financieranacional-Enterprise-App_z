package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.TipoCuentaDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.TipoCuentaDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoCuenta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 18/4/2017.
 */
public class TipoCuentaEntityToDTOMapper implements Mapper<List<TipoCuenta>,List<TipoCuentaDTO>> {

    @Override
    public List<TipoCuentaDTO> map(List<TipoCuenta> input) throws InfrastructureException{
        List<TipoCuentaDTO> result = new ArrayList<>();
        for (TipoCuenta entity : input){
            result.add(TipoCuentaDTOBuilder.newInstance()
                    .withId(entity.getTcuId())
                    .withCodigo(entity.getTcuCodigo())
                    .withNombre(entity.getTcuNombre())
                    .withCodCobis(entity.getTcuCodcobis())
                    .withCodPCIE(entity.getTcuCodpcie())
                    .withFechaHoraCrea(entity.getTcuFechaHoraCrea())
                    .withFechaHoraModifica(entity.getTcuFechaHoraModifica())
                    .withUsuarioCrea(entity.getTcuUsuarioCrea())
                    .withUsuarioModifica(entity.getTcuUsuarioModifica())
                    .build());

        }
        return result;
    }
}
