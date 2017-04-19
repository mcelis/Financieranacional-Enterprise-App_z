package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Mark on 18/4/2017.
 */
@Entity
@Table(name = "CTG_TIPO_GARANTIA", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "TipoGarantia.findAll", query = "SELECT c FROM TipoGarantia c")})

public class TipoGarantia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TGA_ID")
    private String tgaId;
    @Basic(optional = false)
    @Column(name = "TGA_NOMBRE")
    private String tgaNombre;
    @Basic(optional = false)
    @Column(name = "TGA_NIVEL")
    private int tgaNivel;
    @Column(name = "TGA_ID_PADRE")
    private String tgaIdPadre;
    @Basic(optional = false)
    @Column(name = "TGA_CODCOBIS")
    private String tgaCodcobis;
    @Column(name = "TGA_CODPCIE")
    private String tgaCodpcie;
    @Basic(optional = false)
    @Column(name = "TGA_FECHA_HORA_CREA")
    private Timestamp tgaFechaHoraCrea;
    @Column(name = "TGA_FECHA_HORA_MODIFICA")
    private Timestamp tgaFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "TGA_USUARIO_CREA")
    private String tgaUsuarioCrea;
    @Column(name = "TGA_USUARIO_MODIFICA")
    private String tgaUsuarioModifica;

    public TipoGarantia(){
    }

    public TipoGarantia(String tgaId, String tgaNombre, int tgaNivel, String tgaIdPadre, String tgaCodcobis, String tgaCodpcie, Timestamp tgaFechaHoraCrea, Timestamp tgaFechaHoraModifica, String tgaUsuarioCrea, String tgaUsuarioModifica) {
        this.tgaId = tgaId;
        this.tgaNombre = tgaNombre;
        this.tgaNivel = tgaNivel;
        this.tgaIdPadre = tgaIdPadre;
        this.tgaCodcobis = tgaCodcobis;
        this.tgaCodpcie = tgaCodpcie;
        this.tgaFechaHoraCrea = tgaFechaHoraCrea;
        this.tgaFechaHoraModifica = tgaFechaHoraModifica;
        this.tgaUsuarioCrea = tgaUsuarioCrea;
        this.tgaUsuarioModifica = tgaUsuarioModifica;
    }

    public String getTgaId() {
        return tgaId;
    }

    public void setTgaId(String tgaId) {
        this.tgaId = tgaId;
    }

    public String getTgaNombre() {
        return tgaNombre;
    }

    public void setTgaNombre(String tgaNombre) {
        this.tgaNombre = tgaNombre;
    }

    public int getTgaNivel() {
        return tgaNivel;
    }

    public void setTgaNivel(int tgaNivel) {
        this.tgaNivel = tgaNivel;
    }

    public String getTgaIdPadre() {
        return tgaIdPadre;
    }

    public void setTgaIdPadre(String tgaIdPadre) {
        this.tgaIdPadre = tgaIdPadre;
    }

    public String getTgaCodcobis() {
        return tgaCodcobis;
    }

    public void setTgaCodcobis(String tgaCodcobis) {
        this.tgaCodcobis = tgaCodcobis;
    }

    public String getTgaCodpcie() {
        return tgaCodpcie;
    }

    public void setTgaCodpcie(String tgaCodpcie) {
        this.tgaCodpcie = tgaCodpcie;
    }

    public Timestamp getTgaFechaHoraCrea() {
        return tgaFechaHoraCrea;
    }

    public void setTgaFechaHoraCrea(Timestamp tgaFechaHoraCrea) {
        this.tgaFechaHoraCrea = tgaFechaHoraCrea;
    }

    public Timestamp getTgaFechaHoraModifica() {
        return tgaFechaHoraModifica;
    }

    public void setTgaFechaHoraModifica(Timestamp tgaFechaHoraModifica) {
        this.tgaFechaHoraModifica = tgaFechaHoraModifica;
    }

    public String getTgaUsuarioCrea() {
        return tgaUsuarioCrea;
    }

    public void setTgaUsuarioCrea(String tgaUsuarioCrea) {
        this.tgaUsuarioCrea = tgaUsuarioCrea;
    }

    public String getTgaUsuarioModifica() {
        return tgaUsuarioModifica;
    }

    public void setTgaUsuarioModifica(String tgaUsuarioModifica) {
        this.tgaUsuarioModifica = tgaUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tgaId != null ? tgaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoGarantia)) {
            return false;
        }
        TipoGarantia other = (TipoGarantia) object;
        if ((this.tgaId == null && other.tgaId != null) || (this.tgaId != null && !this.tgaId.equals(other.tgaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgTipoGarantia[ tgaId=" + tgaId + " ]";
    }
}
