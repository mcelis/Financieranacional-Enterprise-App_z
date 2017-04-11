package co.com.cfn.personas.domain.entity;

/**
 * Created by zmiranda on 09/04/2017.
 */
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "CTG_PROVINCIA", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "Provincia.findAll", query = "SELECT c FROM Provincia c")
        , @NamedQuery(name = "Provincia.findByPaiId", query = "SELECT c FROM Provincia c WHERE c.paiId = :paiId")
})
public class Provincia {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PRO_ID")
    private Integer proId;

    @Basic
    @Column(name = "PRO_CODIGO")
    private String proCodigo;
    @Basic
    @Column(name = "PRO_NOMBRE")
    private String proNombre;
    @Basic
    @Column(name = "PRO_CODCOBIS")
    private String proCodcobis;
    @Basic
    @Column(name = "PRO_CODPCIE")
    private String proCodpcie;
    @Basic
    @Column(name = "PRO_FECHA_HORA_CREA")
    private Timestamp proFechaHoraCrea;
    @Basic
    @Column(name = "PRO_FECHA_HORA_MODIFICA")
    private Timestamp proFechaHoraModifica;
    @Basic
    @Column(name = "PRO_USUARIO_CREA")
    private String proUsuarioCrea;
    @Basic
    @Column(name = "PRO_USUARIO_MODIFICA")
    private String proUsuarioModifica;
    @Basic
    @Column(name = "PAI_ID")
    private Integer paiId;


    /*@JoinColumn(name = "PAI_ID", referencedColumnName = "PAI_ID")
    @ManyToOne
    private CtgPais paiId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proId")
    private Collection<CtgCanton> ctgCantonCollection;*/

    public Provincia() {
    }

    public Provincia(Integer proId, String proCodigo, String proNombre, String proCodcobis, String proCodpcie, Timestamp proFechaHoraCrea, Timestamp proFechaHoraModifica, String proUsuarioCrea, String proUsuarioModifica, Integer paiId) {
        this.proId = proId;
        this.proCodigo = proCodigo;
        this.proNombre = proNombre;
        this.proCodcobis = proCodcobis;
        this.proCodpcie = proCodpcie;
        this.proFechaHoraCrea = proFechaHoraCrea;
        this.proFechaHoraModifica = proFechaHoraModifica;
        this.proUsuarioCrea = proUsuarioCrea;
        this.proUsuarioModifica = proUsuarioModifica;
        this.paiId = paiId;
    }

    public Provincia(Integer proId) {
        this.proId = proId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(String proCodigo) {
        this.proCodigo = proCodigo;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public String getProCodcobis() {
        return proCodcobis;
    }

    public void setProCodcobis(String proCodcobis) {
        this.proCodcobis = proCodcobis;
    }

    public String getProCodpcie() {
        return proCodpcie;
    }

    public void setProCodpcie(String proCodpcie) {
        this.proCodpcie = proCodpcie;
    }

    public Timestamp getProFechaHoraCrea() {
        return proFechaHoraCrea;
    }

    public void setProFechaHoraCrea(Timestamp proFechaHoraCrea) {
        this.proFechaHoraCrea = proFechaHoraCrea;
    }

    public Timestamp getProFechaHoraModifica() {
        return proFechaHoraModifica;
    }

    public void setProFechaHoraModifica(Timestamp proFechaHoraModifica) {
        this.proFechaHoraModifica = proFechaHoraModifica;
    }

    public String getProUsuarioCrea() {
        return proUsuarioCrea;
    }

    public void setProUsuarioCrea(String proUsuarioCrea) {
        this.proUsuarioCrea = proUsuarioCrea;
    }

    public String getProUsuarioModifica() {
        return proUsuarioModifica;
    }

    public void setProUsuarioModifica(String proUsuarioModifica) {
        this.proUsuarioModifica = proUsuarioModifica;
    }

    public Integer getPaiId() {
        return paiId;
    }

    public void setPaiId(Integer paiId) {
        this.paiId = paiId;
    }


    /*
    public CtgPais getPaiId() {
        return paiId;
    }

    public void setPaiId(CtgPais paiId) {
        this.paiId = paiId;
    }

    @XmlTransient
    public Collection<CtgCanton> getCtgCantonCollection() {
        return ctgCantonCollection;
    }

    public void setCtgCantonCollection(Collection<CtgCanton> ctgCantonCollection) {
        this.ctgCantonCollection = ctgCantonCollection;
    }
    */

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proId != null ? proId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Provincia)) {
            return false;
        }
        Provincia other = (Provincia) object;
        if ((this.proId == null && other.proId != null) || (this.proId != null && !this.proId.equals(other.proId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgProvincia[ proId=" + proId + " ]";
    }

}
