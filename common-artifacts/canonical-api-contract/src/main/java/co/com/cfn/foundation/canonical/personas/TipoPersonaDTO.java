package co.com.cfn.foundation.canonical.personas;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Mark on 22/4/2017.
 */
@XmlRootElement(namespace = "http://cfn.com/domain-artifacts/personas/1.0.0")
public class TipoPersonaDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nombre;
    private String usuarioCrea;
    private String usuarioModifica;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;

    public TipoPersonaDTO(){
    }

    public TipoPersonaDTO(Integer id, String nombre, String usuarioCrea, String usuarioModifica, Timestamp fechaHoraCrea, Timestamp fechaHoraModifica) {
        this.id = id;
        this.nombre = nombre;
        this.usuarioCrea = usuarioCrea;
        this.usuarioModifica = usuarioModifica;
        this.fechaHoraCrea = fechaHoraCrea;
        this.fechaHoraModifica = fechaHoraModifica;
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

    @Override
    public String toString() {
        return "TipoPersonaDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", usuarioCrea='" + usuarioCrea + '\'' +
                ", usuarioModifica='" + usuarioModifica + '\'' +
                ", fechaHoraCreacion=" + fechaHoraCrea +
                ", fechaHoraModifica=" + fechaHoraModifica +
                '}';
    }
}
