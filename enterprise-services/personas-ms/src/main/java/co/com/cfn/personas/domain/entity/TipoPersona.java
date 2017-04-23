package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;



/**
 * Created by Mark on 22/4/2017.
 */
@Entity
@Table(name = "CTG_TIPO_PERSONA", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "TipoPersona.findAll", query = "SELECT c FROM TipoPersona c")})

public class TipoPersona implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TPE_ID")
    private Integer tpeId;
    @Basic(optional = false)
    @Column(name = "TPE_NOMBRE")
    private String tpeNombre;
    @Basic(optional = false)
    @Column(name = "TPE_USUARIO_CREA")
    private String tpeUsuarioCrea;
    @Column(name = "TPE_USUARIO_MODIFICA")
    private String tpeUsuarioModifica;
    @Basic(optional = false)
    @Column(name = "TPE_FECHA_HORA_CREA")
    private Timestamp tpeFechaHoraCrea;
    @Column(name = "TPE_FECHA_HORA_MODIFICA")
    private Timestamp tpeFechaHoraModifica;

    public TipoPersona(){
    }

    public TipoPersona(Integer tpeId, String tpeNombre, String tpeUsuarioCrea, String tpeUsuarioModifica, Timestamp tpeFechaHoraCrea, Timestamp tpeFechaHoraModifica) {
        this.tpeId = tpeId;
        this.tpeNombre = tpeNombre;
        this.tpeUsuarioCrea = tpeUsuarioCrea;
        this.tpeUsuarioModifica = tpeUsuarioModifica;
        this.tpeFechaHoraCrea = tpeFechaHoraCrea;
        this.tpeFechaHoraModifica = tpeFechaHoraModifica;
    }

    public Integer getTpeId() {
        return tpeId;
    }

    public void setTpeId(Integer tpeId) {
        this.tpeId = tpeId;
    }

    public String getTpeNombre() {
        return tpeNombre;
    }

    public void setTpeNombre(String tpeNombre) {
        this.tpeNombre = tpeNombre;
    }

    public String getTpeUsuarioCrea() {
        return tpeUsuarioCrea;
    }

    public void setTpeUsuarioCrea(String tpeUsuarioCrea) {
        this.tpeUsuarioCrea = tpeUsuarioCrea;
    }

    public String getTpeUsuarioModifica() {
        return tpeUsuarioModifica;
    }

    public void setTpeUsuarioModifica(String tpeUsuarioModifica) {
        this.tpeUsuarioModifica = tpeUsuarioModifica;
    }

    public Timestamp getTpeFechaHoraCrea() {
        return tpeFechaHoraCrea;
    }

    public void setTpeFechaHoraCrea(Timestamp tpeFechaHoraCrea) {
        this.tpeFechaHoraCrea = tpeFechaHoraCrea;
    }

    public Timestamp getTpeFechaHoraModifica() {
        return tpeFechaHoraModifica;
    }

    public void setTpeFechaHoraModifica(Timestamp tpeFechaHoraModifica) {
        this.tpeFechaHoraModifica = tpeFechaHoraModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpeId != null ? tpeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPersona)) {
            return false;
        }
        TipoPersona other = (TipoPersona) object;
        if ((this.tpeId == null && other.tpeId != null) || (this.tpeId != null && !this.tpeId.equals(other.tpeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgTipoPersona[ tpeId=" + tpeId + " ]";
    }

}
