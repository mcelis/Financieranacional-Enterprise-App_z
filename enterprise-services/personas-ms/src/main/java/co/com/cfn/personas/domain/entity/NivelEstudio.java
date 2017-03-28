package co.com.cfn.personas.domain.entity;

/**
 * Created by zmiranda on 27/03/2017.
 */

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "CTG_NIVEL_ESTUDIO", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "NivelEstudio.findAll", query = "SELECT c FROM NivelEstudio c")})
public class NivelEstudio {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NES_ID")
    private Integer nesId;

    @Basic
    @Column(name = "NES_CODIGO")
    private String nesCodigo;
    @Basic
    @Column(name = "NES_NOMBRE")
    private String nesNombre;
    @Basic
    @Column(name = "NES_CODCOBIS")
    private String nesCodcobis;
    @Basic
    @Column(name = "NES_CODPCIE")
    private String nesCodpcie;
    @Basic
    @Column(name = "NES_FECHA_HORA_CREA")
    private Timestamp nesFechaHoraCrea;
    @Basic
    @Column(name = "NES_FECHA_HORA_MODIFICA")
    private Timestamp nesFechaHoraModifica;
    @Basic
    @Column(name = "NES_USUARIO_CREA")
    private String nesUsuarioCrea;
    @Basic
    @Column(name = "NES_USUARIO_MODIFICA")
    private String nesUsuarioModifica;

    public NivelEstudio() {
    }

    public NivelEstudio(Integer nesId) {
        this.nesId = nesId;
    }

    public Integer getNesId() {
        return nesId;
    }

    public void setNesId(Integer nesId) {
        this.nesId = nesId;
    }

    public String getNesCodigo() {
        return nesCodigo;
    }

    public void setNesCodigo(String nesCodigo) {
        this.nesCodigo = nesCodigo;
    }

    public String getNesNombre() {
        return nesNombre;
    }

    public void setNesNombre(String nesNombre) {
        this.nesNombre = nesNombre;
    }

    public String getNesCodcobis() {
        return nesCodcobis;
    }

    public void setNesCodcobis(String nesCodcobis) {
        this.nesCodcobis = nesCodcobis;
    }

    public String getNesCodpcie() {
        return nesCodpcie;
    }

    public void setNesCodpcie(String nesCodpcie) {
        this.nesCodpcie = nesCodpcie;
    }

    public Timestamp getNesFechaHoraCrea() {
        return nesFechaHoraCrea;
    }

    public void setNesFechaHoraCrea(Timestamp nesFechaHoraCrea) {
        this.nesFechaHoraCrea = nesFechaHoraCrea;
    }

    public Timestamp getNesFechaHoraModifica() {
        return nesFechaHoraModifica;
    }

    public void setNesFechaHoraModifica(Timestamp nesFechaHoraModifica) {
        this.nesFechaHoraModifica = nesFechaHoraModifica;
    }

    public String getNesUsuarioCrea() {
        return nesUsuarioCrea;
    }

    public void setNesUsuarioCrea(String nesUsuarioCrea) {
        this.nesUsuarioCrea = nesUsuarioCrea;
    }

    public String getNesUsuarioModifica() {
        return nesUsuarioModifica;
    }

    public void setNesUsuarioModifica(String nesUsuarioModifica) {
        this.nesUsuarioModifica = nesUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nesId != null ? nesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelEstudio)) {
            return false;
        }
        NivelEstudio other = (NivelEstudio) object;
        if ((this.nesId == null && other.nesId != null) || (this.nesId != null && !this.nesId.equals(other.nesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgNivelEstudio[ nesId=" + nesId + " ]";
    }

}
