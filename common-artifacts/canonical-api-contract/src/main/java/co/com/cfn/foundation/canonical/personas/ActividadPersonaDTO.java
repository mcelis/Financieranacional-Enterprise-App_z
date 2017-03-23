package co.com.cfn.foundation.canonical.personas;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;


/**
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * CFN Generic Artifact
 * Created: 4-Ene-2017
 * Author: Administrator
 * Type: JAVA class
 * Artifact Purpose: DTO - Model Artifact
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */

@XmlRootElement(namespace = "http://cfn.com/domain-artifacts/personas/1.0.0")
public class ActividadPersonaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String codigo;
    private String nombre;
    private String tipo;
    private String codCobis;
    private String codPcie;
    private Date fechaHoraCreacion;
    private Date fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public ActividadPersonaDTO() {
    }

    public ActividadPersonaDTO(Integer id, String codigo, String nombre, String tipo, String codCobis, String codPcie,
                               Date fechaHoraCreacion, Date fechaHoraModifica, String usuarioCrea, String usuarioModifica) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.codCobis = codCobis;
        this.codPcie = codPcie;
        this.fechaHoraCreacion = fechaHoraCreacion;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodCobis() {
        return codCobis;
    }

    public void setCodCobis(String codCobis) {
        this.codCobis = codCobis;
    }

    public String getCodPcie() {
        return codPcie;
    }

    public void setCodPcie(String codPcie) {
        this.codPcie = codPcie;
    }

    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public Date getFechaHoraModifica() {
        return fechaHoraModifica;
    }

    public void setFechaHoraModifica(Date fechaHoraModifica) {
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
        return "CtgActividadPersonaDTO{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", codCobis='" + codCobis + '\'' +
                ", codPcie='" + codPcie + '\'' +
                ", fechaHoraCreacion=" + fechaHoraCreacion +
                ", fechaHoraModifica=" + fechaHoraModifica +
                ", usuarioCrea='" + usuarioCrea + '\'' +
                ", usuarioModifica='" + usuarioModifica + '\'' +
                '}';
    }
}
