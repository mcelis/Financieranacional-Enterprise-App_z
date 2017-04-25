package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoDireccionDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 24/4/2017.
 */
public class TipoDireccionDTOBuilder implements Builder<TipoDireccionDTO> {

    private Long id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoDireccionDTOBuilder(){
    }

    public static TipoDireccionDTOBuilder newInstance(){
        return new TipoDireccionDTOBuilder();
    }

    public TipoDireccionDTOBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public TipoDireccionDTOBuilder withCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public TipoDireccionDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public TipoDireccionDTOBuilder withCodCobis(String codCobis){
        this.codCobis = codCobis;
        return this;
    }

    public TipoDireccionDTOBuilder withCodPCIE(String codPCIE){
        this.codPCIE = codPCIE;
        return this;
    }

    public TipoDireccionDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoDireccionDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoDireccionDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoDireccionDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public TipoDireccionDTO build() throws InfrastructureException{
        return new  TipoDireccionDTO(id, codigo, nombre,codCobis,codPCIE,  fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }

}
