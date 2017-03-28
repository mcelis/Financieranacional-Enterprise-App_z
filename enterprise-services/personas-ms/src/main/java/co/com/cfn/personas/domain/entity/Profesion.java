package co.com.cfn.personas.domain.entity;

/**
 * Created by zmiranda on 27/03/2017.
 */

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "CTG_PROFESION", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "Profesion.findAll", query = "SELECT c FROM Profesion c")})
public class Profesion {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PRF_ID")
    private Integer prfId;
    @Column(name = "PRF_CODIGO")
    private String prfCodigo;
    @Column(name = "PRF_NOMBRE")
    private String prfNombre;
    @Column(name = "PRF_CODCOBIS")
    private String prfCodcobis;
    @Column(name = "PRF_CODPCIE")
    private String prfCodpcie;
    @Column(name = "PRF_FECHA_HORA_CREA")
    private Timestamp prfFechaHoraCrea;
    @Column(name = "PRF_FECHA_HORA_MODIFICA")
    private Timestamp prfFechaHoraModifica;
    @Column(name = "PRF_USUARIO_CREA")
    private String prfUsuarioCrea;
    @Column(name = "PRF_USUARIO_MODIFICA")
    private String prfUsuarioModifica;

    public Profesion() {
    }

    public Profesion(Integer prfId) {
        this.prfId = prfId;
    }

    public Integer getPrfId() {
        return prfId;
    }

    public void setPrfId(Integer prfId) {
        this.prfId = prfId;
    }

    public String getPrfCodigo() {
        return prfCodigo;
    }

    public void setPrfCodigo(String prfCodigo) {
        this.prfCodigo = prfCodigo;
    }

    public String getPrfNombre() {
        return prfNombre;
    }

    public void setPrfNombre(String prfNombre) {
        this.prfNombre = prfNombre;
    }

    public String getPrfCodcobis() {
        return prfCodcobis;
    }

    public void setPrfCodcobis(String prfCodcobis) {
        this.prfCodcobis = prfCodcobis;
    }

    public String getPrfCodpcie() {
        return prfCodpcie;
    }

    public void setPrfCodpcie(String prfCodpcie) {
        this.prfCodpcie = prfCodpcie;
    }

    public Timestamp getPrfFechaHoraCrea() {
        return prfFechaHoraCrea;
    }

    public void setPrfFechaHoraCrea(Timestamp prfFechaHoraCrea) {
        this.prfFechaHoraCrea = prfFechaHoraCrea;
    }

    public Timestamp getPrfFechaHoraModifica() {
        return prfFechaHoraModifica;
    }

    public void setPrfFechaHoraModifica(Timestamp prfFechaHoraModifica) {
        this.prfFechaHoraModifica = prfFechaHoraModifica;
    }

    public String getPrfUsuarioCrea() {
        return prfUsuarioCrea;
    }

    public void setPrfUsuarioCrea(String prfUsuarioCrea) {
        this.prfUsuarioCrea = prfUsuarioCrea;
    }

    public String getPrfUsuarioModifica() {
        return prfUsuarioModifica;
    }

    public void setPrfUsuarioModifica(String prfUsuarioModifica) {
        this.prfUsuarioModifica = prfUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prfId != null ? prfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesion)) {
            return false;
        }
        Profesion other = (Profesion) object;
        if ((this.prfId == null && other.prfId != null) || (this.prfId != null && !this.prfId.equals(other.prfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgProfesion[ prfId=" + prfId + " ]";
    }

}
