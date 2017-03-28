package co.com.cfn.personas.domain.entity;

/**
 * Created by zmiranda on 27/03/2017.
 */

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "CTG_NACIONALIDAD", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "Nacionalidad.findAll", query = "SELECT c FROM Nacionalidad c")})
public class Nacionalidad {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NAC_ID")
    private Integer nacId;

    @Basic
    @Column(name = "NAC_CODIGO")
    private String nacCodigo;
    @Basic
    @Column(name = "NAC_NOMBRE")
    private String nacNombre;
    @Basic
    @Column(name = "NAC_CODCOBIS")
    private String nacCodcobis;
    @Basic
    @Column(name = "NAC_CODPCIE")
    private String nacCodpcie;
    @Basic
    @Column(name = "NAC_FECHA_HORA_CREA")
    private Timestamp nacFechaHoraCrea;
    @Basic
    @Column(name = "NAC_FECHA_HORA_MODIFICA")
    private Timestamp nacFechaHoraModifica;
    @Basic
    @Column(name = "NAC_USUARIO_CREA")
    private String nacUsuarioCrea;
    @Basic
    @Column(name = "NAC_USUARIO_MODIFICA")
    private String nacUsuarioModifica;
    //@JoinColumn(name = "PAI_ID", referencedColumnName = "PAI_ID")
    //@ManyToOne(optional = false)
    //private CtgPais paiId;

    public Nacionalidad() {
    }

    public Nacionalidad(Integer nacId, String nacCodigo, String nacNombre, String nacCodcobis, String nacCodpcie, Timestamp nacFechaHoraCrea, Timestamp nacFechaHoraModifica, String nacUsuarioCrea, String nacUsuarioModifica) {
        this.nacId = nacId;
        this.nacCodigo = nacCodigo;
        this.nacNombre = nacNombre;
        this.nacCodcobis = nacCodcobis;
        this.nacCodpcie = nacCodpcie;
        this.nacFechaHoraCrea = nacFechaHoraCrea;
        this.nacFechaHoraModifica = nacFechaHoraModifica;
        this.nacUsuarioCrea = nacUsuarioCrea;
        this.nacUsuarioModifica = nacUsuarioModifica;
    }

    public Nacionalidad(Integer nacId) {
        this.nacId = nacId;
    }

    public Integer getNacId() {
        return nacId;
    }

    public void setNacId(Integer nacId) {
        this.nacId = nacId;
    }

    public String getNacCodigo() {
        return nacCodigo;
    }

    public void setNacCodigo(String nacCodigo) {
        this.nacCodigo = nacCodigo;
    }

    public String getNacNombre() {
        return nacNombre;
    }

    public void setNacNombre(String nacNombre) {
        this.nacNombre = nacNombre;
    }

    public String getNacCodcobis() {
        return nacCodcobis;
    }

    public void setNacCodcobis(String nacCodcobis) {
        this.nacCodcobis = nacCodcobis;
    }

    public String getNacCodpcie() {
        return nacCodpcie;
    }

    public void setNacCodpcie(String nacCodpcie) {
        this.nacCodpcie = nacCodpcie;
    }

    public Timestamp getNacFechaHoraCrea() {
        return nacFechaHoraCrea;
    }

    public void setNacFechaHoraCrea(Timestamp nacFechaHoraCrea) {
        this.nacFechaHoraCrea = nacFechaHoraCrea;
    }

    public Timestamp getNacFechaHoraModifica() {
        return nacFechaHoraModifica;
    }

    public void setNacFechaHoraModifica(Timestamp nacFechaHoraModifica) {
        this.nacFechaHoraModifica = nacFechaHoraModifica;
    }

    public String getNacUsuarioCrea() {
        return nacUsuarioCrea;
    }

    public void setNacUsuarioCrea(String nacUsuarioCrea) {
        this.nacUsuarioCrea = nacUsuarioCrea;
    }

    public String getNacUsuarioModifica() {
        return nacUsuarioModifica;
    }

    public void setNacUsuarioModifica(String nacUsuarioModifica) {
        this.nacUsuarioModifica = nacUsuarioModifica;
    }

    /*
    public CtgPais getPaiId() {
        return paiId;
    }

    public void setPaiId(CtgPais paiId) {
        this.paiId = paiId;
    }
    */

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nacId != null ? nacId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nacionalidad)) {
            return false;
        }
        Nacionalidad other = (Nacionalidad) object;
        if ((this.nacId == null && other.nacId != null) || (this.nacId != null && !this.nacId.equals(other.nacId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgNacionalidad[ nacId=" + nacId + " ]";
    }

}
