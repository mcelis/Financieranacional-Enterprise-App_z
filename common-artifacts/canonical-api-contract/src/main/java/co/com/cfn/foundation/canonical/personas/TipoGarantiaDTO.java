package co.com.cfn.foundation.canonical.personas;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Mark on 18/4/2017.
 */
@XmlRootElement(namespace = "http://cfn.com/domain-artifacts/personas/1.0.0")
public class TipoGarantiaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

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

    public TipoGarantiaDTO(){
    }

    public TipoGarantiaDTO(String id, String nombre, Integer nivel, String idPadre, String codCobis, String codPCIE, Timestamp fechaHoraCrea, Timestamp fechaHoraModifica, String usuarioCrea, String usuarioModifica) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.idPadre = idPadre;
        this.codCobis = codCobis;
        this.codPCIE = codPCIE;
        this.fechaHoraCrea = fechaHoraCrea;
        this.fechaHoraModifica = fechaHoraModifica;
        this.usuarioCrea = usuarioCrea;
        this.usuarioModifica = usuarioModifica;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(String idPadre) {
        this.idPadre = idPadre;
    }

    public String getCodCobis() {
        return codCobis;
    }

    public void setCodCobis(String codCobis) {
        this.codCobis = codCobis;
    }

    public String getCodPCIE() {
        return codPCIE;
    }

    public void setCodPCIE(String codPCIE) {
        this.codPCIE = codPCIE;
    }

    public Timestamp getFechaHoraCrea() {
        return fechaHoraCrea;
    }

    public void setFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
    }

    public Timestamp getFechaHoraModifica() {
        return fechaHoraModifica;
    }

    public void setFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
    }

    public String getUsuarioCrea() {
        return usuarioCrea;
    }

    public void setUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
    }

    public String getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    @Override
    public String toString() {
        return "CtgGeneroDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + nivel + '\'' +
                ", codigo='" + idPadre + '\'' +
                ", codCobis='" + codCobis + '\'' +
                ", codPcie='" + codPCIE + '\'' +
                ", fechaHoraCreacion=" + fechaHoraCrea +
                ", fechaHoraModifica=" + fechaHoraModifica +
                ", usuarioCrea='" + usuarioCrea + '\'' +
                ", usuarioModifica='" + usuarioModifica + '\'' +
                '}';
    }
}
