package co.com.cfn.foundation.canonical.personas;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Mark on 17/4/2017.
 */
@XmlRootElement(namespace = "http://cfn.com/domain-artifacts/personas/1.0.0")
public class TipoCompaniaDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoCompaniaDTO(){
    }

    public TipoCompaniaDTO(Integer id, String codigo, String nombre, String codCobis, String codPCIE, Timestamp fechaHoraCrea, Timestamp fechaHoraModifica, String usuarioCrea, String usuarioModifica) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.codCobis = codCobis;
        this.codPCIE = codPCIE;
        this.fechaHoraCrea = fechaHoraCrea;
        this.fechaHoraModifica = fechaHoraModifica;
        this.usuarioCrea = usuarioCrea;
        this.usuarioModifica = usuarioModifica;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "TipoCompaniaDTO{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", codCobis='" + codCobis + '\'' +
                ", codPcie='" + codPCIE + '\'' +
                ", fechaHoraCreacion=" + fechaHoraCrea +
                ", fechaHoraModifica=" + fechaHoraModifica +
                ", usuarioCrea='" + usuarioCrea + '\'' +
                ", usuarioModifica='" + usuarioModifica + '\'' +
                '}';
    }
}
