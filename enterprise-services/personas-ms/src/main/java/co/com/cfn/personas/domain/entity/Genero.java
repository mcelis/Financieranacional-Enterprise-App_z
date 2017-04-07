package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 27/3/2017.
 */
@Entity
@Table(name = "CTG_GENERO", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "Genero.findAll", query = "SELECT c FROM Genero c")})

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

    private Timestamp genFechaHoraCrea;
    @Column(name = "GEN_FECHA_MODIFICA")

    private Timestamp genFechaModifica;
    @Column(name = "GEN_USUARIO_CREA")
    private String genUsuarioCrea;
    @Column(name = "GEN_USUARIO_MODIFICA")
    private String genUsuarioModifica;

    public Genero(){
    }

    public Genero(Integer genId, String genCodigo, String genNombre, String genCodcobis, String genCodpcie, Timestamp genFechaHoraCrea, Timestamp genFechaModifica, String genUsuarioCrea, String genUsuarioModifica) {
        this.genId = genId;
        this.genCodigo = genCodigo;
        this.genNombre = genNombre;
        this.genCodcobis = genCodcobis;
        this.genCodpcie = genCodpcie;
        this.genFechaHoraCrea = genFechaHoraCrea;
        this.genFechaModifica = genFechaModifica;
        this.genUsuarioCrea = genUsuarioCrea;
        this.genUsuarioModifica = genUsuarioModifica;
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
        int hash = 0;
        hash += (genId != null ? genId.hashCode() : 0);
        return hash;
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
        return "javaapplication1.CtgGenero[ genId=" + genId + " ]";
    }

}
