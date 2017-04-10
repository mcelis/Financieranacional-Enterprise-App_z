package co.com.cfn.personas.domain.entity;

/**
 * Created by zmiranda on 09/04/2017.
 */
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "CTG_PERIODICIDAD", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "Periodicidad.findAll", query = "SELECT c FROM Periodicidad c")
})
public class Periodicidad {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PED_ID")
    private Long pedId;

    @Basic
    @Column(name = "PED_CODIGO")
    private String pedCodigo;
    @Basic
    @Column(name = "PED_NOMBRE")
    private String pedNombre;
    @Basic
    @Column(name = "PED_NUMERO_DIAS")
    private Integer pedNumeroDias;
    @Basic
    @Column(name = "PED_CODCOBIS")
    private String pedCodcobis;
    @Basic
    @Column(name = "PED_CODPCIE")
    private String pedCodpcie;
    @Basic
    @Column(name = "PED_FECHA_HORA_CREA")
    private Timestamp pedFechaHoraCrea;
    @Basic
    @Column(name = "PED_FECHA_HORA_MODIFICA")
    private Timestamp pedFechaHoraModifica;
    @Basic
    @Column(name = "PED_USUARIO_CREA")
    private String pedUsuarioCrea;
    @Basic
    @Column(name = "PED_USUARIO_MODIFICA")
    private String pedUsuarioModifica;

    public Periodicidad() {
    }

    public Periodicidad(Long pedId) {
        this.pedId = pedId;
    }

    public Periodicidad(Long pedId, String pedCodigo, String pedNombre, Timestamp pedFechaHoraCrea, String pedUsuarioCrea) {
        this.pedId = pedId;
        this.pedCodigo = pedCodigo;
        this.pedNombre = pedNombre;
        this.pedFechaHoraCrea = pedFechaHoraCrea;
        this.pedUsuarioCrea = pedUsuarioCrea;
    }

    public Long getPedId() {
        return pedId;
    }

    public void setPedId(Long pedId) {
        this.pedId = pedId;
    }

    public String getPedCodigo() {
        return pedCodigo;
    }

    public void setPedCodigo(String pedCodigo) {
        this.pedCodigo = pedCodigo;
    }

    public String getPedNombre() {
        return pedNombre;
    }

    public void setPedNombre(String pedNombre) {
        this.pedNombre = pedNombre;
    }

    public Integer getPedNumeroDias() {
        return pedNumeroDias;
    }

    public void setPedNumeroDias(Integer pedNumeroDias) {
        this.pedNumeroDias = pedNumeroDias;
    }

    public String getPedCodcobis() {
        return pedCodcobis;
    }

    public void setPedCodcobis(String pedCodcobis) {
        this.pedCodcobis = pedCodcobis;
    }

    public String getPedCodpcie() {
        return pedCodpcie;
    }

    public void setPedCodpcie(String pedCodpcie) {
        this.pedCodpcie = pedCodpcie;
    }

    public Timestamp getPedFechaHoraCrea() {
        return pedFechaHoraCrea;
    }

    public void setPedFechaHoraCrea(Timestamp pedFechaHoraCrea) {
        this.pedFechaHoraCrea = pedFechaHoraCrea;
    }

    public Timestamp getPedFechaHoraModifica() {
        return pedFechaHoraModifica;
    }

    public void setPedFechaHoraModifica(Timestamp pedFechaHoraModifica) {
        this.pedFechaHoraModifica = pedFechaHoraModifica;
    }

    public String getPedUsuarioCrea() {
        return pedUsuarioCrea;
    }

    public void setPedUsuarioCrea(String pedUsuarioCrea) {
        this.pedUsuarioCrea = pedUsuarioCrea;
    }

    public String getPedUsuarioModifica() {
        return pedUsuarioModifica;
    }

    public void setPedUsuarioModifica(String pedUsuarioModifica) {
        this.pedUsuarioModifica = pedUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedId != null ? pedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Periodicidad)) {
            return false;
        }
        Periodicidad other = (Periodicidad) object;
        if ((this.pedId == null && other.pedId != null) || (this.pedId != null && !this.pedId.equals(other.pedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgPeriodicidad[ pedId=" + pedId + " ]";
    }

}
