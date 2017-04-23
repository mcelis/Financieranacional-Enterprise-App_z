package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoGarantiaDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 21/4/2017.
 */
public class TipoGarantiaDTOBuilder implements Builder<TipoGarantiaDTO> {

    private String id;
    private String nombre;
    private Integer nivel;
    private String idPadre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoGarantiaDTOBuilder(){
    }

    public static TipoGarantiaDTOBuilder newInstance(){
        return new TipoGarantiaDTOBuilder();
    }

    public TipoGarantiaDTOBuilder withId(String id){
        this.id = id;
        return this;
    }


    public TipoGarantiaDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public TipoGarantiaDTOBuilder withNivel(Integer nivel){
        this.nivel = nivel;
        return this;
    }

    public TipoGarantiaDTOBuilder withIdPadre(String idPadre){
        this.idPadre = idPadre;
        return this;
    }

    public TipoGarantiaDTOBuilder withCodCobis(String codCobis){
        this.codCobis = codCobis;
        return this;
    }

    public TipoGarantiaDTOBuilder withCodPCIE(String codPCIE){
        this.codPCIE = codPCIE;
        return this;
    }

    public TipoGarantiaDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoGarantiaDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoGarantiaDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoGarantiaDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public TipoGarantiaDTO build() throws InfrastructureException{
        return new  TipoGarantiaDTO(id, nombre, nivel, idPadre, codCobis,codPCIE,  fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }



}
