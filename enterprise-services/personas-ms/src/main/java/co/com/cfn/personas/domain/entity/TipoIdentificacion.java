package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.*;

/**
 * Created by zmiranda on 22/03/2017.
 */

@Entity
@Table(name = "CTG_TIPO_IDENTIFICACION", schema = "dbo", catalog = "financiera")
@NamedQueries({
        @NamedQuery(name = "TipoIdentificacion.findAll", query = "SELECT c FROM TipoIdentificacion c")})

public class TipoIdentificacion {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TID_ID")
    private Integer tidId;

    @Basic
    @Column(name = "TID_CODIGO")
    private String tidCodigo;
    @Basic
    @Column(name = "TID_NOMBRE")
    private String tidNombre;
    @Basic
    @Column(name = "TID_DESCRIPCION")
    private String tidDescripcion;
    @Basic
    @Column(name = "TID_CODCOBIS")
    private String tidCodcobis;
    @Basic
    @Column(name = "TID_CODPCIE")
    private String tidCodpcie;
    @Basic
    @Column(name = "TID_FECHA_HORA_CREA")
    private Timestamp tidFechaHoraCrea;
    @Basic
    @Column(name = "TID_FECHA_HORA_MODIFICA")
    private Timestamp tidFechaHoraModifica;
    @Basic
    @Column(name = "TID_USUARIO_CREA")
    private String tidUsuarioCrea;
    @Basic
    @Column(name = "TID_USUARIO_MODIFICA")
    private String tidUsuarioModifica;

    public TipoIdentificacion() {
    }

    public TipoIdentificacion(Integer tidId, String tidCodigo, String tidNombre, String tidDescripcion, String tidCodcobis, String tidCodpcie, Timestamp tidFechaHoraCrea, Timestamp tidFechaHoraModifica, String tidUsuarioCrea, String tidUsuarioModifica) {
        this.tidId = tidId;
        this.tidCodigo = tidCodigo;
        this.tidNombre = tidNombre;
        this.tidDescripcion = tidDescripcion;
        this.tidCodcobis = tidCodcobis;
        this.tidCodpcie = tidCodpcie;
        this.tidFechaHoraCrea = tidFechaHoraCrea;
        this.tidFechaHoraModifica = tidFechaHoraModifica;
        this.tidUsuarioCrea = tidUsuarioCrea;
        this.tidUsuarioModifica = tidUsuarioModifica;
    }

    public TipoIdentificacion(Integer tidId) {
        this.tidId = tidId;
    }

    public Integer getTidId() {
        return tidId;
    }

    public void setTidId(Integer tidId) {
        this.tidId = tidId;
    }

    public String getTidCodigo() {
        return tidCodigo;
    }

    public void setTidCodigo(String tidCodigo) {
        this.tidCodigo = tidCodigo;
    }

    public String getTidNombre() {
        return tidNombre;
    }

    public void setTidNombre(String tidNombre) {
        this.tidNombre = tidNombre;
    }

    public String getTidDescripcion() {
        return tidDescripcion;
    }

    public void setTidDescripcion(String tidDescripcion) {
        this.tidDescripcion = tidDescripcion;
    }

    public String getTidCodcobis() {
        return tidCodcobis;
    }

    public void setTidCodcobis(String tidCodcobis) {
        this.tidCodcobis = tidCodcobis;
    }

    public String getTidCodpcie() {
        return tidCodpcie;
    }

    public void setTidCodpcie(String tidCodpcie) {
        this.tidCodpcie = tidCodpcie;
    }

    public Timestamp getTidFechaHoraCrea() {
        return tidFechaHoraCrea;
    }

    public void setTidFechaHoraCrea(Timestamp tidFechaHoraCrea) {
        this.tidFechaHoraCrea = tidFechaHoraCrea;
    }

    public Timestamp getTidFechaHoraModifica() {
        return tidFechaHoraModifica;
    }

    public void setTidFechaHoraModifica(Timestamp tidFechaHoraModifica) {
        this.tidFechaHoraModifica = tidFechaHoraModifica;
    }

    public String getTidUsuarioCrea() {
        return tidUsuarioCrea;
    }

    public void setTidUsuarioCrea(String tidUsuarioCrea) {
        this.tidUsuarioCrea = tidUsuarioCrea;
    }

    public String getTidUsuarioModifica() {
        return tidUsuarioModifica;
    }

    public void setTidUsuarioModifica(String tidUsuarioModifica) {
        this.tidUsuarioModifica = tidUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int result = tidId;
        result = 31 * result + (tidCodigo != null ? tidCodigo.hashCode() : 0);
        result = 31 * result + (tidNombre != null ? tidNombre.hashCode() : 0);
        result = 31 * result + (tidCodcobis != null ? tidCodcobis.hashCode() : 0);
        result = 31 * result + (tidCodpcie != null ? tidCodpcie.hashCode() : 0);
        result = 31 * result + (tidFechaHoraCrea != null ? tidFechaHoraCrea.hashCode() : 0);
        result = 31 * result + (tidFechaHoraModifica != null ? tidFechaHoraModifica.hashCode() : 0);
        result = 31 * result + (tidUsuarioCrea != null ? tidUsuarioCrea.hashCode() : 0);
        result = 31 * result + (tidUsuarioModifica != null ? tidUsuarioModifica.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoIdentificacion)) {
            return false;
        }
        TipoIdentificacion other = (TipoIdentificacion) object;
        if ((this.tidId == null && other.tidId != null) || (this.tidId != null && !this.tidId.equals(other.tidId))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "TipoIdentificacionEntity{" +
                "tidId=" + tidId +
                ", tidCodigo='" + tidCodigo + '\'' +
                ", tidNombre='" + tidNombre + '\'' +
                ", tidCodcobis='" + tidCodcobis + '\'' +
                ", tidCodpcie='" + tidCodpcie + '\'' +
                ", tidFechaHoraCrea=" + tidFechaHoraCrea +
                ", tidFechaHoraModifica=" + tidFechaHoraModifica +
                ", tidUsuarioCrea='" + tidUsuarioCrea + '\'' +
                ", tidUsuarioModifica='" + tidUsuarioModifica + '\'' +
                '}';
    }

}
