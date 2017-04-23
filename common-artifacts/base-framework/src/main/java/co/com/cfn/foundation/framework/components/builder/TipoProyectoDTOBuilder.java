package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoProyectoDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 21/4/2017.
 */
public class TipoProyectoDTOBuilder implements Builder<TipoProyectoDTO>{

    private Integer id;
    private String nombre;
    private String usuarioCrea;
    private String usuarioModifica;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;

    public TipoProyectoDTOBuilder(){
    }

    public static TipoProyectoDTOBuilder newInstance(){
        return new TipoProyectoDTOBuilder();
    }

    public TipoProyectoDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }


    public TipoProyectoDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public TipoProyectoDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoProyectoDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }


    public TipoProyectoDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoProyectoDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    @Override
    public TipoProyectoDTO build() throws InfrastructureException{
        return new  TipoProyectoDTO(id, nombre, usuarioCrea, usuarioModifica, fechaHoraCrea, fechaHoraModifica);
    }



}
