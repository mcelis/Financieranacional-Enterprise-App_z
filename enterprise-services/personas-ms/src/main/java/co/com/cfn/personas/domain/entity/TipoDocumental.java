package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "CTG_TIPO_DOCUMENTAL", catalog = "BPM_MDB", schema = "dbo")
@NamedQueries({
        @NamedQuery(name = "TipoDocumental.findAll", query = "SELECT c FROM TipoDocumental c")})
public class TipoDocumental {

    //private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TDO_ID", nullable = false)
    private Integer tdoId;

    @Basic(optional = false)
    @Column(name = "TDO_NOMBRE", nullable = false, length = 200)
    private String tdoNombre;
    @Basic(optional = false)
    @Column(name = "TDO_USUARIO_CREA", nullable = false, length = 20)
    private String tdoUsuarioCrea;
    @Column(name = "TDO_USUARIO_MODIFICA", length = 20)
    private String tdoUsuarioModifica;
    @Basic(optional = false)
    @Column(name = "TDO_FECHA_HORA_CREA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private  Date tdoFechaHoraCrea;
    @Column(name = "TDO_FECHA_HORA_MODIFICA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tdoFechaHoraModifica;
    @Column(name = "TDO_DESCRIPCION", length = 250)
    private String tdoDescripcion;
    @Column(name = "TDO_MESES_VIGENCIA")
    private Integer tdoMesesVigencia;
    @Basic(optional = false)
    @Column(name = "TDO_ES_ANEXO_F", nullable = false)
    private int tdoEsAnexoF;

    public TipoDocumental() {
    }

    public TipoDocumental(Integer tdoId) {
        this.tdoId = tdoId;
    }

    public TipoDocumental(Integer tdoId, String tdoNombre, String tdoDescripcion)
    {
        this.tdoId = tdoId;
        this.tdoNombre = tdoNombre;
        this.tdoDescripcion = tdoDescripcion;
    }

    public TipoDocumental(Integer tdoId, String tdoNombre, String tdoUsuarioCrea, Date tdoFechaHoraCrea, int tdoEsAnexoF) {
        this.tdoId = tdoId;
        this.tdoNombre = tdoNombre;
        this.tdoUsuarioCrea = tdoUsuarioCrea;
        this.tdoFechaHoraCrea = tdoFechaHoraCrea;
        this.tdoEsAnexoF = tdoEsAnexoF;
    }

    public Integer getTdoId() {
        return tdoId;
    }

    public void setTdoId(Integer tdoId) {
        this.tdoId = tdoId;
    }

    public String getTdoNombre() {
        return tdoNombre;
    }

    public void setTdoNombre(String tdoNombre) {
        this.tdoNombre = tdoNombre;
    }

    public String getTdoUsuarioCrea() {
        return tdoUsuarioCrea;
    }

    public void setTdoUsuarioCrea(String tdoUsuarioCrea) {
        this.tdoUsuarioCrea = tdoUsuarioCrea;
    }

    public String getTdoUsuarioModifica() {
        return tdoUsuarioModifica;
    }

    public void setTdoUsuarioModifica(String tdoUsuarioModifica) {
        this.tdoUsuarioModifica = tdoUsuarioModifica;
    }

    public Date getTdoFechaHoraCrea() {
        return tdoFechaHoraCrea;
    }

    public void setTdoFechaHoraCrea(Date tdoFechaHoraCrea) {
        this.tdoFechaHoraCrea = tdoFechaHoraCrea;
    }

    public Date getTdoFechaHoraModifica() {
        return tdoFechaHoraModifica;
    }

    public void setTdoFechaHoraModifica(Date tdoFechaHoraModifica) {
        this.tdoFechaHoraModifica = tdoFechaHoraModifica;
    }

    public String getTdoDescripcion() {
        return tdoDescripcion;
    }

    public void setTdoDescripcion(String tdoDescripcion) {
        this.tdoDescripcion = tdoDescripcion;
    }

    public Integer getTdoMesesVigencia() {
        return tdoMesesVigencia;
    }

    public void setTdoMesesVigencia(Integer tdoMesesVigencia) {
        this.tdoMesesVigencia = tdoMesesVigencia;
    }

    public int getTdoEsAnexoF() {
        return tdoEsAnexoF;
    }

    public void setTdoEsAnexoF(int tdoEsAnexoF) {
        this.tdoEsAnexoF = tdoEsAnexoF;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tdoId != null ? tdoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocumental)) {
            return false;
        }
        TipoDocumental other = (TipoDocumental) object;
        if ((this.tdoId == null && other.tdoId != null) || (this.tdoId != null && !this.tdoId.equals(other.tdoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaentitiescfn.TipoDocumental[ tdoId=" + tdoId + " ]";
    }

}
