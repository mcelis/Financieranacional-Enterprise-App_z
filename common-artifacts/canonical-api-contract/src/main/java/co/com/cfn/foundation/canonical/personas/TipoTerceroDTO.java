package co.com.cfn.foundation.canonical.personas;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Mark on 24/4/2017.
 */
public class TipoTerceroDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nombre;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoTerceroDTO(){
    }

    public TipoTerceroDTO(Integer id, String nombre, Timestamp fechaHoraCrea, Timestamp fechaHoraModifica, String usuarioCrea, String usuarioModifica) {
        this.id = id;
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "CtgTipoTerceroDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaHoraCreacion=" + fechaHoraCrea +
                ", fechaHoraModifica=" + fechaHoraModifica +
                ", usuarioCrea='" + usuarioCrea + '\'' +
                ", usuarioModifica='" + usuarioModifica + '\'' +
                '}';
    }
}
