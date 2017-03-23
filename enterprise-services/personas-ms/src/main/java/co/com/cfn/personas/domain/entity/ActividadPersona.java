/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "CTG_ACTIVIDAD_PERSONA", schema = "dbo", catalog = "financiera")
@NamedQueries({
        @NamedQuery(name = "ActividadPersona.findAll", query = "SELECT c FROM ActividadPersona c")})

public class ActividadPersona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACP_ID")
    private Integer acpId;

    @Basic
    @Column(name = "ACP_CODIGO")
    private String acpCodigo;
    @Basic
    @Column(name = "ACP_NOMBRE")
    private String acpNombre;
    @Basic
    @Column(name = "ACP_TIPO")
    private String acpTipo;
    @Basic
    @Column(name = "ACP_CODCOBIS")
    private String acpCodcobis;
    @Basic
    @Column(name = "ACP_CODPCIE")
    private String acpCodpcie;
    @Basic
    @Column(name = "ACP_FECHA_HORA_CREA")
    private Timestamp acpFechaHoraCrea;
    @Basic
    @Column(name = "ACP_FECHA_HORA_MODIFICA")
    private Timestamp acpFechaHoraModifica;
    @Basic
    @Column(name = "ACP_USUARIO_CREA")
    private String acpUsuarioCrea;
    @Basic
    @Column(name = "ACP_USUARIO_MODIFICA")
    private String acpUsuarioModifica;

    public ActividadPersona() {
    }

    public ActividadPersona(Integer acpId, String acpCodigo, String acpNombre, String acpTipo, String acpCodcobis,
                            String acpCodpcie, Timestamp acpFechaHoraCrea, Timestamp acpFechaHoraModifica, String acpUsuarioCrea, String acpUsuarioModifica) {
        this.acpId = acpId;
        this.acpCodigo = acpCodigo;
        this.acpNombre = acpNombre;
        this.acpTipo = acpTipo;
        this.acpCodcobis = acpCodcobis;
        this.acpCodpcie = acpCodpcie;
        this.acpFechaHoraCrea = acpFechaHoraCrea;
        this.acpFechaHoraModifica = acpFechaHoraModifica;
        this.acpUsuarioCrea = acpUsuarioCrea;
        this.acpUsuarioModifica = acpUsuarioModifica;
    }

    public Integer getAcpId() {
        return acpId;
    }

    public void setAcpId(Integer acpId) {
        this.acpId = acpId;
    }

    public String getAcpCodigo() {
        return acpCodigo;
    }

    public void setAcpCodigo(String acpCodigo) {
        this.acpCodigo = acpCodigo;
    }

    public String getAcpNombre() {
        return acpNombre;
    }

    public void setAcpNombre(String acpNombre) {
        this.acpNombre = acpNombre;
    }

    public String getAcpTipo() {
        return acpTipo;
    }

    public void setAcpTipo(String acpTipo) {
        this.acpTipo = acpTipo;
    }

    public String getAcpCodcobis() {
        return acpCodcobis;
    }

    public void setAcpCodcobis(String acpCodcobis) {
        this.acpCodcobis = acpCodcobis;
    }

    public String getAcpCodpcie() {
        return acpCodpcie;
    }

    public void setAcpCodpcie(String acpCodpcie) {
        this.acpCodpcie = acpCodpcie;
    }

    public Timestamp getAcpFechaHoraCrea() {
        return acpFechaHoraCrea;
    }

    public void setAcpFechaHoraCrea(Timestamp acpFechaHoraCrea) {
        this.acpFechaHoraCrea = acpFechaHoraCrea;
    }

    public Timestamp getAcpFechaHoraModifica() {
        return acpFechaHoraModifica;
    }

    public void setAcpFechaHoraModifica(Timestamp acpFechaHoraModifica) {
        this.acpFechaHoraModifica = acpFechaHoraModifica;
    }

    public String getAcpUsuarioCrea() {
        return acpUsuarioCrea;
    }

    public void setAcpUsuarioCrea(String acpUsuarioCrea) {
        this.acpUsuarioCrea = acpUsuarioCrea;
    }

    public String getAcpUsuarioModifica() {
        return acpUsuarioModifica;
    }

    public void setAcpUsuarioModifica(String acpUsuarioModifica) {
        this.acpUsuarioModifica = acpUsuarioModifica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActividadPersona that = (ActividadPersona) o;

        if (acpId != that.acpId) return false;
        if (acpCodcobis != null ? !acpCodcobis.equals(that.acpCodcobis) : that.acpCodcobis != null) return false;
        if (acpCodigo != null ? !acpCodigo.equals(that.acpCodigo) : that.acpCodigo != null) return false;
        if (acpCodpcie != null ? !acpCodpcie.equals(that.acpCodpcie) : that.acpCodpcie != null) return false;
        if (acpFechaHoraCrea != null ? !acpFechaHoraCrea.equals(that.acpFechaHoraCrea) : that.acpFechaHoraCrea != null)
            return false;
        if (acpFechaHoraModifica != null ? !acpFechaHoraModifica.equals(that.acpFechaHoraModifica) : that.acpFechaHoraModifica != null)
            return false;
        if (acpNombre != null ? !acpNombre.equals(that.acpNombre) : that.acpNombre != null) return false;
        if (acpTipo != null ? !acpTipo.equals(that.acpTipo) : that.acpTipo != null) return false;
        if (acpUsuarioCrea != null ? !acpUsuarioCrea.equals(that.acpUsuarioCrea) : that.acpUsuarioCrea != null)
            return false;
        if (acpUsuarioModifica != null ? !acpUsuarioModifica.equals(that.acpUsuarioModifica) : that.acpUsuarioModifica != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = acpId;
        result = 31 * result + (acpCodigo != null ? acpCodigo.hashCode() : 0);
        result = 31 * result + (acpNombre != null ? acpNombre.hashCode() : 0);
        result = 31 * result + (acpTipo != null ? acpTipo.hashCode() : 0);
        result = 31 * result + (acpCodcobis != null ? acpCodcobis.hashCode() : 0);
        result = 31 * result + (acpCodpcie != null ? acpCodpcie.hashCode() : 0);
        result = 31 * result + (acpFechaHoraCrea != null ? acpFechaHoraCrea.hashCode() : 0);
        result = 31 * result + (acpFechaHoraModifica != null ? acpFechaHoraModifica.hashCode() : 0);
        result = 31 * result + (acpUsuarioCrea != null ? acpUsuarioCrea.hashCode() : 0);
        result = 31 * result + (acpUsuarioModifica != null ? acpUsuarioModifica.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ActividadPersonaEntity{" +
                "acpId=" + acpId +
                ", acpCodigo='" + acpCodigo + '\'' +
                ", acpNombre='" + acpNombre + '\'' +
                ", acpTipo='" + acpTipo + '\'' +
                ", acpCodcobis='" + acpCodcobis + '\'' +
                ", acpCodpcie='" + acpCodpcie + '\'' +
                ", acpFechaHoraCrea=" + acpFechaHoraCrea +
                ", acpFechaHoraModifica=" + acpFechaHoraModifica +
                ", acpUsuarioCrea='" + acpUsuarioCrea + '\'' +
                ", acpUsuarioModifica='" + acpUsuarioModifica + '\'' +
                '}';
    }
}
