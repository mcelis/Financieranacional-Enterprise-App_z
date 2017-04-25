package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoUnidadMedidaDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 24/4/2017.
 */
public class TipoUnidadMedidaDTOBuilder implements Builder<TipoUnidadMedidaDTO> {

    private Integer id;
    private String nombre;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoUnidadMedidaDTOBuilder(){
    }

    public static TipoUnidadMedidaDTOBuilder newInstance(){
        return new TipoUnidadMedidaDTOBuilder();
    }

    public TipoUnidadMedidaDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }

    public TipoUnidadMedidaDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public TipoUnidadMedidaDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoUnidadMedidaDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoUnidadMedidaDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoUnidadMedidaDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public TipoUnidadMedidaDTO build() throws InfrastructureException{
        return new  TipoUnidadMedidaDTO(id, nombre, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }

}
