package co.com.cfn.personas.infrastructure.mapper;

import co.com.cfn.foundation.canonical.personas.GrupoEtnicoDTO;
import co.com.cfn.foundation.framework.components.builder.GrupoEtnicoDTOBuilder;
import co.com.cfn.foundation.framework.components.builder.Mapper;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.GrupoEtnico;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark on 28/3/2017.
 */
public class GrupoEtnicoEntityToDTOMapper implements Mapper<List<GrupoEtnico>, List<GrupoEtnicoDTO>> {

    @Override
    public List<GrupoEtnicoDTO> map(List<GrupoEtnico> input) throws InfrastructureException{
        List<GrupoEtnicoDTO> result  = new ArrayList<>();

        for (GrupoEtnico entity : input){
            result.add(GrupoEtnicoDTOBuilder.newInstance()
                    .withId(entity.getGetId())
                    .withCodigo(entity.getGetCodigo())
                    .withNombre(entity.getGetNombre())
                    .withCodCobis(entity.getGetCodcobis())
                    .withCodPCIE(entity.getGetCodcobis())
                    .withFechaHoraCrea(entity.getGetFechaHoraCrea())
                    .withFechaHoraModifica(entity.getGetFechaHoraModifica())
                    .withUsuarioCrea(entity.getGetUsuarioCrea())
                    .withUsuarioModifica(entity.getGetUsuarioModifica())
                    .build());
        }
        return result;
    }
}
