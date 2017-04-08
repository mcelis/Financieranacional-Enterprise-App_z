package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 5/4/2017.
 */
@Entity
@Table(name = "CTG_DESTINO_FINANCIERO",schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "DestinoFinanciero.findAll", query = "SELECT c FROM DestinoFinanciero c")})

public class DestinoFinanciero {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DFI_ID")
    private Integer dfiId;
    @Column(name = "DFI_CODIGO")
    private String dfiCodigo;
    @Column(name = "DFI_NOMBRE")
    private String dfiNombre;
    @Column(name = "DFI_DESCRIPCION")
    private String dfiDescripcion;
    @Column(name = "DFI_CODCOBIS")
    private String dfiCodcobis;
    @Column(name = "DFI_CODPCIE")
    private String dfiCodpcie;
    @Column(name = "DFI_FECHA_HORA_CREA")
    private Timestamp dfiFechaHoraCrea;
    @Column(name = "DFI_FECHA_HORA_MODIFICA")
    private Timestamp dfiFechaHoraModifica;
    @Column(name = "DFI_USUARIO_CREA")
    private String dfiUsuarioCrea;
    @Column(name = "DFI_USUARIO_MODIFICA")
    private String dfiUsuarioModifica;


    public DestinoFinanciero() {
    }

    public DestinoFinanciero(Integer dfiId, String dfiCodigo, String dfiNombre, String dfiDescripcion, String dfiCodcobis, String dfiCodpcie, Timestamp dfiFechaHoraCrea, Timestamp dfiFechaHoraModifica, String dfiUsuarioCrea, String dfiUsuarioModifica) {
        this.dfiId = dfiId;
        this.dfiCodigo = dfiCodigo;
        this.dfiNombre = dfiNombre;
        this.dfiDescripcion = dfiDescripcion;
        this.dfiCodcobis = dfiCodcobis;
        this.dfiCodpcie = dfiCodpcie;
        this.dfiFechaHoraCrea = dfiFechaHoraCrea;
        this.dfiFechaHoraModifica = dfiFechaHoraModifica;
        this.dfiUsuarioCrea = dfiUsuarioCrea;
        this.dfiUsuarioModifica = dfiUsuarioModifica;
    }

    public Integer getDfiId() {
        return dfiId;
    }

    public void setDfiId(Integer dfiId) {
        this.dfiId = dfiId;
    }

    public String getDfiCodigo() {
        return dfiCodigo;
    }

    public void setDfiCodigo(String dfiCodigo) {
        this.dfiCodigo = dfiCodigo;
    }

    public String getDfiNombre() {
        return dfiNombre;
    }

    public void setDfiNombre(String dfiNombre) {
        this.dfiNombre = dfiNombre;
    }

    public String getDfiDescripcion() {
        return dfiDescripcion;
    }

    public void setDfiDescripcion(String dfiDescripcion) {
        this.dfiDescripcion = dfiDescripcion;
    }

    public String getDfiCodcobis() {
        return dfiCodcobis;
    }

    public void setDfiCodcobis(String dfiCodcobis) {
        this.dfiCodcobis = dfiCodcobis;
    }

    public String getDfiCodpcie() {
        return dfiCodpcie;
    }

    public void setDfiCodpcie(String dfiCodpcie) {
        this.dfiCodpcie = dfiCodpcie;
    }

    public Timestamp getDfiFechaHoraCrea() {
        return dfiFechaHoraCrea;
    }

    public void setDfiFechaHoraCrea(Timestamp dfiFechaHoraCrea) {
        this.dfiFechaHoraCrea = dfiFechaHoraCrea;
    }

    public Timestamp getDfiFechaHoraModifica() {
        return dfiFechaHoraModifica;
    }

    public void setDfiFechaHoraModifica(Timestamp dfiFechaHoraModifica) {
        this.dfiFechaHoraModifica = dfiFechaHoraModifica;
    }

    public String getDfiUsuarioCrea() {
        return dfiUsuarioCrea;
    }

    public void setDfiUsuarioCrea(String dfiUsuarioCrea) {
        this.dfiUsuarioCrea = dfiUsuarioCrea;
    }

    public String getDfiUsuarioModifica() {
        return dfiUsuarioModifica;
    }

    public void setDfiUsuarioModifica(String dfiUsuarioModifica) {
        this.dfiUsuarioModifica = dfiUsuarioModifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dfiId != null ? dfiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DestinoFinanciero)) {
            return false;
        }
        DestinoFinanciero other = (DestinoFinanciero) object;
        if ((this.dfiId == null && other.dfiId != null) || (this.dfiId != null && !this.dfiId.equals(other.dfiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.DestinoFinanciero[ dfiId=" + dfiId + " ]";
    }
}
