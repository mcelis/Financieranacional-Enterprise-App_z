package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.MotivoRechazoProductoDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.MotivoRechazoProductoDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.MotivoRechazoProducto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 8/4/2017.
 */
public class MotivoRechazoProductoEntityToDTOMapper implements Mapper<List<MotivoRechazoProducto>, List<MotivoRechazoProductoDTO>>{

    @Override
    public List<MotivoRechazoProductoDTO> map(List<MotivoRechazoProducto> input) throws InfrastructureException{

        List<MotivoRechazoProductoDTO> result = new ArrayList<>();

        for(MotivoRechazoProducto entity : input) {
            result.add(MotivoRechazoProductoDTOBuilder.newInstance()
                    .withId(entity.getMrpId())
                    .withNombre(entity.getMrpNombre())
                    .withFechaHoraCrea(entity.getMrpFechaHoraCrea())
                    .withFechaHoraModifica(entity.getMrpFechaHoraModifica())
                    .withUsuarioCrea(entity.getMrpUsuarioCrea())
                    .withUsuarioModifica(entity.getMrpUsuarioModifica())
                    .build());

        }
        return result;
    }
}
