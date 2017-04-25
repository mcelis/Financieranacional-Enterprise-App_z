package co.com.cfn.personas.domain.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Mark on 24/4/2017.
 */

@Entity
@Table(name = "CTG_TIPO_DIRECCION", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "TipoDireccion.findAll", query = "SELECT c FROM TipoDireccion c")})

public class TipoDireccion implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TDR_ID")
    private Long tdrId;
    @Basic(optional = false)
    @Column(name = "TDR_CODIGO")
    private String tdrCodigo;
    @Basic(optional = false)
    @Column(name = "TDR_NOMBRE")
    private String tdrNombre;
    @Basic(optional = false)
    @Column(name = "TDR_CODCOBIS")
    private String tdrCodcobis;
    @Column(name = "TDR_CODPCIE")
    private String tdrCodpcie;
    @Basic(optional = false)
    @Column(name = "TDR_FECHA_HORA_CREA")
    private Timestamp tdrFechaHoraCrea;
    @Column(name = "TDR_FECHA_HORA_MODIFICA")
    private Timestamp tdrFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "TDR_USUARIO_CREA")
    private String tdrUsuarioCrea;
    @Column(name = "TDR_USUARIO_MODIFICA")
    private String tdrUsuarioModifica;

    public TipoDireccion() {
    }

    public TipoDireccion(Long tdrId, String tdrCodigo, String tdrNombre, String tdrCodcobis, String tdrCodpcie, Timestamp tdrFechaHoraCrea, Timestamp tdrFechaHoraModifica, String tdrUsuarioCrea, String tdrUsuarioModifica) {
        this.tdrId = tdrId;
        this.tdrCodigo = tdrCodigo;
        this.tdrNombre = tdrNombre;
        this.tdrCodcobis = tdrCodcobis;
        this.tdrCodpcie = tdrCodpcie;
        this.tdrFechaHoraCrea = tdrFechaHoraCrea;
        this.tdrFechaHoraModifica = tdrFechaHoraModifica;
        this.tdrUsuarioCrea = tdrUsuarioCrea;
        this.tdrUsuarioModifica = tdrUsuarioModifica;
    }

    public Long getTdrId() {
        return tdrId;
    }

    public void setTdrId(Long tdrId) {
        this.tdrId = tdrId;
    }

    public String getTdrCodigo() {
        return tdrCodigo;
    }

    public void setTdrCodigo(String tdrCodigo) {
        this.tdrCodigo = tdrCodigo;
    }

    public String getTdrNombre() {
        return tdrNombre;
    }

    public void setTdrNombre(String tdrNombre) {
        this.tdrNombre = tdrNombre;
    }

    public String getTdrCodcobis() {
        return tdrCodcobis;
    }

    public void setTdrCodcobis(String tdrCodcobis) {
        this.tdrCodcobis = tdrCodcobis;
    }

    public String getTdrCodpcie() {
        return tdrCodpcie;
    }

    public void setTdrCodpcie(String tdrCodpcie) {
        this.tdrCodpcie = tdrCodpcie;
    }

    public Timestamp getTdrFechaHoraCrea() {
        return tdrFechaHoraCrea;
    }

    public void setTdrFechaHoraCrea(Timestamp tdrFechaHoraCrea) {
        this.tdrFechaHoraCrea = tdrFechaHoraCrea;
    }

    public Timestamp getTdrFechaHoraModifica() {
        return tdrFechaHoraModifica;
    }

    public void setTdrFechaHoraModifica(Timestamp tdrFechaHoraModifica) {
        this.tdrFechaHoraModifica = tdrFechaHoraModifica;
    }

    public String getTdrUsuarioCrea() {
        return tdrUsuarioCrea;
    }

    public void setTdrUsuarioCrea(String tdrUsuarioCrea) {
        this.tdrUsuarioCrea = tdrUsuarioCrea;
    }

    public String getTdrUsuarioModifica() {
        return tdrUsuarioModifica;
    }

    public void setTdrUsuarioModifica(String tdrUsuarioModifica) {
        this.tdrUsuarioModifica = tdrUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tdrId != null ? tdrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDireccion)) {
            return false;
        }
        TipoDireccion other = (TipoDireccion) object;
        if ((this.tdrId == null && other.tdrId != null) || (this.tdrId != null && !this.tdrId.equals(other.tdrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgTipoDireccion[ tdrId=" + tdrId + " ]";
    }



}
