package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoPersonaDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 22/4/2017.
 */
public class TipoPersonaDTOBuilder implements Builder<TipoPersonaDTO> {

    private Integer id;
    private String nombre;
    private String usuarioCrea;
    private String usuarioModifica;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;

    public static TipoPersonaDTOBuilder newInstance(){
        return new TipoPersonaDTOBuilder();
    }

    public TipoPersonaDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }


    public TipoPersonaDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public TipoPersonaDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoPersonaDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    public TipoPersonaDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoPersonaDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    @Override
    public TipoPersonaDTO build() throws InfrastructureException{
        return new  TipoPersonaDTO(id, nombre, usuarioCrea, usuarioModifica, fechaHoraCrea, fechaHoraModifica);
    }

}
