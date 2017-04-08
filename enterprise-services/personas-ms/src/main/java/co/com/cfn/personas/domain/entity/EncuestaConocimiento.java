package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 8/4/2017.
 */
@Entity
@Table(name = "CTG_ENCUESTA_CONOCIMIENTO", schema = "dbo", catalog = "BPM_MDB" )
@NamedQueries({
        @NamedQuery(name = "EncuestaConocimiento.findAll", query = "SELECT c FROM EncuestaConocimiento c")})
public class EncuestaConocimiento {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ECO_ID")
    private Integer ecoId;
    @Basic(optional = false)
    @Column(name = "ECO_NOMBRE")
    private String ecoNombre;
    @Basic(optional = false)
    @Column(name = "ECO_USUARIO_CREA")
    private String ecoUsuarioCrea;
    @Column(name = "ECO_USUARIO_MODIFICA")
    private String ecoUsuarioModifica;
    @Basic(optional = false)
    @Column(name = "ECO_FECHA_HORA_CREA")
    private Timestamp ecoFechaHoraCrea;
    @Column(name = "ECO_FECHA_HORA_MODIFICA")
    private Timestamp ecoFechaHoraModifica;

    public EncuestaConocimiento(){
    }

    public EncuestaConocimiento(Integer ecoId, String ecoNombre, String ecoUsuarioCrea, String ecoUsuarioModifica, Timestamp ecoFechaHoraCrea, Timestamp ecoFechaHoraModifica) {
        this.ecoId = ecoId;
        this.ecoNombre = ecoNombre;
        this.ecoUsuarioCrea = ecoUsuarioCrea;
        this.ecoUsuarioModifica = ecoUsuarioModifica;
        this.ecoFechaHoraCrea = ecoFechaHoraCrea;
        this.ecoFechaHoraModifica = ecoFechaHoraModifica;
    }

    public Integer getEcoId() {
        return ecoId;
    }

    public void setEcoId(Integer ecoId) {
        this.ecoId = ecoId;
    }

    public String getEcoNombre() {
        return ecoNombre;
    }

    public void setEcoNombre(String ecoNombre) {
        this.ecoNombre = ecoNombre;
    }

    public String getEcoUsuarioCrea() {
        return ecoUsuarioCrea;
    }

    public void setEcoUsuarioCrea(String ecoUsuarioCrea) {
        this.ecoUsuarioCrea = ecoUsuarioCrea;
    }

    public String getEcoUsuarioModifica() {
        return ecoUsuarioModifica;
    }

    public void setEcoUsuarioModifica(String ecoUsuarioModifica) {
        this.ecoUsuarioModifica = ecoUsuarioModifica;
    }

    public Timestamp getEcoFechaHoraCrea() {
        return ecoFechaHoraCrea;
    }

    public void setEcoFechaHoraCrea(Timestamp ecoFechaHoraCrea) {
        this.ecoFechaHoraCrea = ecoFechaHoraCrea;
    }

    public Timestamp getEcoFechaHoraModifica() {
        return ecoFechaHoraModifica;
    }

    public void setEcoFechaHoraModifica(Timestamp ecoFechaHoraModifica) {
        this.ecoFechaHoraModifica = ecoFechaHoraModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ecoId != null ? ecoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EncuestaConocimiento)) {
            return false;
        }
        EncuestaConocimiento other = (EncuestaConocimiento) object;
        if ((this.ecoId == null && other.ecoId != null) || (this.ecoId != null && !this.ecoId.equals(other.ecoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.EncuestaConocimiento[ ecoId=" + ecoId + " ]";
    }

}
