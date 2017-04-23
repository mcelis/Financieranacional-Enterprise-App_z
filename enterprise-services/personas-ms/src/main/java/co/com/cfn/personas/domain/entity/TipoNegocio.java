package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Mark on 21/4/2017.
 */
@Entity
@Table(name = "CTG_TIPO_NEGOCIO", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
@NamedQuery(name = "TipoNegocio.findAll", query = "SELECT c FROM TipoNegocio c")})
public class TipoNegocio implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TNE_ID")
    private Integer tneId;
    @Basic(optional = false)
    @Column(name = "TNE_NOMBRE")
    private String tneNombre;
    @Basic(optional = false)
    @Column(name = "TNE_FECHA_HORA_CREA")
    private Timestamp tneFechaHoraCrea;
    @Column(name = "TNE_FECHA_HORA_MODIFICA")
    private Timestamp tneFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "TNE_USUARIO_CREA")
    private String tneUsuarioCrea;
    @Column(name = "TNE_USUARIO_MODIFICA")
    private String tneUsuarioModifica;

    public TipoNegocio() {
    }

    public TipoNegocio(Integer tneId, String tneNombre, Timestamp tneFechaHoraCrea, Timestamp tneFechaHoraModifica, String tneUsuarioCrea, String tneUsuarioModifica) {
        this.tneId = tneId;
        this.tneNombre = tneNombre;
        this.tneFechaHoraCrea = tneFechaHoraCrea;
        this.tneFechaHoraModifica = tneFechaHoraModifica;
        this.tneUsuarioCrea = tneUsuarioCrea;
        this.tneUsuarioModifica = tneUsuarioModifica;
    }

    public Integer getTneId() {
        return tneId;
    }

    public void setTneId(Integer tneId) {
        this.tneId = tneId;
    }

    public String getTneNombre() {
        return tneNombre;
    }

    public void setTneNombre(String tneNombre) {
        this.tneNombre = tneNombre;
    }

    public Timestamp getTneFechaHoraCrea() {
        return tneFechaHoraCrea;
    }

    public void setTneFechaHoraCrea(Timestamp tneFechaHoraCrea) {
        this.tneFechaHoraCrea = tneFechaHoraCrea;
    }

    public Timestamp getTneFechaHoraModifica() {
        return tneFechaHoraModifica;
    }

    public void setTneFechaHoraModifica(Timestamp tneFechaHoraModifica) {
        this.tneFechaHoraModifica = tneFechaHoraModifica;
    }

    public String getTneUsuarioCrea() {
        return tneUsuarioCrea;
    }

    public void setTneUsuarioCrea(String tneUsuarioCrea) {
        this.tneUsuarioCrea = tneUsuarioCrea;
    }

    public String getTneUsuarioModifica() {
        return tneUsuarioModifica;
    }

    public void setTneUsuarioModifica(String tneUsuarioModifica) {
        this.tneUsuarioModifica = tneUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tneId != null ? tneId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoNegocio)) {
            return false;
        }
        TipoNegocio other = (TipoNegocio) object;
        if ((this.tneId == null && other.tneId != null) || (this.tneId != null && !this.tneId.equals(other.tneId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgTipoNegocio[ tneId=" + tneId + " ]";
    }



}
