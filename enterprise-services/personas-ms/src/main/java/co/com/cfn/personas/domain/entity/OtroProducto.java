package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 6/4/2017.
 */
@Entity
@Table(name = "CTG_OTRO_PRODUCTO", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "OtroProducto.findAll", query = "SELECT c FROM OtroProducto c")})
public class OtroProducto {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "OPR_ID")
    private Integer oprId;
    @Basic(optional = false)
    @Column(name = "OPR_NOMBRE")
    private String oprNombre;
    @Basic(optional = false)
    @Column(name = "OPR_FECHA_HORA_CREA")
    private Timestamp oprFechaHoraCrea;
    @Column(name = "OPR_FECHA_HORA_MODIFICA")
    private Timestamp oprFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "OPR_USUARIO_CREA")
    private String oprUsuarioCrea;
    @Column(name = "OPR_USUARIO_MODIFICA")
    private String oprUsuarioModifica;

    public OtroProducto(){
    }

    public OtroProducto(Integer oprId, String oprNombre, Timestamp oprFechaHoraCrea, Timestamp oprFechaHoraModifica, String oprUsuarioCrea, String oprUsuarioModifica) {
        this.oprId = oprId;
        this.oprNombre = oprNombre;
        this.oprFechaHoraCrea = oprFechaHoraCrea;
        this.oprFechaHoraModifica = oprFechaHoraModifica;
        this.oprUsuarioCrea = oprUsuarioCrea;
        this.oprUsuarioModifica = oprUsuarioModifica;
    }

    public Integer getOprId() {
        return oprId;
    }

    public void setOprId(Integer oprId) {
        this.oprId = oprId;
    }

    public String getOprNombre() {
        return oprNombre;
    }

    public void setOprNombre(String oprNombre) {
        this.oprNombre = oprNombre;
    }

    public Timestamp getOprFechaHoraCrea() {
        return oprFechaHoraCrea;
    }

    public void setOprFechaHoraCrea(Timestamp oprFechaHoraCrea) {
        this.oprFechaHoraCrea = oprFechaHoraCrea;
    }

    public Timestamp getOprFechaHoraModifica() {
        return oprFechaHoraModifica;
    }

    public void setOprFechaHoraModifica(Timestamp oprFechaHoraModifica) {
        this.oprFechaHoraModifica = oprFechaHoraModifica;
    }

    public String getOprUsuarioCrea() {
        return oprUsuarioCrea;
    }

    public void setOprUsuarioCrea(String oprUsuarioCrea) {
        this.oprUsuarioCrea = oprUsuarioCrea;
    }

    public String getOprUsuarioModifica() {
        return oprUsuarioModifica;
    }

    public void setOprUsuarioModifica(String oprUsuarioModifica) {
        this.oprUsuarioModifica = oprUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oprId != null ? oprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OtroProducto)) {
            return false;
        }
        OtroProducto other = (OtroProducto) object;
        if ((this.oprId == null && other.oprId != null) || (this.oprId != null && !this.oprId.equals(other.oprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.OtroProducto[ oprId=" + oprId + " ]";
    }
}
