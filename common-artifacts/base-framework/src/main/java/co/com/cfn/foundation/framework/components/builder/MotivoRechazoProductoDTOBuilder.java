package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.MotivoRechazoProductoDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 8/4/2017.
 */
public class MotivoRechazoProductoDTOBuilder implements Builder<MotivoRechazoProductoDTO> {

    private Integer id;
    private String nombre;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public MotivoRechazoProductoDTOBuilder(){
    }

    public static MotivoRechazoProductoDTOBuilder newInstance(){
        return new MotivoRechazoProductoDTOBuilder();
    }

    public MotivoRechazoProductoDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }


    public MotivoRechazoProductoDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }


    public MotivoRechazoProductoDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public MotivoRechazoProductoDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public MotivoRechazoProductoDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public MotivoRechazoProductoDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public MotivoRechazoProductoDTO build() throws InfrastructureException{
        return new MotivoRechazoProductoDTO(id, nombre,  fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }


}
