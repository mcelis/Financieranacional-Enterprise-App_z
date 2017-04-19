package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoCuentaDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 18/4/2017.
 */
public class TipoCuentaDTOBuilder implements Builder<TipoCuentaDTO> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoCuentaDTOBuilder(){
    }

    public static TipoCuentaDTOBuilder newInstance(){
        return new TipoCuentaDTOBuilder();
    }

    public TipoCuentaDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }

    public TipoCuentaDTOBuilder withCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public TipoCuentaDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public TipoCuentaDTOBuilder withCodCobis(String codCobis){
        this.codCobis = codCobis;
        return this;
    }

    public TipoCuentaDTOBuilder withCodPCIE(String codPCIE){
        this.codPCIE = codPCIE;
        return this;
    }

    public TipoCuentaDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoCuentaDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoCuentaDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoCuentaDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public TipoCuentaDTO build() throws InfrastructureException{
        return new  TipoCuentaDTO(id, codigo, nombre,codCobis,codPCIE,  fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }

}
