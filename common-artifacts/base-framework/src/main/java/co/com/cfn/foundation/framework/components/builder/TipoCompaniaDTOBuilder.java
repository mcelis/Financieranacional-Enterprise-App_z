package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoCompaniaDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 18/4/2017.
 */
public class TipoCompaniaDTOBuilder implements Builder<TipoCompaniaDTO> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoCompaniaDTOBuilder(){
    }

    public static TipoCompaniaDTOBuilder newInstance(){
        return new TipoCompaniaDTOBuilder();
    }

    public TipoCompaniaDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }

    public TipoCompaniaDTOBuilder withCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public TipoCompaniaDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public TipoCompaniaDTOBuilder withCodCobis(String codCobis){
        this.codCobis = codCobis;
        return this;
    }

    public TipoCompaniaDTOBuilder withCodPCIE(String codPCIE){
        this.codPCIE = codPCIE;
        return this;
    }

    public TipoCompaniaDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoCompaniaDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoCompaniaDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoCompaniaDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public TipoCompaniaDTO build() throws InfrastructureException{
        return new  TipoCompaniaDTO(id, codigo, nombre,codCobis,codPCIE,  fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }
}
