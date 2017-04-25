package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoViviendaDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 24/4/2017.
 */
public class TipoViviendaDTOBuilder implements Builder<TipoViviendaDTO> {

    private Long id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoViviendaDTOBuilder(){
    }

    public static TipoViviendaDTOBuilder newInstance(){
        return new TipoViviendaDTOBuilder();
    }

    public TipoViviendaDTOBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public TipoViviendaDTOBuilder withCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public TipoViviendaDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public TipoViviendaDTOBuilder withCodCobis(String codCobis){
        this.codCobis = codCobis;
        return this;
    }

    public TipoViviendaDTOBuilder withCodPCIE(String codPCIE){
        this.codPCIE = codPCIE;
        return this;
    }

    public TipoViviendaDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoViviendaDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoViviendaDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoViviendaDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public TipoViviendaDTO build() throws InfrastructureException{
        return new  TipoViviendaDTO(id, codigo, nombre,codCobis,codPCIE,  fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }



}
