package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 23/3/2017.
 */

@Entity
@Table(name = "CTG_TIPO_TRAMITE")
@NamedQueries({
        @NamedQuery(name = "TipoTramite.findAll", query = "SELECT c FROM TipoTramite c")})

public class TipoTramite {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TTR_ID")
    private Integer ttrId;
    @Basic(optional = false)
    @Column(name = "TTR_NOMBRE")
    private String ttrNombre;
    @Basic(optional = false)
    @Column(name = "TTR_USUARIO_CREA")
    private String ttrUsuarioCrea;
    @Column(name = "TTR_USUARIO_MODIFICA")
    private String ttrUsuarioModifica;
    @Basic(optional = false)
    @Column(name = "TTR_FECHA_HORA_CREA")
    private Timestamp ttrFechaHoraCrea;
    @Column(name = "TTR_FECHA_HORA_MODIFICA")
    private Timestamp ttrFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "TTR_SE_PUEDE_VOLVER_SOL_F")
    private int ttrSePuedeVolverSolF;

    public TipoTramite() {
    }

    public TipoTramite(Integer ttrId) {
        this.ttrId = ttrId;
    }

    public TipoTramite(Integer ttrId, String ttrNombre, String ttrUsuarioCrea, Timestamp ttrFechaHoraCrea, int ttrSePuedeVolverSolF) {
        this.ttrId = ttrId;
        this.ttrNombre = ttrNombre;
        this.ttrUsuarioCrea = ttrUsuarioCrea;
        this.ttrFechaHoraCrea = ttrFechaHoraCrea;
        this.ttrSePuedeVolverSolF = ttrSePuedeVolverSolF;
    }

    public Integer getTtrId() {
        return ttrId;
    }

    public void setTtrId(Integer ttrId) {
        this.ttrId = ttrId;
    }

    public String getTtrNombre() {
        return ttrNombre;
    }

    public void setTtrNombre(String ttrNombre) {
        this.ttrNombre = ttrNombre;
    }

    public String getTtrUsuarioCrea() {
        return ttrUsuarioCrea;
    }

    public void setTtrUsuarioCrea(String ttrUsuarioCrea) {
        this.ttrUsuarioCrea = ttrUsuarioCrea;
    }

    public String getTtrUsuarioModifica() {
        return ttrUsuarioModifica;
    }

    public void setTtrUsuarioModifica(String ttrUsuarioModifica) {
        this.ttrUsuarioModifica = ttrUsuarioModifica;
    }

    public Timestamp getTtrFechaHoraCrea() {
        return ttrFechaHoraCrea;
    }

    public void setTtrFechaHoraCrea(Timestamp ttrFechaHoraCrea) {
        this.ttrFechaHoraCrea = ttrFechaHoraCrea;
    }

    public Timestamp getTtrFechaHoraModifica() {
        return ttrFechaHoraModifica;
    }

    public void setTtrFechaHoraModifica(Timestamp ttrFechaHoraModifica) {
        this.ttrFechaHoraModifica = ttrFechaHoraModifica;
    }

    public int getTtrSePuedeVolverSolF() {
        return ttrSePuedeVolverSolF;
    }

    public void setTtrSePuedeVolverSolF(int ttrSePuedeVolverSolF) {
        this.ttrSePuedeVolverSolF = ttrSePuedeVolverSolF;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ttrId != null ? ttrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoTramite)) {
            return false;
        }
        TipoTramite other = (TipoTramite) object;
        if ((this.ttrId == null && other.ttrId != null) || (this.ttrId != null && !this.ttrId.equals(other.ttrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.TipoTramite[ ttrId=" + ttrId + " ]";
    }

}


