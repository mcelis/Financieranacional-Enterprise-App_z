package co.com.cfn.personas.domain.entity;

import javax.persistence.*;

import javax.persistence.Entity;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Mark on 21/4/2017.
 */
@Entity
@Table(name = "CTG_TIPO_PROYECTO", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
@NamedQuery(name = "TipoProyecto.findAll", query = "SELECT c FROM TipoProyecto c")})

public class TipoProyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TPR_ID")
    private Integer tprId;
    @Basic(optional = false)
    @Column(name = "TPR_NOMBRE")
    private String tprNombre;
    @Basic(optional = false)
    @Column(name = "TPR_USUARIO_CREA")
    private String tprUsuarioCrea;
    @Column(name = "TPR_USUARIO_MODIFICA")
    private String tprUsuarioModifica;
    @Basic(optional = false)
    @Column(name = "TPR_FECHA_HORA_CREA")
    private Timestamp tprFechaHoraCrea;
    @Column(name = "TPR_FECHA_HORA_MODIFICA")
    private Timestamp tprFechaHoraModifica;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "TipoProyecto")
    private Collection<CtgPorcentFinanXProducto> ctgPorcentFinanXProductoCollection;*/

    public TipoProyecto() {
    }

    public TipoProyecto(Integer tprId, String tprNombre, String tprUsuarioCrea, String tprUsuarioModifica, Timestamp tprFechaHoraCrea, Timestamp tprFechaHoraModifica) {
        this.tprId = tprId;
        this.tprNombre = tprNombre;
        this.tprUsuarioCrea = tprUsuarioCrea;
        this.tprUsuarioModifica = tprUsuarioModifica;
        this.tprFechaHoraCrea = tprFechaHoraCrea;
        this.tprFechaHoraModifica = tprFechaHoraModifica;
    }

    public Integer getTprId() {
        return tprId;
    }

    public void setTprId(Integer tprId) {
        this.tprId = tprId;
    }

    public String getTprNombre() {
        return tprNombre;
    }

    public void setTprNombre(String tprNombre) {
        this.tprNombre = tprNombre;
    }

    public String getTprUsuarioCrea() {
        return tprUsuarioCrea;
    }

    public void setTprUsuarioCrea(String tprUsuarioCrea) {
        this.tprUsuarioCrea = tprUsuarioCrea;
    }

    public String getTprUsuarioModifica() {
        return tprUsuarioModifica;
    }

    public void setTprUsuarioModifica(String tprUsuarioModifica) {
        this.tprUsuarioModifica = tprUsuarioModifica;
    }

    public Timestamp getTprFechaHoraCrea() {
        return tprFechaHoraCrea;
    }

    public void setTprFechaHoraCrea(Timestamp tprFechaHoraCrea) {
        this.tprFechaHoraCrea = tprFechaHoraCrea;
    }

    public Timestamp getTprFechaHoraModifica() {
        return tprFechaHoraModifica;
    }

    public void setTprFechaHoraModifica(Timestamp tprFechaHoraModifica) {
        this.tprFechaHoraModifica = tprFechaHoraModifica;
    }

    /*@XmlTransient
    public Collection<CtgPorcentFinanXProducto> getCtgPorcentFinanXProductoCollection() {
        return ctgPorcentFinanXProductoCollection;
    }

    public void setCtgPorcentFinanXProductoCollection(Collection<CtgPorcentFinanXProducto> ctgPorcentFinanXProductoCollection) {
        this.ctgPorcentFinanXProductoCollection = ctgPorcentFinanXProductoCollection;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tprId != null ? tprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoProyecto)) {
            return false;
        }
        TipoProyecto other = (TipoProyecto) object;
        if ((this.tprId == null && other.tprId != null) || (this.tprId != null && !this.tprId.equals(other.tprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgTipoProyecto[ tprId=" + tprId + " ]";
    }
}
