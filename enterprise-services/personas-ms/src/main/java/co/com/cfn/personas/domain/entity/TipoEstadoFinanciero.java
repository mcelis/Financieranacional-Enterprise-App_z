package co.com.cfn.personas.domain.entity;

/**
 * Created by Mark on 24/4/2017.
 */

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "CTG_TIPO_ESTADO_FINANCIERO", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "TipoEstadoFinanciero.findAll", query = "SELECT c FROM TipoEstadoFinanciero c")})

public class TipoEstadoFinanciero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TEF_ID")
    private Integer tefId;
    @Basic(optional = false)
    @Column(name = "TEF_NOMBRE")
    private String tefNombre;
    @Basic(optional = false)
    @Column(name = "TEF_FECHA_HORA_CREA")
    private Timestamp tefFechaHoraCrea;
    @Column(name = "TEF_FECHA_HORA_MODIFICA")
    private Timestamp tefFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "TEF_USUARIO_CREA")
    private String tefUsuarioCrea;
    @Column(name = "TEF_USUARIO_MODIFICA")
    private String tefUsuarioModifica;

    public TipoEstadoFinanciero() {
    }

    public TipoEstadoFinanciero(Integer tefId, String tefNombre, Timestamp tefFechaHoraCrea, Timestamp tefFechaHoraModifica, String tefUsuarioCrea, String tefUsuarioModifica) {
        this.tefId = tefId;
        this.tefNombre = tefNombre;
        this.tefFechaHoraCrea = tefFechaHoraCrea;
        this.tefFechaHoraModifica = tefFechaHoraModifica;
        this.tefUsuarioCrea = tefUsuarioCrea;
        this.tefUsuarioModifica = tefUsuarioModifica;
    }

    public Integer getTefId() {
        return tefId;
    }

    public void setTefId(Integer tefId) {
        this.tefId = tefId;
    }

    public String getTefNombre() {
        return tefNombre;
    }

    public void setTefNombre(String tefNombre) {
        this.tefNombre = tefNombre;
    }

    public Timestamp getTefFechaHoraCrea() {
        return tefFechaHoraCrea;
    }

    public void setTefFechaHoraCrea(Timestamp tefFechaHoraCrea) {
        this.tefFechaHoraCrea = tefFechaHoraCrea;
    }

    public Timestamp getTefFechaHoraModifica() {
        return tefFechaHoraModifica;
    }

    public void setTefFechaHoraModifica(Timestamp tefFechaHoraModifica) {
        this.tefFechaHoraModifica = tefFechaHoraModifica;
    }

    public String getTefUsuarioCrea() {
        return tefUsuarioCrea;
    }

    public void setTefUsuarioCrea(String tefUsuarioCrea) {
        this.tefUsuarioCrea = tefUsuarioCrea;
    }

    public String getTefUsuarioModifica() {
        return tefUsuarioModifica;
    }

    public void setTefUsuarioModifica(String tefUsuarioModifica) {
        this.tefUsuarioModifica = tefUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tefId != null ? tefId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEstadoFinanciero)) {
            return false;
        }
        TipoEstadoFinanciero other = (TipoEstadoFinanciero) object;
        if ((this.tefId == null && other.tefId != null) || (this.tefId != null && !this.tefId.equals(other.tefId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgTipoEstadoFinanciero[ tefId=" + tefId + " ]";
    }

}
