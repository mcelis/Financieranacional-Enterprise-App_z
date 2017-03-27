package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 26/3/2017.
 */
@Entity
@Table(name = "CTG_ESTADO_CIVIL")
@NamedQueries({
        @NamedQuery(name = "CtgEstadoCivil.findAll", query = "SELECT c FROM CtgEstadoCivil c")
        , @NamedQuery(name = "CtgEstadoCivil.findByEcvId", query = "SELECT c FROM CtgEstadoCivil c WHERE c.ecvId = :ecvId")
        , @NamedQuery(name = "CtgEstadoCivil.findByEcvCodigo", query = "SELECT c FROM CtgEstadoCivil c WHERE c.ecvCodigo = :ecvCodigo")
        , @NamedQuery(name = "CtgEstadoCivil.findByEcvNombre", query = "SELECT c FROM CtgEstadoCivil c WHERE c.ecvNombre = :ecvNombre")
        , @NamedQuery(name = "CtgEstadoCivil.findByEcvCodcobis", query = "SELECT c FROM CtgEstadoCivil c WHERE c.ecvCodcobis = :ecvCodcobis")
        , @NamedQuery(name = "CtgEstadoCivil.findByEcvCodpcie", query = "SELECT c FROM CtgEstadoCivil c WHERE c.ecvCodpcie = :ecvCodpcie")
        , @NamedQuery(name = "CtgEstadoCivil.findByEcvFechaHoraCrea", query = "SELECT c FROM CtgEstadoCivil c WHERE c.ecvFechaHoraCrea = :ecvFechaHoraCrea")
        , @NamedQuery(name = "CtgEstadoCivil.findByEcvFechaHoraModifica", query = "SELECT c FROM CtgEstadoCivil c WHERE c.ecvFechaHoraModifica = :ecvFechaHoraModifica")
        , @NamedQuery(name = "CtgEstadoCivil.findByEcvUsuarioCrea", query = "SELECT c FROM CtgEstadoCivil c WHERE c.ecvUsuarioCrea = :ecvUsuarioCrea")
        , @NamedQuery(name = "CtgEstadoCivil.findByEcvUsuarioModifica", query = "SELECT c FROM CtgEstadoCivil c WHERE c.ecvUsuarioModifica = :ecvUsuarioModifica")})

