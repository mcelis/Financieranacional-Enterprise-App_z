package co.com.cfn.foundation.canonical.personas;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Mark on 8/4/2017.
 */
@XmlRootElement(namespace = "http://cfn.com/domain-artifacts/personas/1.0.0")
public class MotivoRechazoSolicitudDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nombre;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;
    private String abrevMacroProceso;

    public MotivoRechazoSolicitudDTO(){
    }

    public MotivoRechazoSolicitudDTO(Integer id, String nombre, Timestamp fechaHoraCrea, Timestamp fechaHoraModifica, String usuarioCrea, String usuarioModifica, String abrevMacroProceso) {
        this.id = id;
        this.nombre = nombre;
        this.fechaHoraCrea = fechaHoraCrea;
        this.fechaHoraModifica = fechaHoraModifica;
        this.usuarioCrea = usuarioCrea;
        this.usuarioModifica = usuarioModifica;
        this.abrevMacroProceso = abrevMacroProceso;
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

    public Date getFechaHoraCrea() {
        return fechaHoraCrea;
    }

    public void setFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
    }

    public Date getFechaHoraModifica() {
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

    public String getAbrevMacroProceso() {
        return abrevMacroProceso;
    }

    public void setAbrevMacroProceso(String abrevMacroProceso) {
        this.abrevMacroProceso = abrevMacroProceso;
    }

    @Override
    public String toString() {
        return "MotivoRechazoSolicitudDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaHoraCreacion=" + fechaHoraCrea +
                ", fechaHoraModifica=" + fechaHoraModifica +
                ", usuarioCrea='" + usuarioCrea + '\'' +
                ", usuarioModifica='" + usuarioModifica + '\'' +
                ", usuarioModifica='" + abrevMacroProceso + '\'' +
                '}';
    }


}
