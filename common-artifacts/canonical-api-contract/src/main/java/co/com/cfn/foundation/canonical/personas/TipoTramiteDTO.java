package co.com.cfn.foundation.canonical.personas;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Mark on 24/3/2017.
 */
@XmlRootElement(namespace = "http://cfn.com/domain-artifacts/personas/1.0.0")
public class TipoTramiteDTO implements Serializable {

    public static  final long serialVersionUID = 1L;

    private Integer id;
    private String nombre;
    private String usuarioCrea;
    private String usuarioModifica;
    private Date fechaHoraCrea;
    private Date fechaHoraModifica;
    private Integer sePuedeVolverSolF;

    public TipoTramiteDTO(){
    }

    public TipoTramiteDTO(Integer id, String nombre, String usuarioCrea, String usuarioModifica, Date fechaHoraCrea, Date fechaHoraModifica, Integer sePuedeVolverSolF) {
        this.id = id;
        this.nombre = nombre;
        this.usuarioCrea = usuarioCrea;
        this.usuarioModifica = usuarioModifica;
        this.fechaHoraCrea = fechaHoraCrea;
        this.fechaHoraModifica = fechaHoraModifica;
        this.sePuedeVolverSolF = sePuedeVolverSolF;
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

    public Date getFechaHoraCrea() {
        return fechaHoraCrea;
    }

    public void setFechaHoraCrea(Date fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
    }

    public Date getFechaHoraModifica() {
        return fechaHoraModifica;
    }

    public void setFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
    }

    public Integer getSePuedeVolverSolF() {
        return sePuedeVolverSolF;
    }

    public void setSePuedeVolverSolF(Integer sePuedeVolverSolF) {
        this.sePuedeVolverSolF = sePuedeVolverSolF;
    }

    @Override
    public String toString(){
        return "CtgTipoIdentificacionDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", usuarioCrea='" + usuarioCrea + '\'' +
                ", usuarioModifica='" + usuarioModifica + '\'' +
                ", fechaHoraCreacion=" + fechaHoraCrea +
                ", fechaHoraModifica=" + fechaHoraModifica +
                ", sePuedeVolverSolF=" + sePuedeVolverSolF + '\'' +
                '}';
    }
}
