package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.*;

/**
 * Created by zmiranda on 22/03/2017.
 */

@Entity
@Table(name = "CTG_TIPO_IDENTIFICACION")
@NamedQueries({
        @NamedQuery(name = "CtgTipoIdentificacion.findAll", query = "SELECT c FROM CtgTipoIdentificacion c")
        , @NamedQuery(name = "CtgTipoIdentificacion.findByTidId", query = "SELECT c FROM CtgTipoIdentificacion c WHERE c.tidId = :tidId")
        , @NamedQuery(name = "CtgTipoIdentificacion.findByTidCodigo", query = "SELECT c FROM CtgTipoIdentificacion c WHERE c.tidCodigo = :tidCodigo")
        , @NamedQuery(name = "CtgTipoIdentificacion.findByTidNombre", query = "SELECT c FROM CtgTipoIdentificacion c WHERE c.tidNombre = :tidNombre")
        , @NamedQuery(name = "CtgTipoIdentificacion.findByTidDescripcion", query = "SELECT c FROM CtgTipoIdentificacion c WHERE c.tidDescripcion = :tidDescripcion")
        , @NamedQuery(name = "CtgTipoIdentificacion.findByTidCodcobis", query = "SELECT c FROM CtgTipoIdentificacion c WHERE c.tidCodcobis = :tidCodcobis")
        , @NamedQuery(name = "CtgTipoIdentificacion.findByTidCodpcie", query = "SELECT c FROM CtgTipoIdentificacion c WHERE c.tidCodpcie = :tidCodpcie")
        , @NamedQuery(name = "CtgTipoIdentificacion.findByTidFechaHoraCrea", query = "SELECT c FROM CtgTipoIdentificacion c WHERE c.tidFechaHoraCrea = :tidFechaHoraCrea")
        , @NamedQuery(name = "CtgTipoIdentificacion.findByTidFechaHoraModifica", query = "SELECT c FROM CtgTipoIdentificacion c WHERE c.tidFechaHoraModifica = :tidFechaHoraModifica")
        , @NamedQuery(name = "CtgTipoIdentificacion.findByTidUsuarioCrea", query = "SELECT c FROM CtgTipoIdentificacion c WHERE c.tidUsuarioCrea = :tidUsuarioCrea")
        , @NamedQuery(name = "CtgTipoIdentificacion.findByTidUsuarioModifica", query = "SELECT c FROM CtgTipoIdentificacion c WHERE c.tidUsuarioModifica = :tidUsuarioModifica")})
public class TipoIdentificacion {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TID_ID")
    private Integer tidId;
    @Column(name = "TID_CODIGO")
    private String tidCodigo;
    @Column(name = "TID_NOMBRE")
    private String tidNombre;
    @Column(name = "TID_DESCRIPCION")
    private String tidDescripcion;
    @Column(name = "TID_CODCOBIS")
    private String tidCodcobis;
    @Column(name = "TID_CODPCIE")
    private String tidCodpcie;
    @Column(name = "TID_FECHA_HORA_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp tidFechaHoraCrea;
    @Column(name = "TID_FECHA_HORA_MODIFICA")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp tidFechaHoraModifica;
    @Column(name = "TID_USUARIO_CREA")
    private String tidUsuarioCrea;
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
