package co.com.cfn.foundation.canonical.personas;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by zmiranda on 21/02/2017.
 */
@XmlRootElement(namespace = "http://cfn.com/domain-artifacts/personas/1.0.0")
public class TipoDocumentalDTO implements Serializable {

    private Integer id;
    private String nombre;
    private String usuarioCrea;
    private String usuarioModifica;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String descripcion;
    private Integer mesesVigencia;
    private Integer esAnexoF;

    public TipoDocumentalDTO(){
    }

    public TipoDocumentalDTO(Integer id, String nombre, String usuarioCrea, String usuarioModifica, Timestamp fechaHoraCrea, Timestamp fechaHoraModifica, String descripcion, Integer mesesVigencia, Integer esAnexoF) {
        this.id = id;
        this.nombre = nombre;
        this.usuarioCrea = usuarioCrea;
        this.usuarioModifica = usuarioModifica;
        this.fechaHoraCrea = fechaHoraCrea;
        this.fechaHoraModifica = fechaHoraModifica;
        this.descripcion = descripcion;
        this.mesesVigencia = mesesVigencia;
        esAnexoF = esAnexoF;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getMesesVigencia() {
        return mesesVigencia;
    }

    public void setMesesVigencia(Integer mesesVigencia) {
        this.mesesVigencia = mesesVigencia;
    }

    public Integer getEsAnexoF() {
        return esAnexoF;
    }

    public void setEsAnexoF(Integer esAnexoF) {
        esAnexoF = esAnexoF;
    }

    @Override
    public String toString() {
        return "TipoDocumentalDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", usuarioCrea='" + usuarioCrea + '\'' +
                ", usuarioModifica='" + usuarioModifica + '\'' +
                ", fechaHoraCreacion=" + fechaHoraCrea +
                ", fechaHoraModifica=" + fechaHoraModifica +
                ", descripcion='" + descripcion +'\'' +
                ", mesesVigencia='" + mesesVigencia + '\'' +
                ", esAnexoF='" + esAnexoF +
                '}';
    }
}
