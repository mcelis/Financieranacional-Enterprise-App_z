package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 17/4/2017.
 */
@Entity
@Table(name = "CTG_TIPO_COMPANIA", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "TipoCompania.findAll", query = "SELECT c FROM TipoCompania c")})
public class TipoCompania {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TCO_ID")
    private Integer tcoId;
    @Basic(optional = false)
    @Column(name = "TCO_CODIGO")
    private String tcoCodigo;
    @Basic(optional = false)
    @Column(name = "TCO_NOMBRE")
    private String tcoNombre;
    @Basic(optional = false)
    @Column(name = "TCO_CODCOBIS")
    private String tcoCodcobis;
    @Column(name = "TCO_CODPCIE")
    private String tcoCodpcie;
    @Basic(optional = false)
    @Column(name = "TCO_FECHA_HORA_CREA")
    private Timestamp tcoFechaHoraCrea;
    @Column(name = "TCO_FECHA_HORA_MODIFICA")
    private Timestamp tcoFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "TCO_USUARIO_CREA")
    private String tcoUsuarioCrea;
    @Column(name = "TCO_USUARIO_MODIFICA")
    private String tcoUsuarioModifica;

    public TipoCompania() {
    }

    public TipoCompania(Integer tcoId, String tcoCodigo, String tcoNombre, String tcoCodcobis, String tcoCodpcie, Timestamp tcoFechaHoraCrea, Timestamp tcoFechaHoraModifica, String tcoUsuarioCrea, String tcoUsuarioModifica) {
        this.tcoId = tcoId;
        this.tcoCodigo = tcoCodigo;
        this.tcoNombre = tcoNombre;
        this.tcoCodcobis = tcoCodcobis;
        this.tcoCodpcie = tcoCodpcie;
        this.tcoFechaHoraCrea = tcoFechaHoraCrea;
        this.tcoFechaHoraModifica = tcoFechaHoraModifica;
        this.tcoUsuarioCrea = tcoUsuarioCrea;
        this.tcoUsuarioModifica = tcoUsuarioModifica;
    }

    public Integer getTcoId() {
        return tcoId;
    }

    public void setTcoId(Integer tcoId) {
        this.tcoId = tcoId;
    }

    public String getTcoCodigo() {
        return tcoCodigo;
    }

    public void setTcoCodigo(String tcoCodigo) {
        this.tcoCodigo = tcoCodigo;
    }

    public String getTcoNombre() {
        return tcoNombre;
    }

    public void setTcoNombre(String tcoNombre) {
        this.tcoNombre = tcoNombre;
    }

    public String getTcoCodcobis() {
        return tcoCodcobis;
    }

    public void setTcoCodcobis(String tcoCodcobis) {
        this.tcoCodcobis = tcoCodcobis;
    }

    public String getTcoCodpcie() {
        return tcoCodpcie;
    }

    public void setTcoCodpcie(String tcoCodpcie) {
        this.tcoCodpcie = tcoCodpcie;
    }

    public Timestamp getTcoFechaHoraCrea() {
        return tcoFechaHoraCrea;
    }

    public void setTcoFechaHoraCrea(Timestamp tcoFechaHoraCrea) {
        this.tcoFechaHoraCrea = tcoFechaHoraCrea;
    }

    public Timestamp getTcoFechaHoraModifica() {
        return tcoFechaHoraModifica;
    }

    public void setTcoFechaHoraModifica(Timestamp tcoFechaHoraModifica) {
        this.tcoFechaHoraModifica = tcoFechaHoraModifica;
    }

    public String getTcoUsuarioCrea() {
        return tcoUsuarioCrea;
    }

    public void setTcoUsuarioCrea(String tcoUsuarioCrea) {
        this.tcoUsuarioCrea = tcoUsuarioCrea;
    }

    public String getTcoUsuarioModifica() {
        return tcoUsuarioModifica;
    }

    public void setTcoUsuarioModifica(String tcoUsuarioModifica) {
        this.tcoUsuarioModifica = tcoUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tcoId != null ? tcoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoCompania)) {
            return false;
        }
        TipoCompania other = (TipoCompania) object;
        if ((this.tcoId == null && other.tcoId != null) || (this.tcoId != null && !this.tcoId.equals(other.tcoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgTipoCompania[ tcoId=" + tcoId + " ]";
    }
}
