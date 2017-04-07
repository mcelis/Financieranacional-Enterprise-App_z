package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 28/3/2017.
 */
@Entity
@Table(name = "CTG_GRUPO_ETNICO", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "GrupoEtnico.findAll", query = "SELECT c FROM GrupoEtnico c")})
public class GrupoEtnico {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "GET_ID")
    private Integer getId;
    @Column(name = "GET_CODIGO")
    private String getCodigo;
    @Column(name = "GET_NOMBRE")
    private String getNombre;
    @Column(name = "GET_CODCOBIS")
    private String getCodcobis;
    @Column(name = "GET_CODPCIE")
    private String getCodpcie;
    @Column(name = "GET_FECHA_HORA_CREA")
    private Timestamp getFechaHoraCrea;
    @Column(name = "GET_FECHA_HORA_MODIFICA")
    private Timestamp getFechaHoraModifica;
    @Column(name = "GET_USUARIO_CREA")
    private String getUsuarioCrea;
    @Column(name = "GET_USUARIO_MODIFICA")
    private String getUsuarioModifica;

    public GrupoEtnico() {
    }

    public GrupoEtnico(Integer getId, String getCodigo, String getNombre, String getCodcobis, String getCodpcie, Timestamp getFechaHoraCrea, Timestamp getFechaHoraModifica, String getUsuarioCrea, String getUsuarioModifica) {
        this.getId = getId;
        this.getCodigo = getCodigo;
        this.getNombre = getNombre;
        this.getCodcobis = getCodcobis;
        this.getCodpcie = getCodpcie;
        this.getFechaHoraCrea = getFechaHoraCrea;
        this.getFechaHoraModifica = getFechaHoraModifica;
        this.getUsuarioCrea = getUsuarioCrea;
        this.getUsuarioModifica = getUsuarioModifica;
    }

    public GrupoEtnico(Integer getId) {
        this.getId = getId;
    }

    public Integer getGetId() {
        return getId;
    }

    public void setGetId(Integer getId) {
        this.getId = getId;
    }

    public String getGetCodigo() {
        return getCodigo;
    }

    public void setGetCodigo(String getCodigo) {
        this.getCodigo = getCodigo;
    }

    public String getGetNombre() {
        return getNombre;
    }

    public void setGetNombre(String getNombre) {
        this.getNombre = getNombre;
    }

    public String getGetCodcobis() {
        return getCodcobis;
    }

    public void setGetCodcobis(String getCodcobis) {
        this.getCodcobis = getCodcobis;
    }

    public String getGetCodpcie() {
        return getCodpcie;
    }

    public void setGetCodpcie(String getCodpcie) {
        this.getCodpcie = getCodpcie;
    }

    public Timestamp getGetFechaHoraCrea() {
        return getFechaHoraCrea;
    }

    public void setGetFechaHoraCrea(Timestamp getFechaHoraCrea) {
        this.getFechaHoraCrea = getFechaHoraCrea;
    }

    public Timestamp getGetFechaHoraModifica() {
        return getFechaHoraModifica;
    }

    public void setGetFechaHoraModifica(Timestamp getFechaHoraModifica) {
        this.getFechaHoraModifica = getFechaHoraModifica;
    }

    public String getGetUsuarioCrea() {
        return getUsuarioCrea;
    }

    public void setGetUsuarioCrea(String getUsuarioCrea) {
        this.getUsuarioCrea = getUsuarioCrea;
    }

    public String getGetUsuarioModifica() {
        return getUsuarioModifica;
    }

    public void setGetUsuarioModifica(String getUsuarioModifica) {
        this.getUsuarioModifica = getUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId != null ? getId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoEtnico)) {
            return false;
        }
        GrupoEtnico other = (GrupoEtnico) object;
        if ((this.getId == null && other.getId != null) || (this.getId != null && !this.getId.equals(other.getId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgGrupoEtnico[ getId=" + getId + " ]";
    }

}
