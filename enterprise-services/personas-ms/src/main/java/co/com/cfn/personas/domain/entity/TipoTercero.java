package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Mark on 24/4/2017.
 */
@Entity
@Table(name = "CTG_TIPO_TERCERO")
@NamedQueries({
        @NamedQuery(name = "TipoTercero.findAll", query = "SELECT c FROM TipoTercero c")})

public class TipoTercero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TTE_ID")
    private Integer tteId;
    @Basic(optional = false)
    @Column(name = "TTE_NOMBRE")
    private String tteNombre;
    @Basic(optional = false)
    @Column(name = "TTE_FECHA_HORA_CREA")
    private Timestamp tteFechaHoraCrea;
    @Column(name = "TTE_FECHA_HORA_MODIFICA")
    private Timestamp tteFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "TTE_USUARIO_CREA")
    private String tteUsuarioCrea;
    @Column(name = "TTE_USUARIO_MODIFICA")
    private String tteUsuarioModifica;

    public TipoTercero() {
    }

    public Integer getTteId() {
        return tteId;
    }

    public void setTteId(Integer tteId) {
        this.tteId = tteId;
    }

    public String getTteNombre() {
        return tteNombre;
    }

    public void setTteNombre(String tteNombre) {
        this.tteNombre = tteNombre;
    }

    public Timestamp getTteFechaHoraCrea() {
        return tteFechaHoraCrea;
    }

    public void setTteFechaHoraCrea(Timestamp tteFechaHoraCrea) {
        this.tteFechaHoraCrea = tteFechaHoraCrea;
    }

    public Timestamp getTteFechaHoraModifica() {
        return tteFechaHoraModifica;
    }

    public void setTteFechaHoraModifica(Timestamp tteFechaHoraModifica) {
        this.tteFechaHoraModifica = tteFechaHoraModifica;
    }

    public String getTteUsuarioCrea() {
        return tteUsuarioCrea;
    }

    public void setTteUsuarioCrea(String tteUsuarioCrea) {
        this.tteUsuarioCrea = tteUsuarioCrea;
    }

    public String getTteUsuarioModifica() {
        return tteUsuarioModifica;
    }

    public void setTteUsuarioModifica(String tteUsuarioModifica) {
        this.tteUsuarioModifica = tteUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tteId != null ? tteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoTercero)) {
            return false;
        }
        TipoTercero other = (TipoTercero) object;
        if ((this.tteId == null && other.tteId != null) || (this.tteId != null && !this.tteId.equals(other.tteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgTipoTercero[ tteId=" + tteId + " ]";
    }


}
