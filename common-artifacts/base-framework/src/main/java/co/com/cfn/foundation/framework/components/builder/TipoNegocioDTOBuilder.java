package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoNegocioDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 21/4/2017.
 */
public class TipoNegocioDTOBuilder implements Builder<TipoNegocioDTO> {

    private Integer id;
    private String nombre;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoNegocioDTOBuilder(){
    }

    public static TipoNegocioDTOBuilder newInstance(){
        return new TipoNegocioDTOBuilder();
    }

    public TipoNegocioDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }


    public TipoNegocioDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public TipoNegocioDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoNegocioDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoNegocioDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoNegocioDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public TipoNegocioDTO build() throws InfrastructureException{
        return new  TipoNegocioDTO(id, nombre, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }

}
