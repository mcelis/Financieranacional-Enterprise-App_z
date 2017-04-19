package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Mark on 18/4/2017.
 */
@Entity
@Table(name = "CTG_TIPO_CUENTA", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "TipoCuenta.findAll", query = "SELECT c FROM TipoCuenta c")})

public class TipoCuenta implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TCU_ID")
    private Integer tcuId;
    @Basic(optional = false)
    @Column(name = "TCU_CODIGO")
    private String tcuCodigo;
    @Basic(optional = false)
    @Column(name = "TCU_NOMBRE")
    private String tcuNombre;
    @Basic(optional = false)
    @Column(name = "TCU_CODCOBIS")
    private String tcuCodcobis;
    @Column(name = "TCU_CODPCIE")
    private String tcuCodpcie;
    @Basic(optional = false)
    @Column(name = "TCU_FECHA_HORA_CREA")
    private Timestamp tcuFechaHoraCrea;
    @Column(name = "TCU_FECHA_HORA_MODIFICA")
    private Timestamp tcuFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "TCU_USUARIO_CREA")
    private String tcuUsuarioCrea;
    @Column(name = "TCU_USUARIO_MODIFICA")
    private String tcuUsuarioModifica;

    public TipoCuenta(){
    }

    public TipoCuenta(Integer tcuId, String tcuCodigo, String tcuNombre, String tcuCodcobis, String tcuCodpcie, Timestamp tcuFechaHoraCrea, Timestamp tcuFechaHoraModifica, String tcuUsuarioCrea, String tcuUsuarioModifica) {
        this.tcuId = tcuId;
        this.tcuCodigo = tcuCodigo;
        this.tcuNombre = tcuNombre;
        this.tcuCodcobis = tcuCodcobis;
        this.tcuCodpcie = tcuCodpcie;
        this.tcuFechaHoraCrea = tcuFechaHoraCrea;
        this.tcuFechaHoraModifica = tcuFechaHoraModifica;
        this.tcuUsuarioCrea = tcuUsuarioCrea;
        this.tcuUsuarioModifica = tcuUsuarioModifica;
    }

    public Integer getTcuId() {
        return tcuId;
    }

    public void setTcuId(Integer tcuId) {
        this.tcuId = tcuId;
    }

    public String getTcuCodigo() {
        return tcuCodigo;
    }

    public void setTcuCodigo(String tcuCodigo) {
        this.tcuCodigo = tcuCodigo;
    }

    public String getTcuNombre() {
        return tcuNombre;
    }

    public void setTcuNombre(String tcuNombre) {
        this.tcuNombre = tcuNombre;
    }

    public String getTcuCodcobis() {
        return tcuCodcobis;
    }

    public void setTcuCodcobis(String tcuCodcobis) {
        this.tcuCodcobis = tcuCodcobis;
    }

    public String getTcuCodpcie() {
        return tcuCodpcie;
    }

    public void setTcuCodpcie(String tcuCodpcie) {
        this.tcuCodpcie = tcuCodpcie;
    }

    public Timestamp getTcuFechaHoraCrea() {
        return tcuFechaHoraCrea;
    }

    public void setTcuFechaHoraCrea(Timestamp tcuFechaHoraCrea) {
        this.tcuFechaHoraCrea = tcuFechaHoraCrea;
    }

    public Timestamp getTcuFechaHoraModifica() {
        return tcuFechaHoraModifica;
    }

    public void setTcuFechaHoraModifica(Timestamp tcuFechaHoraModifica) {
        this.tcuFechaHoraModifica = tcuFechaHoraModifica;
    }

    public String getTcuUsuarioCrea() {
        return tcuUsuarioCrea;
    }

    public void setTcuUsuarioCrea(String tcuUsuarioCrea) {
        this.tcuUsuarioCrea = tcuUsuarioCrea;
    }

    public String getTcuUsuarioModifica() {
        return tcuUsuarioModifica;
    }

    public void setTcuUsuarioModifica(String tcuUsuarioModifica) {
        this.tcuUsuarioModifica = tcuUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tcuId != null ? tcuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoCuenta)) {
            return false;
        }
        TipoCuenta other = (TipoCuenta) object;
        if ((this.tcuId == null && other.tcuId != null) || (this.tcuId != null && !this.tcuId.equals(other.tcuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CtgTipoCuenta[ tcuId=" + tcuId + " ]";
    }

}
