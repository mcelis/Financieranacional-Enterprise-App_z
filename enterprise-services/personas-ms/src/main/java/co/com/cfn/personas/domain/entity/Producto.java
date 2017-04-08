package co.com.cfn.personas.domain.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by Mark on 6/4/2017.
 */
@Entity
@Table(name = "CTG_PRODUCTO", schema = "dbo", catalog = "BPM_MDB" )
@NamedQueries({
        @NamedQuery(name = "Producto.findAll", query = "SELECT c FROM Producto c")})


public class Producto {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PRO_ID")
    private Integer proId;
    @Basic(optional = false)
    @Column(name = "PRO_NOMBRE")
    private String proNombre;
    @Basic(optional = false)
    @Column(name = "PRO_USUARIO_CREA")
    private String proUsuarioCrea;
    @Column(name = "PRO_USUARIO_MODIFICA")
    private String proUsuarioModifica;
    @Basic(optional = false)
    @Column(name = "PRO_FECHA_HORA_CREA")
    private Timestamp proFechaHoraCrea;
    @Column(name = "PRO_FECHA_HORA_MODIFICA")
    private Timestamp proFechaHoraModifica;
    @Basic(optional = false)
    @Column(name = "PRO_ES_VIGENTE_F")
    private int proEsVigenteF;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRO_PLAZO_MAXIMO")
    private BigDecimal proPlazoMaximo;
    @Column(name = "PRO_PERIODO_GRACIAPARCIAL")
    private BigDecimal proPeriodoGraciaparcial;
    @Column(name = "PRO_PERIODO_GRACIATOTAL")
    private BigDecimal proPeriodoGraciatotal;
    @Column(name = "PRO_VENTA_MINIMA_ANUAL")
    private BigDecimal proVentaMinimaAnual;
    @Column(name = "PRO_VENTA_MAXIMA_ANUAL")
    private BigDecimal proVentaMaximaAnual;
    @Basic(optional = false)
    @Column(name = "PRO_REGISTRO_IMPORT_SENAE_F")
    private int proRegistroImportSenaeF;
    @Basic(optional = false)
    @Column(name = "PRO_REGISTRO_EXPORT_SENAE_F")
    private int proRegistroExportSenaeF;
    @Column(name = "PRO_PORCENTAJE_MIN_GARANTIAS")
    private BigDecimal proPorcentajeMinGarantias;
    @Column(name = "PRO_ANTIGUEDAD_INVERSIONES")
    private Integer proAntiguedadInversiones;
    @Basic(optional = false)
    @Column(name = "PRO_APLICA_PER_NATURAL_F")
    private int proAplicaPerNaturalF;
    @Basic(optional = false)
    @Column(name = "PRO_APLICA_PER_JURIDICA_F")
    private int proAplicaPerJuridicaF;

    public  Producto(){
    }

    public Producto(Integer proId, String proNombre, String proUsuarioCrea, String proUsuarioModifica, Timestamp proFechaHoraCrea, Timestamp proFechaHoraModifica, int proEsVigenteF, BigDecimal proPlazoMaximo, BigDecimal proPeriodoGraciaparcial, BigDecimal proPeriodoGraciatotal, BigDecimal proVentaMinimaAnual, BigDecimal proVentaMaximaAnual, int proRegistroImportSenaeF, int proRegistroExportSenaeF, BigDecimal proPorcentajeMinGarantias, Integer proAntiguedadInversiones, int proAplicaPerNaturalF, int proAplicaPerJuridicaF) {
        this.proId = proId;
        this.proNombre = proNombre;
        this.proUsuarioCrea = proUsuarioCrea;
        this.proUsuarioModifica = proUsuarioModifica;
        this.proFechaHoraCrea = proFechaHoraCrea;
        this.proFechaHoraModifica = proFechaHoraModifica;
        this.proEsVigenteF = proEsVigenteF;
        this.proPlazoMaximo = proPlazoMaximo;
        this.proPeriodoGraciaparcial = proPeriodoGraciaparcial;
        this.proPeriodoGraciatotal = proPeriodoGraciatotal;
        this.proVentaMinimaAnual = proVentaMinimaAnual;
        this.proVentaMaximaAnual = proVentaMaximaAnual;
        this.proRegistroImportSenaeF = proRegistroImportSenaeF;
        this.proRegistroExportSenaeF = proRegistroExportSenaeF;
        this.proPorcentajeMinGarantias = proPorcentajeMinGarantias;
        this.proAntiguedadInversiones = proAntiguedadInversiones;
        this.proAplicaPerNaturalF = proAplicaPerNaturalF;
        this.proAplicaPerJuridicaF = proAplicaPerJuridicaF;
    }


    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public String getProUsuarioCrea() {
        return proUsuarioCrea;
    }

