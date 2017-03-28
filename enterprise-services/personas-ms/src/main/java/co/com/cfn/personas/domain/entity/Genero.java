package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 27/3/2017.
 */
@Entity
@Table(name = "CTG_GENERO")
@NamedQueries({
        @NamedQuery(name = "CtgGenero.findAll", query = "SELECT c FROM CtgGenero c")
        , @NamedQuery(name = "CtgGenero.findByGenId", query = "SELECT c FROM CtgGenero c WHERE c.genId = :genId")
        , @NamedQuery(name = "CtgGenero.findByGenCodigo", query = "SELECT c FROM CtgGenero c WHERE c.genCodigo = :genCodigo")
        , @NamedQuery(name = "CtgGenero.findByGenNombre", query = "SELECT c FROM CtgGenero c WHERE c.genNombre = :genNombre")
        , @NamedQuery(name = "CtgGenero.findByGenCodcobis", query = "SELECT c FROM CtgGenero c WHERE c.genCodcobis = :genCodcobis")
        , @NamedQuery(name = "CtgGenero.findByGenCodpcie", query = "SELECT c FROM CtgGenero c WHERE c.genCodpcie = :genCodpcie")
        , @NamedQuery(name = "CtgGenero.findByGenFechaHoraCrea", query = "SELECT c FROM CtgGenero c WHERE c.genFechaHoraCrea = :genFechaHoraCrea")
        , @NamedQuery(name = "CtgGenero.findByGenFechaModifica", query = "SELECT c FROM CtgGenero c WHERE c.genFechaModifica = :genFechaModifica")
        , @NamedQuery(name = "CtgGenero.findByGenUsuarioCrea", query = "SELECT c FROM CtgGenero c WHERE c.genUsuarioCrea = :genUsuarioCrea")
        , @NamedQuery(name = "CtgGenero.findByGenUsuarioModifica", query = "SELECT c FROM CtgGenero c WHERE c.genUsuarioModifica = :genUsuarioModifica")})

public class Genero {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "GEN_ID")
    private Integer genId;
    @Basic(optional = false)
    @Column(name = "GEN_CODIGO")
    private String genCodigo;
    @Column(name = "GEN_NOMBRE")
    private String genNombre;
    @Column(name = "GEN_CODCOBIS")
    private String genCodcobis;
    @Column(name = "GEN_CODPCIE")
    private String genCodpcie;
    @Column(name = "GEN_FECHA_HORA_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp genFechaHoraCrea;
    @Column(name = "GEN_FECHA_MODIFICA")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp genFechaModifica;
    @Column(name = "GEN_USUARIO_CREA")
    private String genUsuarioCrea;
    @Column(name = "GEN_USUARIO_MODIFICA")
    private String genUsuarioModifica;

    public Genero(Integer id, String codigo, String nombre, String codCobis, String codPCIE, Timestamp fechaHoraCrea, Timestamp fechaHoraModifica, String usuarioCrea, String usuarioModifica) {
    }

    public Genero(Integer genId) {
        this.genId = genId;
    }

    public Genero(Integer genId, String genCodigo) {
        this.genId = genId;
        this.genCodigo = genCodigo;
    }

    public Integer getGenId() {
        return genId;
    }

    public void setGenId(Integer genId) {
        this.genId = genId;
    }

    public String getGenCodigo() {
        return genCodigo;
    }

    public void setGenCodigo(String genCodigo) {
        this.genCodigo = genCodigo;
    }

    public String getGenNombre() {
        return genNombre;
    }

    public void setGenNombre(String genNombre) {
        this.genNombre = genNombre;
    }

    public String getGenCodcobis() {
        return genCodcobis;
    }

    public void setGenCodcobis(String genCodcobis) {
        this.genCodcobis = genCodcobis;
    }

    public String getGenCodpcie() {
        return genCodpcie;
    }

    public void setGenCodpcie(String genCodpcie) {
        this.genCodpcie = genCodpcie;
    }

    public Timestamp getGenFechaHoraCrea() {
        return genFechaHoraCrea;
    }

    public void setGenFechaHoraCrea(Timestamp genFechaHoraCrea) {
        this.genFechaHoraCrea = genFechaHoraCrea;
    }

    public Timestamp getGenFechaModifica() {
        return genFechaModifica;
    }

    public void setGenFechaModifica(Timestamp genFechaModifica) {
        this.genFechaModifica = genFechaModifica;
    }

    public String getGenUsuarioCrea() {
        return genUsuarioCrea;
    }

    public void setGenUsuarioCrea(String genUsuarioCrea) {
        this.genUsuarioCrea = genUsuarioCrea;
    }

    public String getGenUsuarioModifica() {
        return genUsuarioModifica;
    }

    public void setGenUsuarioModifica(String genUsuarioModifica) {
        this.genUsuarioModifica = genUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int result = genId;
        result = 31 * result + (genCodigo != null ? genCodigo.hashCode() : 0);
        result = 31 * result + (genNombre != null ? genNombre.hashCode() : 0);
        result = 31 * result + (genCodcobis != null ? genCodcobis.hashCode() : 0);
        result = 31 * result + (genCodpcie != null ? genCodpcie.hashCode() : 0);
        result = 31 * result + (genFechaHoraCrea != null ? genFechaHoraCrea.hashCode() : 0);
        result = 31 * result + (genFechaModifica != null ? genFechaModifica.hashCode() : 0);
        result = 31 * result + (genUsuarioCrea != null ? genUsuarioCrea.hashCode() : 0);
        result = 31 * result + (genUsuarioModifica != null ? genUsuarioModifica.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Genero)) {
            return false;
        }
        Genero other = (Genero) object;
        if ((this.genId == null && other.genId != null) || (this.genId != null && !this.genId.equals(other.genId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ActividadPersonaEntity{" +
                "genId=" + genId +
                ", genCodigo='" + genCodigo + '\'' +
                ", genNombre='" + genNombre + '\'' +
                ", genCodcobis='" + genCodcobis + '\'' +
                ", genCodpcie='" + genCodpcie + '\'' +
                ", genFechaHoraCrea='" + genFechaHoraCrea + '\'' +
                ", genFechaModifica=" + genFechaModifica +
                ", genUsuarioCrea=" + genUsuarioCrea +
                ", genUsuarioModifica='" + genUsuarioModifica + '\'' +
                '}';
    }

}
