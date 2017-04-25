package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoReferenciaComercialDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 24/4/2017.
 */
public class TipoReferenciaComercialDTOBuilder implements Builder<TipoReferenciaComercialDTO> {

    private Long id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoReferenciaComercialDTOBuilder(){
    }

    public static TipoReferenciaComercialDTOBuilder newInstance(){
        return new TipoReferenciaComercialDTOBuilder();
    }

    public TipoReferenciaComercialDTOBuilder withId(Long id){
        this.id = id;
        return this;
    }

    public TipoReferenciaComercialDTOBuilder withCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public TipoReferenciaComercialDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public TipoReferenciaComercialDTOBuilder withCodCobis(String codCobis){
        this.codCobis = codCobis;
        return this;
    }

    public TipoReferenciaComercialDTOBuilder withCodPCIE(String codPCIE){
        this.codPCIE = codPCIE;
        return this;
    }

    public TipoReferenciaComercialDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoReferenciaComercialDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoReferenciaComercialDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoReferenciaComercialDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public TipoReferenciaComercialDTO build() throws InfrastructureException{
        return new  TipoReferenciaComercialDTO(id, codigo, nombre,codCobis,codPCIE,  fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }

}