    public void setProUsuarioCrea(String proUsuarioCrea) {
        this.proUsuarioCrea = proUsuarioCrea;
    }

    public String getProUsuarioModifica() {
        return proUsuarioModifica;
    }

    public void setProUsuarioModifica(String proUsuarioModifica) {
        this.proUsuarioModifica = proUsuarioModifica;
    }

    public Timestamp getProFechaHoraCrea() {
        return proFechaHoraCrea;
    }

    public void setProFechaHoraCrea(Timestamp proFechaHoraCrea) {
        this.proFechaHoraCrea = proFechaHoraCrea;
    }

    public Timestamp getProFechaHoraModifica() {
        return proFechaHoraModifica;
    }

    public void setProFechaHoraModifica(Timestamp proFechaHoraModifica) {
        this.proFechaHoraModifica = proFechaHoraModifica;
    }

    public int getProEsVigenteF() {
        return proEsVigenteF;
    }

    public void setProEsVigenteF(int proEsVigenteF) {
        this.proEsVigenteF = proEsVigenteF;
    }

    public BigDecimal getProPlazoMaximo() {
        return proPlazoMaximo;
    }

    public void setProPlazoMaximo(BigDecimal proPlazoMaximo) {
        this.proPlazoMaximo = proPlazoMaximo;
    }

    public BigDecimal getProPeriodoGraciaparcial() {
        return proPeriodoGraciaparcial;
    }

    public void setProPeriodoGraciaparcial(BigDecimal proPeriodoGraciaparcial) {
        this.proPeriodoGraciaparcial = proPeriodoGraciaparcial;
    }

    public BigDecimal getProPeriodoGraciatotal() {
        return proPeriodoGraciatotal;
    }

    public void setProPeriodoGraciatotal(BigDecimal proPeriodoGraciatotal) {
        this.proPeriodoGraciatotal = proPeriodoGraciatotal;
    }

    public BigDecimal getProVentaMinimaAnual() {
        return proVentaMinimaAnual;
    }

    public void setProVentaMinimaAnual(BigDecimal proVentaMinimaAnual) {
        this.proVentaMinimaAnual = proVentaMinimaAnual;
    }

    public BigDecimal getProVentaMaximaAnual() {
        return proVentaMaximaAnual;
    }

    public void setProVentaMaximaAnual(BigDecimal proVentaMaximaAnual) {
        this.proVentaMaximaAnual = proVentaMaximaAnual;
    }

    public int getProRegistroImportSenaeF() {
        return proRegistroImportSenaeF;
    }

    public void setProRegistroImportSenaeF(int proRegistroImportSenaeF) {
        this.proRegistroImportSenaeF = proRegistroImportSenaeF;
    }

    public int getProRegistroExportSenaeF() {
        return proRegistroExportSenaeF;
    }

    public void setProRegistroExportSenaeF(int proRegistroExportSenaeF) {
        this.proRegistroExportSenaeF = proRegistroExportSenaeF;
    }

    public BigDecimal getProPorcentajeMinGarantias() {
        return proPorcentajeMinGarantias;
    }

    public void setProPorcentajeMinGarantias(BigDecimal proPorcentajeMinGarantias) {
        this.proPorcentajeMinGarantias = proPorcentajeMinGarantias;
    }

    public Integer getProAntiguedadInversiones() {
        return proAntiguedadInversiones;
    }

    public void setProAntiguedadInversiones(Integer proAntiguedadInversiones) {
        this.proAntiguedadInversiones = proAntiguedadInversiones;
    }

    public int getProAplicaPerNaturalF() {
        return proAplicaPerNaturalF;
    }

    public void setProAplicaPerNaturalF(int proAplicaPerNaturalF) {
        this.proAplicaPerNaturalF = proAplicaPerNaturalF;
    }

    public int getProAplicaPerJuridicaF() {
        return proAplicaPerJuridicaF;
    }

    public void setProAplicaPerJuridicaF(int proAplicaPerJuridicaF) {
        this.proAplicaPerJuridicaF = proAplicaPerJuridicaF;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proId != null ? proId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.proId == null && other.proId != null) || (this.proId != null && !this.proId.equals(other.proId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Producto[ proId=" + proId + " ]";
    }
}
