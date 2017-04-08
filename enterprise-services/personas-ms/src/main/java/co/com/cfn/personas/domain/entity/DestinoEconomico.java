package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 28/3/2017.
 */
@Entity
@Table(name = "CTG_DESTINO_ECONOMICO",schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "DestinoEconomico.findAll", query = "SELECT c FROM DestinoEconomico c")})
public class DestinoEconomico {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DEC_ID")
    private Integer decId;
    @Basic(optional = false)
    @Column(name = "DEC_CODIGO")
    private String decCodigo;
    @Basic(optional = false)
    @Column(name = "DEC_NOMBRE")
    private String decNombre;
    @Basic(optional = false)
    @Column(name = "DEC_CODCOBIS")
    private String decCodcobis;
    @Column(name = "DEC_CODPCIE")
    private String decCodpcie;
    @Basic(optional = false)
    @Column(name = "DEC_FECHA_HORA_CREA")
    private Timestamp decFechaHoraCrea;
    @Column(name = "DEC_FECHA_HORA_MODIFICA")
    private Timestamp decFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "DEC_USUARIO_CREA")
    private String decUsuarioCrea;
    @Column(name = "DEC_USUARIO_MODIFICA")
    private String decUsuarioModifica;

    public DestinoEconomico() {
    }

    public DestinoEconomico(Integer decId, String decCodigo, String decNombre, String decCodcobis, String decCodpcie, Timestamp decFechaHoraCrea, Timestamp decFechaHoraModifica, String decUsuarioCrea, String decUsuarioModifica) {
        this.decId = decId;
        this.decCodigo = decCodigo;
        this.decNombre = decNombre;
        this.decCodcobis = decCodcobis;
        this.decCodpcie = decCodpcie;
        this.decFechaHoraCrea = decFechaHoraCrea;
        this.decFechaHoraModifica = decFechaHoraModifica;
        this.decUsuarioCrea = decUsuarioCrea;
        this.decUsuarioModifica = decUsuarioModifica;
    }

    public DestinoEconomico(Integer decId) {
        this.decId = decId;
    }


    public Integer getDecId() {
        return decId;
    }

    public void setDecId(Integer decId) {
        this.decId = decId;
    }

    public String getDecCodigo() {
        return decCodigo;
    }

    public void setDecCodigo(String decCodigo) {
        this.decCodigo = decCodigo;
    }

    public String getDecNombre() {
        return decNombre;
    }

    public void setDecNombre(String decNombre) {
        this.decNombre = decNombre;
    }

    public String getDecCodcobis() {
        return decCodcobis;
    }

    public void setDecCodcobis(String decCodcobis) {
        this.decCodcobis = decCodcobis;
    }

    public String getDecCodpcie() {
        return decCodpcie;
    }

    public void setDecCodpcie(String decCodpcie) {
        this.decCodpcie = decCodpcie;
    }

    public Timestamp getDecFechaHoraCrea() {
        return decFechaHoraCrea;
    }

    public void setDecFechaHoraCrea(Timestamp decFechaHoraCrea) {
        this.decFechaHoraCrea = decFechaHoraCrea;
    }

    public Timestamp getDecFechaHoraModifica() {
        return decFechaHoraModifica;
    }

    public void setDecFechaHoraModifica(Timestamp decFechaHoraModifica) {
        this.decFechaHoraModifica = decFechaHoraModifica;
    }

    public String getDecUsuarioCrea() {
        return decUsuarioCrea;
    }

    public void setDecUsuarioCrea(String decUsuarioCrea) {
        this.decUsuarioCrea = decUsuarioCrea;
    }

    public String getDecUsuarioModifica() {
        return decUsuarioModifica;
    }

    public void setDecUsuarioModifica(String decUsuarioModifica) {
        this.decUsuarioModifica = decUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (decId != null ? decId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DestinoEconomico)) {
            return false;
        }
        DestinoEconomico other = (DestinoEconomico) object;
        if ((this.decId == null && other.decId != null) || (this.decId != null && !this.decId.equals(other.decId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.DestinoEconomico[ decId=" + decId + " ]";
    }
}
