package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoEstadoFinancieroDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 24/4/2017.
 */
public class TipoEstadoFinancieroDTOBuilder implements Builder<TipoEstadoFinancieroDTO> {

    private Integer id;
    private String nombre;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoEstadoFinancieroDTOBuilder(){
    }

    public static TipoEstadoFinancieroDTOBuilder newInstance(){
        return new TipoEstadoFinancieroDTOBuilder();
    }

    public TipoEstadoFinancieroDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }


    public TipoEstadoFinancieroDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public TipoEstadoFinancieroDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoEstadoFinancieroDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoEstadoFinancieroDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoEstadoFinancieroDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public TipoEstadoFinancieroDTO build() throws InfrastructureException{
        return new  TipoEstadoFinancieroDTO(id, nombre,  fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }

}