public class EstadoCivil {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ECV_ID")
    private Integer ecvId;
    @Column(name = "ECV_CODIGO")
    private String ecvCodigo;
    @Column(name = "ECV_NOMBRE")
    private String ecvNombre;
    @Column(name = "ECV_CODCOBIS")
    private String ecvCodcobis;
    @Column(name = "ECV_CODPCIE")
    private String ecvCodpcie;
    @Column(name = "ECV_FECHA_HORA_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp ecvFechaHoraCrea;
    @Column(name = "ECV_FECHA_HORA_MODIFICA")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp ecvFechaHoraModifica;
    @Column(name = "ECV_USUARIO_CREA")
    private String ecvUsuarioCrea;
    @Column(name = "ECV_USUARIO_MODIFICA")
    private String ecvUsuarioModifica;

    public EstadoCivil(){
    }
    public EstadoCivil(Integer ecvId, String ecvCodigo, String ecvNombre, String ecvCodcobis, String ecvCodpcie, Timestamp ecvFechaHoraCrea, Timestamp ecvFechaHoraModifica, String ecvUsuarioCrea, String ecvUsuarioModifica) {
        this.ecvId = ecvId;
        this.ecvCodigo = ecvCodigo;
        this.ecvNombre = ecvNombre;
        this.ecvCodcobis = ecvCodcobis;
        this.ecvCodpcie = ecvCodpcie;
        this.ecvFechaHoraCrea = ecvFechaHoraCrea;
        this.ecvFechaHoraModifica = ecvFechaHoraModifica;
        this.ecvUsuarioCrea = ecvUsuarioCrea;
        this.ecvUsuarioModifica = ecvUsuarioModifica;
    }

    public EstadoCivil(Integer ecvId) {
        this.ecvId = ecvId;
    }

    public Integer getEcvId() {
        return ecvId;
    }

    public void setEcvId(Integer ecvId) {
        this.ecvId = ecvId;
    }

    public String getEcvCodigo() {
        return ecvCodigo;
    }

    public void setEcvCodigo(String ecvCodigo) {
        this.ecvCodigo = ecvCodigo;
    }

    public String getEcvNombre() {
        return ecvNombre;
    }

    public void setEcvNombre(String ecvNombre) {
        this.ecvNombre = ecvNombre;
    }

    public String getEcvCodcobis() {
        return ecvCodcobis;
    }

    public void setEcvCodcobis(String ecvCodcobis) {
        this.ecvCodcobis = ecvCodcobis;
    }

    public String getEcvCodpcie() {
        return ecvCodpcie;
    }

    public void setEcvCodpcie(String ecvCodpcie) {
        this.ecvCodpcie = ecvCodpcie;
    }

    public Timestamp getEcvFechaHoraCrea() {
        return ecvFechaHoraCrea;
    }

    public void setEcvFechaHoraCrea(Timestamp ecvFechaHoraCrea) {
        this.ecvFechaHoraCrea = ecvFechaHoraCrea;
    }

    public Timestamp getEcvFechaHoraModifica() {
        return ecvFechaHoraModifica;
    }

    public void setEcvFechaHoraModifica(Timestamp ecvFechaHoraModifica) {
        this.ecvFechaHoraModifica = ecvFechaHoraModifica;
    }

    public String getEcvUsuarioCrea() {
        return ecvUsuarioCrea;
    }

    public void setEcvUsuarioCrea(String ecvUsuarioCrea) {
        this.ecvUsuarioCrea = ecvUsuarioCrea;
    }

    public String getEcvUsuarioModifica() {
        return ecvUsuarioModifica;
    }

    public void setEcvUsuarioModifica(String ecvUsuarioModifica) {
        this.ecvUsuarioModifica = ecvUsuarioModifica;
    }



    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoCivil)) {
            return false;
        }
        EstadoCivil other = (EstadoCivil) object;
        if ((this.ecvId == null && other.ecvId != null) || (this.ecvId != null && !this.ecvId.equals(other.ecvId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = ecvId;
        result = 31 * result + (ecvCodigo != null ? ecvCodigo.hashCode() : 0);
        result = 31 * result + (ecvNombre != null ? ecvNombre.hashCode() : 0);
        result = 31 * result + (ecvCodcobis != null ? ecvCodcobis.hashCode() : 0);
        result = 31 * result + (ecvCodpcie != null ? ecvCodpcie.hashCode() : 0);
        result = 31 * result + (ecvFechaHoraCrea != null ? ecvFechaHoraCrea.hashCode() : 0);
        result = 31 * result + (ecvFechaHoraModifica != null ? ecvFechaHoraModifica.hashCode() : 0);
        result = 31 * result + (ecvUsuarioCrea != null ? ecvUsuarioCrea.hashCode() : 0);
        result = 31 * result + (ecvUsuarioModifica != null ? ecvUsuarioModifica.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ActividadPersonaEntity{" +
                "ecvId=" + ecvId +
                ", ecvCodigo='" + ecvCodigo + '\'' +
                ", ecvNombre='" + ecvNombre + '\'' +
                ", ecvCodcobis='" + ecvCodcobis + '\'' +
                ", ecvCodpcie='" + ecvCodpcie + '\'' +
                ", ecvFechaHoraCrea='" + ecvFechaHoraCrea + '\'' +
                ", ecvFechaHoraModifica=" + ecvFechaHoraModifica +
                ", ecvUsuarioCrea=" + ecvUsuarioCrea +
                ", ecvUsuarioModifica='" + ecvUsuarioModifica + '\'' +
                '}';
    }

}
