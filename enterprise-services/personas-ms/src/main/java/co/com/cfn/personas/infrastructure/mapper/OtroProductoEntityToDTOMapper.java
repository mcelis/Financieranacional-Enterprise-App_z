package co.com.cfn.personas.infrastructure.mapper;
import co.com.cfn.foundation.canonical.personas.OtroProductoDTO;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.components.builder.OtroProductoDTOBuilder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.OtroProducto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 6/4/2017.
 */
public class OtroProductoEntityToDTOMapper implements Mapper<List<OtroProducto>,List<OtroProductoDTO>> {

    @Override
    public List<OtroProductoDTO> map(List<OtroProducto> input) throws InfrastructureException {
        List<OtroProductoDTO> result = new ArrayList<>();
        for (OtroProducto entity : input){
            result.add(OtroProductoDTOBuilder.newInstance()
                    .withId(entity.getOprId())
                    .withNombre(entity.getOprNombre())
                    .withFechaHoraCrea(entity.getOprFechaHoraCrea())
                    .withFechaHoraModifica(entity.getOprFechaHoraModifica())
                    .withUsuarioCrea(entity.getOprUsuarioCrea())
                    .withUsuarioModifica(entity.getOprUsuarioModifica())
                    .build());

        }
        return result;
    }
}
