package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 9/4/2017.
 */
@Entity
@Table(name = "CTG_MONEDA", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "Moneda.findAll", query = "SELECT c FROM Moneda c")})

public class Moneda {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MON_ID")
    private Integer monId;
    @Column(name = "MON_CODIGO")
    private String monCodigo;
    @Column(name = "MON_NOMBRE")
    private String monNombre;
    @Column(name = "MON_CODCOBIS")
    private String monCodcobis;
    @Column(name = "MON_CODPCIE")
    private String monCodpcie;
    @Column(name = "MON_FECHA_HORA_CREA")
    private Timestamp monFechaHoraCrea;
    @Column(name = "MON_FECHA_HORA_MODIFICA")
    private Timestamp monFechaHoraModifica;
    @Column(name = "MON_USUARIO_CREA")
    private String monUsuarioCrea;
    @Column(name = "MON_USUARIO_MODIFICA")
    private String monUsuarioModifica;

    public Moneda(){
    }

    public Moneda(Integer monId, String monCodigo, String monNombre, String monCodcobis, String monCodpcie, Timestamp monFechaHoraCrea, Timestamp monFechaHoraModifica, String monUsuarioCrea, String monUsuarioModifica) {
        this.monId = monId;
        this.monCodigo = monCodigo;
        this.monNombre = monNombre;
        this.monCodcobis = monCodcobis;
        this.monCodpcie = monCodpcie;
        this.monFechaHoraCrea = monFechaHoraCrea;
        this.monFechaHoraModifica = monFechaHoraModifica;
        this.monUsuarioCrea = monUsuarioCrea;
        this.monUsuarioModifica = monUsuarioModifica;
    }

    public Integer getMonId() {
        return monId;
    }

    public void setMonId(Integer monId) {
        this.monId = monId;
    }

    public String getMonCodigo() {
        return monCodigo;
    }

    public void setMonCodigo(String monCodigo) {
        this.monCodigo = monCodigo;
    }

    public String getMonNombre() {
        return monNombre;
    }

    public void setMonNombre(String monNombre) {
        this.monNombre = monNombre;
    }

    public String getMonCodcobis() {
        return monCodcobis;
    }

    public void setMonCodcobis(String monCodcobis) {
        this.monCodcobis = monCodcobis;
    }

    public String getMonCodpcie() {
        return monCodpcie;
    }

    public void setMonCodpcie(String monCodpcie) {
        this.monCodpcie = monCodpcie;
    }

    public Timestamp getMonFechaHoraCrea() {
        return monFechaHoraCrea;
    }

    public void setMonFechaHoraCrea(Timestamp monFechaHoraCrea) {
        this.monFechaHoraCrea = monFechaHoraCrea;
    }

    public Timestamp getMonFechaHoraModifica() {
        return monFechaHoraModifica;
    }

    public void setMonFechaHoraModifica(Timestamp monFechaHoraModifica) {
        this.monFechaHoraModifica = monFechaHoraModifica;
    }

    public String getMonUsuarioCrea() {
        return monUsuarioCrea;
    }

    public void setMonUsuarioCrea(String monUsuarioCrea) {
        this.monUsuarioCrea = monUsuarioCrea;
    }

    public String getMonUsuarioModifica() {
        return monUsuarioModifica;
    }

    public void setMonUsuarioModifica(String monUsuarioModifica) {
        this.monUsuarioModifica = monUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (monId != null ? monId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moneda)) {
            return false;
        }
        Moneda other = (Moneda) object;
        if ((this.monId == null && other.monId != null) || (this.monId != null && !this.monId.equals(other.monId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Moneda[ monId=" + monId + " ]";
    }

}
