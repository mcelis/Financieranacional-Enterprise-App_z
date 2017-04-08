package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.EncuestaConocimientoDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 8/4/2017.
 */
public class EncuestaConocimientoDTOBuilder implements Builder<EncuestaConocimientoDTO> {

    private Integer id;
    private String nombre;
    private String usuarioCrea;
    private String usuarioModifica;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;

    public EncuestaConocimientoDTOBuilder(){
    }

    public static EncuestaConocimientoDTOBuilder newInstance(){
        return new EncuestaConocimientoDTOBuilder();
    }

    public EncuestaConocimientoDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }


    public EncuestaConocimientoDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public EncuestaConocimientoDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public EncuestaConocimientoDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }


    public EncuestaConocimientoDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public EncuestaConocimientoDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    @Override
    public EncuestaConocimientoDTO build() throws InfrastructureException{
        return new EncuestaConocimientoDTO(id, nombre, usuarioCrea, usuarioModifica, fechaHoraCrea, fechaHoraModifica );
    }



}
