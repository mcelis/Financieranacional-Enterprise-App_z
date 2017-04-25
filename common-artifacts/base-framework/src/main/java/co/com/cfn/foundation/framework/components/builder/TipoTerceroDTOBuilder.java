package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoTerceroDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 24/4/2017.
 */
public class TipoTerceroDTOBuilder implements Builder<TipoTerceroDTO> {

    private Integer id;
    private String nombre;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoTerceroDTOBuilder(){
    }

    public static TipoTerceroDTOBuilder newInstance(){
        return new TipoTerceroDTOBuilder();
    }

    public TipoTerceroDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }


    public TipoTerceroDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public TipoTerceroDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoTerceroDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoTerceroDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoTerceroDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public TipoTerceroDTO build() throws InfrastructureException{
        return new  TipoTerceroDTO(id, nombre,  fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }

}
