package co.com.cfn.foundation.canonical.personas;

import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Timestamp;

/**
 * Created by Mark on 17/4/2017.
 */
@XmlRootElement(namespace = "http://cfn.com/domain-artifacts/personas/1.0.0")
public class ActividadEconomicaDTO {

    private String aecId;
    private String aecNombre;
    private Integer aecNivel;
    private String aecCodcobis;
    private String aecCodpcie;
    private Timestamp aecFechaHoraCrea;
    private Timestamp aecFechaHoraModifica;
    private String aecUsuarioCrea;
    private String aecUsuarioModifica;

    public ActividadEconomicaDTO() {
    }

    public ActividadEconomicaDTO(String aecId, String aecNombre, Integer aecNivel, String aecCodcobis, String aecCodpcie, Timestamp aecFechaHoraCrea,
                                 Timestamp aecFechaHoraModifica, String aecUsuarioCrea, String aecUsuarioModifica/*, Collection<ActividadEconomica> actividadEconomicaCollection, ActividadEconomica aecIdPadre*/) {
        this.aecId = aecId;
        this.aecNombre = aecNombre;
        this.aecNivel = aecNivel;
        this.aecCodcobis = aecCodcobis;
        this.aecCodpcie = aecCodpcie;
        this.aecFechaHoraCrea = aecFechaHoraCrea;
        this.aecFechaHoraModifica = aecFechaHoraModifica;
        this.aecUsuarioCrea = aecUsuarioCrea;
        this.aecUsuarioModifica = aecUsuarioModifica;
       /* ActividadEconomicaCollection = actividadEconomicaCollection;
        this.aecIdPadre = aecIdPadre;*/
    }

    public String getAecId() {
        return aecId;
    }

    public void setAecId(String aecId) {
        this.aecId = aecId;
    }

    public String getAecNombre() {
        return aecNombre;
    }

    public void setAecNombre(String aecNombre) {
        this.aecNombre = aecNombre;
    }

    public Integer getAecNivel() {
        return aecNivel;
    }

    public void setAecNivel(Integer aecNivel) {
        this.aecNivel = aecNivel;
    }

    public String getAecCodcobis() {
        return aecCodcobis;
    }

    public void setAecCodcobis(String aecCodcobis) {
        this.aecCodcobis = aecCodcobis;
    }

    public String getAecCodpcie() {
        return aecCodpcie;
    }

    public void setAecCodpcie(String aecCodpcie) {
        this.aecCodpcie = aecCodpcie;
    }

    public Timestamp getAecFechaHoraCrea() {
        return aecFechaHoraCrea;
    }

    public void setAecFechaHoraCrea(Timestamp aecFechaHoraCrea) {
        this.aecFechaHoraCrea = aecFechaHoraCrea;
    }

    public Timestamp getAecFechaHoraModifica() {
        return aecFechaHoraModifica;
    }

    public void setAecFechaHoraModifica(Timestamp aecFechaHoraModifica) {
        this.aecFechaHoraModifica = aecFechaHoraModifica;
    }

    public String getAecUsuarioCrea() {
        return aecUsuarioCrea;
    }

    public void setAecUsuarioCrea(String aecUsuarioCrea) {
        this.aecUsuarioCrea = aecUsuarioCrea;
    }

    public String getAecUsuarioModifica() {
        return aecUsuarioModifica;
    }

    public void setAecUsuarioModifica(String aecUsuarioModifica) {
        this.aecUsuarioModifica = aecUsuarioModifica;
    }

    @Override
    public String toString() {
        return "ActividadEconomicoDTO{" +
                "id=" + aecId +
                ", nombre='" + aecNombre + '\'' +
                ", nivel='" + aecNivel + '\'' +
                ", codCobis='" + aecCodcobis + '\'' +
                ", codPcie='" + aecCodpcie + '\'' +
                ", fechaHoraCreacion=" + aecFechaHoraCrea +
                ", fechaHoraModifica=" + aecFechaHoraModifica +
                ", usuarioCrea='" + aecUsuarioCrea + '\'' +
                ", usuarioModifica='" + aecUsuarioModifica + '\'' +
                '}';
    }

}
