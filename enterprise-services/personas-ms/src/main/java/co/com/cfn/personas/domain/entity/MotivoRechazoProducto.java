package co.com.cfn.personas.domain.entity;



import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 8/4/2017.
 */
@Entity
@Table(name = "CTG_MOTIVO_RECHAZO_PRODUCTO",schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "MotivoRechazoProducto.findAll", query = "SELECT c FROM MotivoRechazoProducto c")})
public class MotivoRechazoProducto {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MRP_ID")
    private Integer mrpId;
    @Basic(optional = false)
    @Column(name = "MRP_NOMBRE")
    private String mrpNombre;
    @Basic(optional = false)
    @Column(name = "MRP_FECHA_HORA_CREA")
    private Timestamp mrpFechaHoraCrea;
    @Column(name = "MRP_FECHA_HORA_MODIFICA")
    private Timestamp mrpFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "MRP_USUARIO_CREA")
    private String mrpUsuarioCrea;
    @Column(name = "MRP_USUARIO_MODIFICA")
    private String mrpUsuarioModifica;

    public MotivoRechazoProducto(){
    }

    public MotivoRechazoProducto(Integer mrpId, String mrpNombre, Timestamp mrpFechaHoraCrea, Timestamp mrpFechaHoraModifica, String mrpUsuarioCrea, String mrpUsuarioModifica) {
        this.mrpId = mrpId;
        this.mrpNombre = mrpNombre;
        this.mrpFechaHoraCrea = mrpFechaHoraCrea;
        this.mrpFechaHoraModifica = mrpFechaHoraModifica;
        this.mrpUsuarioCrea = mrpUsuarioCrea;
        this.mrpUsuarioModifica = mrpUsuarioModifica;
    }

    public Integer getMrpId() {
        return mrpId;
    }

    public void setMrpId(Integer mrpId) {
        this.mrpId = mrpId;
    }

    public String getMrpNombre() {
        return mrpNombre;
    }

    public void setMrpNombre(String mrpNombre) {
        this.mrpNombre = mrpNombre;
    }

    public Timestamp getMrpFechaHoraCrea() {
        return mrpFechaHoraCrea;
    }

    public void setMrpFechaHoraCrea(Timestamp mrpFechaHoraCrea) {
        this.mrpFechaHoraCrea = mrpFechaHoraCrea;
    }

    public Timestamp getMrpFechaHoraModifica() {
        return mrpFechaHoraModifica;
    }

    public void setMrpFechaHoraModifica(Timestamp mrpFechaHoraModifica) {
        this.mrpFechaHoraModifica = mrpFechaHoraModifica;
    }

    public String getMrpUsuarioCrea() {
        return mrpUsuarioCrea;
    }

    public void setMrpUsuarioCrea(String mrpUsuarioCrea) {
        this.mrpUsuarioCrea = mrpUsuarioCrea;
    }

    public String getMrpUsuarioModifica() {
        return mrpUsuarioModifica;
    }

    public void setMrpUsuarioModifica(String mrpUsuarioModifica) {
        this.mrpUsuarioModifica = mrpUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mrpId != null ? mrpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotivoRechazoProducto)) {
            return false;
        }
        MotivoRechazoProducto other = (MotivoRechazoProducto) object;
        if ((this.mrpId == null && other.mrpId != null) || (this.mrpId != null && !this.mrpId.equals(other.mrpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgMotivoRechazoProducto[ mrpId=" + mrpId + " ]";
    }

}
