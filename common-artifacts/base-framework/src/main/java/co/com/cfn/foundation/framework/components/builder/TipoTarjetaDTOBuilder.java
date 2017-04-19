package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoTarjetaDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 11/4/2017.
 */
public class TipoTarjetaDTOBuilder implements Builder<TipoTarjetaDTO> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoTarjetaDTOBuilder(){
    }

    public static TipoTarjetaDTOBuilder newInstance(){
        return new TipoTarjetaDTOBuilder();
    }

    public TipoTarjetaDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }

    public TipoTarjetaDTOBuilder withCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public TipoTarjetaDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public TipoTarjetaDTOBuilder withCodCobis(String codCobis){
        this.codCobis = codCobis;
        return this;
    }

    public TipoTarjetaDTOBuilder withCodPCIE(String codPCIE){
        this.codPCIE = codPCIE;
        return this;
    }

    public TipoTarjetaDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoTarjetaDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoTarjetaDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoTarjetaDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public TipoTarjetaDTO build() throws InfrastructureException{
        return new  TipoTarjetaDTO(id, codigo, nombre,codCobis,codPCIE,  fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }
}
