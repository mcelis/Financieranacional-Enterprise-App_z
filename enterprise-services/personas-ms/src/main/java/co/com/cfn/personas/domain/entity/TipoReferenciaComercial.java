package co.com.cfn.personas.domain.entity;

/**
 * Created by Mark on 24/4/2017.
 */

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "CTG_TIPO_REFERENCIA_COMERCIAL", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "TipoReferenciaComercial.findAll", query = "SELECT c FROM TipoReferenciaComercial c")})

public class TipoReferenciaComercial implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TRC_ID")
    private Long trcId;
    @Basic(optional = false)
    @Column(name = "TRC_CODIGO")
    private String trcCodigo;
    @Basic(optional = false)
    @Column(name = "TRC_NOMBRE")
    private String trcNombre;
    @Basic(optional = false)
    @Column(name = "TRC_CODCOBIS")
    private String trcCodcobis;
    @Column(name = "TRC_CODPCIE")
    private String trcCodpcie;
    @Column(name = "TRC_FECHA_HORA_CREA")
    private Timestamp trcFechaHoraCrea;
    @Column(name = "TRC_FECHA_HORA_MODIFICA")
    private Timestamp trcFechaHoraModifica;
    @Column(name = "TRC_USUARIO_CREA")
    private String trcUsuarioCrea;
    @Column(name = "TRC_USUARIO_MODIFICA")
    private String trcUsuarioModifica;

    public TipoReferenciaComercial() {
    }

    public TipoReferenciaComercial(Long trcId, String trcCodigo, String trcNombre, String trcCodcobis, String trcCodpcie, Timestamp trcFechaHoraCrea, Timestamp trcFechaHoraModifica, String trcUsuarioCrea, String trcUsuarioModifica) {
        this.trcId = trcId;
        this.trcCodigo = trcCodigo;
        this.trcNombre = trcNombre;
        this.trcCodcobis = trcCodcobis;
        this.trcCodpcie = trcCodpcie;
        this.trcFechaHoraCrea = trcFechaHoraCrea;
        this.trcFechaHoraModifica = trcFechaHoraModifica;
        this.trcUsuarioCrea = trcUsuarioCrea;
        this.trcUsuarioModifica = trcUsuarioModifica;
    }

    public Long getTrcId() {
        return trcId;
    }

    public void setTrcId(Long trcId) {
        this.trcId = trcId;
    }

    public String getTrcCodigo() {
        return trcCodigo;
    }

    public void setTrcCodigo(String trcCodigo) {
        this.trcCodigo = trcCodigo;
    }

    public String getTrcNombre() {
        return trcNombre;
    }

    public void setTrcNombre(String trcNombre) {
        this.trcNombre = trcNombre;
    }

    public String getTrcCodcobis() {
        return trcCodcobis;
    }

    public void setTrcCodcobis(String trcCodcobis) {
        this.trcCodcobis = trcCodcobis;
    }

    public String getTrcCodpcie() {
        return trcCodpcie;
    }

    public void setTrcCodpcie(String trcCodpcie) {
        this.trcCodpcie = trcCodpcie;
    }

    public Timestamp getTrcFechaHoraCrea() {
        return trcFechaHoraCrea;
    }

    public void setTrcFechaHoraCrea(Timestamp trcFechaHoraCrea) {
        this.trcFechaHoraCrea = trcFechaHoraCrea;
    }

    public Timestamp getTrcFechaHoraModifica() {
        return trcFechaHoraModifica;
    }

    public void setTrcFechaHoraModifica(Timestamp trcFechaHoraModifica) {
        this.trcFechaHoraModifica = trcFechaHoraModifica;
    }

    public String getTrcUsuarioCrea() {
        return trcUsuarioCrea;
    }

    public void setTrcUsuarioCrea(String trcUsuarioCrea) {
        this.trcUsuarioCrea = trcUsuarioCrea;
    }

    public String getTrcUsuarioModifica() {
        return trcUsuarioModifica;
    }

    public void setTrcUsuarioModifica(String trcUsuarioModifica) {
        this.trcUsuarioModifica = trcUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trcId != null ? trcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoReferenciaComercial)) {
            return false;
        }
        TipoReferenciaComercial other = (TipoReferenciaComercial) object;
        if ((this.trcId == null && other.trcId != null) || (this.trcId != null && !this.trcId.equals(other.trcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgTipoReferenciaComercial[ trcId=" + trcId + " ]";
    }

}
