package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 8/4/2017.
 */
@Entity
@Table(name = "CTG_MOTIVO_RECHAZO_SOLICITUD", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
    @NamedQuery(name = "MotivoRechazoSolicitud.findAll", query = "SELECT c FROM MotivoRechazoSolicitud c")})
public class MotivoRechazoSolicitud {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MRS_ID")
    private Integer mrsId;
    @Basic(optional = false)
    @Column(name = "MRS_NOMBRE")
    private String mrsNombre;
    @Basic(optional = false)
    @Column(name = "MRS_FECHA_HORA_CREA")
    private Timestamp mrsFechaHoraCrea;
    @Column(name = "MRS_FECHA_HORA_MODIFICA")
    private Timestamp mrsFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "MRS_USUARIO_CREA")
    private String mrsUsuarioCrea;
    @Column(name = "MRS_USUARIO_MODIFICA")
    private String mrsUsuarioModifica;
    @Basic(optional = false)
    @Column(name = "MRS_ABREV_MACRO_PROCESO")
    private String mrsAbrevMacroProceso;

    public MotivoRechazoSolicitud(){
    }

    public MotivoRechazoSolicitud(Integer mrsId, String mrsNombre, Timestamp mrsFechaHoraCrea, Timestamp mrsFechaHoraModifica, String mrsUsuarioCrea, String mrsUsuarioModifica, String mrsAbrevMacroProceso) {
        this.mrsId = mrsId;
        this.mrsNombre = mrsNombre;
        this.mrsFechaHoraCrea = mrsFechaHoraCrea;
        this.mrsFechaHoraModifica = mrsFechaHoraModifica;
        this.mrsUsuarioCrea = mrsUsuarioCrea;
        this.mrsUsuarioModifica = mrsUsuarioModifica;
        this.mrsAbrevMacroProceso = mrsAbrevMacroProceso;
    }

    public Integer getMrsId() {
        return mrsId;
    }

    public void setMrsId(Integer mrsId) {
        this.mrsId = mrsId;
    }

    public String getMrsNombre() {
        return mrsNombre;
    }

    public void setMrsNombre(String mrsNombre) {
        this.mrsNombre = mrsNombre;
    }

    public Timestamp getMrsFechaHoraCrea() {
        return mrsFechaHoraCrea;
    }

    public void setMrsFechaHoraCrea(Timestamp mrsFechaHoraCrea) {
        this.mrsFechaHoraCrea = mrsFechaHoraCrea;
    }

    public Timestamp getMrsFechaHoraModifica() {
        return mrsFechaHoraModifica;
    }

    public void setMrsFechaHoraModifica(Timestamp mrsFechaHoraModifica) {
        this.mrsFechaHoraModifica = mrsFechaHoraModifica;
    }

    public String getMrsUsuarioCrea() {
        return mrsUsuarioCrea;
    }

    public void setMrsUsuarioCrea(String mrsUsuarioCrea) {
        this.mrsUsuarioCrea = mrsUsuarioCrea;
    }

    public String getMrsUsuarioModifica() {
        return mrsUsuarioModifica;
    }

    public void setMrsUsuarioModifica(String mrsUsuarioModifica) {
        this.mrsUsuarioModifica = mrsUsuarioModifica;
    }

    public String getMrsAbrevMacroProceso() {
        return mrsAbrevMacroProceso;
    }

    public void setMrsAbrevMacroProceso(String mrsAbrevMacroProceso) {
        this.mrsAbrevMacroProceso = mrsAbrevMacroProceso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mrsId != null ? mrsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotivoRechazoSolicitud)) {
            return false;
        }
        MotivoRechazoSolicitud other = (MotivoRechazoSolicitud) object;
        if ((this.mrsId == null && other.mrsId != null) || (this.mrsId != null && !this.mrsId.equals(other.mrsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.MotivoRechazoSolicitud[ mrsId=" + mrsId + " ]";
    }

}
