package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Mark on 24/4/2017.
 */
@Entity
@Table(name = "CTG_TIPO_UNIDAD_MEDIDA", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "TipoUnidadMedida.findAll", query = "SELECT c FROM TipoUnidadMedida c")})

public class TipoUnidadMedida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TUM_ID")
    private Integer tumId;
    @Basic(optional = false)
    @Column(name = "TUM_NOMBRE")
    private String tumNombre;
    @Basic(optional = false)
    @Column(name = "TUM_USUARIO_CREA")
    private String tumUsuarioCrea;
    @Column(name = "TUM_USUARIO_MODIFICA")
    private String tumUsuarioModifica;
    @Basic(optional = false)
    @Column(name = "TUM_FECHA_HORA_CREA")
    private Timestamp tumFechaHoraCrea;
    @Column(name = "TUM_FECHA_HORA_MODIFICA")
    private Timestamp tumFechaHoraModifica;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "tumId")
    private Collection<CtgVariableXProducto> ctgVariableXProductoCollection;*/

    public TipoUnidadMedida() {
    }

    public TipoUnidadMedida(Integer tumId, String tumNombre, String tumUsuarioCrea, String tumUsuarioModifica, Timestamp tumFechaHoraCrea, Timestamp tumFechaHoraModifica) {
        this.tumId = tumId;
        this.tumNombre = tumNombre;
        this.tumUsuarioCrea = tumUsuarioCrea;
        this.tumUsuarioModifica = tumUsuarioModifica;
        this.tumFechaHoraCrea = tumFechaHoraCrea;
        this.tumFechaHoraModifica = tumFechaHoraModifica;
    }

    public Integer getTumId() {
        return tumId;
    }

    public void setTumId(Integer tumId) {
        this.tumId = tumId;
    }

    public String getTumNombre() {
        return tumNombre;
    }

    public void setTumNombre(String tumNombre) {
        this.tumNombre = tumNombre;
    }

    public String getTumUsuarioCrea() {
        return tumUsuarioCrea;
    }

    public void setTumUsuarioCrea(String tumUsuarioCrea) {
        this.tumUsuarioCrea = tumUsuarioCrea;
    }

    public String getTumUsuarioModifica() {
        return tumUsuarioModifica;
    }

    public void setTumUsuarioModifica(String tumUsuarioModifica) {
        this.tumUsuarioModifica = tumUsuarioModifica;
    }

    public Timestamp getTumFechaHoraCrea() {
        return tumFechaHoraCrea;
    }

    public void setTumFechaHoraCrea(Timestamp tumFechaHoraCrea) {
        this.tumFechaHoraCrea = tumFechaHoraCrea;
    }

    public Timestamp getTumFechaHoraModifica() {
        return tumFechaHoraModifica;
    }

    public void setTumFechaHoraModifica(Timestamp tumFechaHoraModifica) {
        this.tumFechaHoraModifica = tumFechaHoraModifica;
    }

    /*
    @XmlTransient
    public Collection<CtgVariableXProducto> getCtgVariableXProductoCollection() {
        return ctgVariableXProductoCollection;
    }

    public void setCtgVariableXProductoCollection(Collection<CtgVariableXProducto> ctgVariableXProductoCollection) {
        this.ctgVariableXProductoCollection = ctgVariableXProductoCollection;
    }
    */

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tumId != null ? tumId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoUnidadMedida)) {
            return false;
        }
        TipoUnidadMedida other = (TipoUnidadMedida) object;
        if ((this.tumId == null && other.tumId != null) || (this.tumId != null && !this.tumId.equals(other.tumId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgTipoUnidadMedida[ tumId=" + tumId + " ]";
    }

}
