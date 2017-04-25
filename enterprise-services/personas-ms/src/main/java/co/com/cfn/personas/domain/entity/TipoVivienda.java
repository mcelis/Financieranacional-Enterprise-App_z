package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Mark on 24/4/2017.
 */
@Entity
@Table(name = "CTG_TIPO_VIVIENDA", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "TipoVivienda.findAll", query = "SELECT c FROM TipoVivienda c")})

public class TipoVivienda implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TVI_ID")
    private Long tviId;
    @Basic(optional = false)
    @Column(name = "TVI_CODIGO")
    private String tviCodigo;
    @Basic(optional = false)
    @Column(name = "TVI_NOMBRE")
    private String tviNombre;
    @Basic(optional = false)
    @Column(name = "TVI_CODCOBIS")
    private String tviCodcobis;
    @Column(name = "TVI_CODPCIE")
    private String tviCodpcie;
    @Basic(optional = false)
    @Column(name = "TVI_FECHA_HORA_CREA")
    private Timestamp tviFechaHoraCrea;
    @Column(name = "TVI_FECHA_HORA_MODIFICA")
    private Timestamp tviFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "TVI_USUARIO_CREA")
    private String tviUsuarioCrea;
    @Column(name = "TVI_USUARIO_MODIFICA")
    private String tviUsuarioModifica;

    public TipoVivienda() {
    }

    public TipoVivienda(Long tviId, String tviCodigo, String tviNombre, String tviCodcobis, String tviCodpcie, Timestamp tviFechaHoraCrea, Timestamp tviFechaHoraModifica, String tviUsuarioCrea, String tviUsuarioModifica) {
        this.tviId = tviId;
        this.tviCodigo = tviCodigo;
        this.tviNombre = tviNombre;
        this.tviCodcobis = tviCodcobis;
        this.tviCodpcie = tviCodpcie;
        this.tviFechaHoraCrea = tviFechaHoraCrea;
        this.tviFechaHoraModifica = tviFechaHoraModifica;
        this.tviUsuarioCrea = tviUsuarioCrea;
        this.tviUsuarioModifica = tviUsuarioModifica;
    }

    public Long getTviId() {
        return tviId;
    }

    public void setTviId(Long tviId) {
        this.tviId = tviId;
    }

    public String getTviCodigo() {
        return tviCodigo;
    }

    public void setTviCodigo(String tviCodigo) {
        this.tviCodigo = tviCodigo;
    }

    public String getTviNombre() {
        return tviNombre;
    }

    public void setTviNombre(String tviNombre) {
        this.tviNombre = tviNombre;
    }

    public String getTviCodcobis() {
        return tviCodcobis;
    }

    public void setTviCodcobis(String tviCodcobis) {
        this.tviCodcobis = tviCodcobis;
    }

    public String getTviCodpcie() {
        return tviCodpcie;
    }

    public void setTviCodpcie(String tviCodpcie) {
        this.tviCodpcie = tviCodpcie;
    }

    public Timestamp getTviFechaHoraCrea() {
        return tviFechaHoraCrea;
    }

    public void setTviFechaHoraCrea(Timestamp tviFechaHoraCrea) {
        this.tviFechaHoraCrea = tviFechaHoraCrea;
    }

    public Timestamp getTviFechaHoraModifica() {
        return tviFechaHoraModifica;
    }

    public void setTviFechaHoraModifica(Timestamp tviFechaHoraModifica) {
        this.tviFechaHoraModifica = tviFechaHoraModifica;
    }

    public String getTviUsuarioCrea() {
        return tviUsuarioCrea;
    }

    public void setTviUsuarioCrea(String tviUsuarioCrea) {
        this.tviUsuarioCrea = tviUsuarioCrea;
    }

    public String getTviUsuarioModifica() {
        return tviUsuarioModifica;
    }

    public void setTviUsuarioModifica(String tviUsuarioModifica) {
        this.tviUsuarioModifica = tviUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tviId != null ? tviId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoVivienda)) {
            return false;
        }
        TipoVivienda other = (TipoVivienda) object;
        if ((this.tviId == null && other.tviId != null) || (this.tviId != null && !this.tviId.equals(other.tviId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgTipoVivienda[ tviId=" + tviId + " ]";
    }

}
