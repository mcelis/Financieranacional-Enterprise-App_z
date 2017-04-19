package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by Mark on 17/4/2017.
 */

@Entity
@Table(name = "CTG_ACTIVIDAD_ECONOMICA", catalog = "BPM_MDB", schema = "dbo")
@NamedQueries({
        @NamedQuery(name = "ActividadEconomica.findAll", query = "SELECT c FROM ActividadEconomica c")})

public class ActividadEconomica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AEC_ID", nullable = false, length = 15)
    private String aecId;
    @Column(name = "AEC_NOMBRE", length = 200)
    private String aecNombre;
    @Column(name = "AEC_NIVEL")
    private Integer aecNivel;
    @Column(name = "AEC_CODCOBIS", length = 50)
    private String aecCodcobis;
    @Column(name = "AEC_CODPCIE", length = 50)
    private String aecCodpcie;
    @Column(name = "AEC_FECHA_HORA_CREA")

    private Timestamp aecFechaHoraCrea;
    @Column(name = "AEC_FECHA_HORA_MODIFICA")

    private Timestamp aecFechaHoraModifica;
    @Column(name = "AEC_USUARIO_CREA", length = 50)
    private String aecUsuarioCrea;
    @Column(name = "AEC_USUARIO_MODIFICA", length = 50)
    private String aecUsuarioModifica;
    @OneToMany(mappedBy = "aecIdPadre", fetch = FetchType.LAZY)
    private Collection<ActividadEconomica> ctgActividadEconomicaCollection;
    @JoinColumn(name = "AEC_ID_PADRE", referencedColumnName = "AEC_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ActividadEconomica aecIdPadre;

    public ActividadEconomica(){
    }

    public ActividadEconomica(String aecId, String aecNombre, Integer aecNivel, String aecCodcobis, String aecCodpcie, Timestamp aecFechaHoraCrea, Timestamp aecFechaHoraModifica, String aecUsuarioCrea, String aecUsuarioModifica, Collection<ActividadEconomica> ctgActividadEconomicaCollection, ActividadEconomica aecIdPadre) {
        this.aecId = aecId;
        this.aecNombre = aecNombre;
        this.aecNivel = aecNivel;
        this.aecCodcobis = aecCodcobis;
        this.aecCodpcie = aecCodpcie;
        this.aecFechaHoraCrea = aecFechaHoraCrea;
        this.aecFechaHoraModifica = aecFechaHoraModifica;
        this.aecUsuarioCrea = aecUsuarioCrea;
        this.aecUsuarioModifica = aecUsuarioModifica;
        this.ctgActividadEconomicaCollection = ctgActividadEconomicaCollection;
        this.aecIdPadre = aecIdPadre;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAecId() {
        return aecId;
    }

    public void setAecId(String aecId) {
        this.aecId = aecId;
    }

    public String getAecNombre() {
        return aecNombre;
    }

    public void setAecNombre(String aecNombre) {
        this.aecNombre = aecNombre;
    }

    public Integer getAecNivel() {
        return aecNivel;
    }

    public void setAecNivel(Integer aecNivel) {
        this.aecNivel = aecNivel;
    }

    public String getAecCodcobis() {
        return aecCodcobis;
    }

    public void setAecCodcobis(String aecCodcobis) {
        this.aecCodcobis = aecCodcobis;
    }

    public String getAecCodpcie() {
        return aecCodpcie;
    }

    public void setAecCodpcie(String aecCodpcie) {
        this.aecCodpcie = aecCodpcie;
    }

    public Timestamp getAecFechaHoraCrea() {
        return aecFechaHoraCrea;
    }

    public void setAecFechaHoraCrea(Timestamp aecFechaHoraCrea) {
        this.aecFechaHoraCrea = aecFechaHoraCrea;
    }

    public Timestamp getAecFechaHoraModifica() {
        return aecFechaHoraModifica;
    }

    public void setAecFechaHoraModifica(Timestamp aecFechaHoraModifica) {
        this.aecFechaHoraModifica = aecFechaHoraModifica;
    }

    public String getAecUsuarioCrea() {
        return aecUsuarioCrea;
    }

    public void setAecUsuarioCrea(String aecUsuarioCrea) {
        this.aecUsuarioCrea = aecUsuarioCrea;
    }

    public String getAecUsuarioModifica() {
        return aecUsuarioModifica;
    }

    public void setAecUsuarioModifica(String aecUsuarioModifica) {
        this.aecUsuarioModifica = aecUsuarioModifica;
    }

    public Collection<ActividadEconomica> getCtgActividadEconomicaCollection() {
        return ctgActividadEconomicaCollection;
    }

    public void setCtgActividadEconomicaCollection(Collection<ActividadEconomica> ctgActividadEconomicaCollection) {
        this.ctgActividadEconomicaCollection = ctgActividadEconomicaCollection;
    }

    public ActividadEconomica getAecIdPadre() {
        return aecIdPadre;
    }

    public void setAecIdPadre(ActividadEconomica aecIdPadre) {
        this.aecIdPadre = aecIdPadre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aecId != null ? aecId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActividadEconomica)) {
            return false;
        }
        ActividadEconomica other = (ActividadEconomica) object;
        if ((this.aecId == null && other.aecId != null) || (this.aecId != null && !this.aecId.equals(other.aecId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "middlewareentitiescfn.ActividadEconomica[ aecId=" + aecId + " ]";
    }

}
