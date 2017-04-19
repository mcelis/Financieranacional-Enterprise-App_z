package co.com.cfn.personas.domain.entity;



import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Mark on 10/4/2017.
 */

@Entity
@Table(name = "CTG_TIPO_TARJETA", schema = "dbo", catalog = "BPM_MDB")
@NamedQueries({
        @NamedQuery(name = "TipoTarjeta.findAll", query = "SELECT c FROM TipoTarjeta c")})

public class TipoTarjeta {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TTA_ID")
    private Integer ttaId;
    @Column(name = "TTA_CODIGO")
    private String ttaCodigo;
    @Column(name = "TTA_NOMBRE")
    private String ttaNombre;
    @Column(name = "TTA_CODCOBIS")
    private String ttaCodcobis;
    @Column(name = "TTA_CODPCIE")
    private String ttaCodpcie;
    @Column(name = "TTA_FECHA_HORA_CREA")
    private Timestamp ttaFechaHoraCrea;
    @Column(name = "TTA_FECHA_HORA_MODIFICA")
    private Timestamp ttaFechaHoraModifica;
    @Column(name = "TTA_USUARIO_CREA")
    private String ttaUsuarioCrea;
    @Column(name = "TTA_USUARIO_MODIFICA")
    private String ttaUsuarioModifica;

    public TipoTarjeta(){
    }

    public TipoTarjeta(Integer ttaId, String ttaCodigo, String ttaNombre, String ttaCodcobis, String ttaCodpcie, Timestamp ttaFechaHoraCrea, Timestamp ttaFechaHoraModifica, String ttaUsuarioCrea, String ttaUsuarioModifica) {
        this.ttaId = ttaId;
        this.ttaCodigo = ttaCodigo;
        this.ttaNombre = ttaNombre;
        this.ttaCodcobis = ttaCodcobis;
        this.ttaCodpcie = ttaCodpcie;
        this.ttaFechaHoraCrea = ttaFechaHoraCrea;
        this.ttaFechaHoraModifica = ttaFechaHoraModifica;
        this.ttaUsuarioCrea = ttaUsuarioCrea;
        this.ttaUsuarioModifica = ttaUsuarioModifica;
    }

        public Integer getTtaId() {
            return ttaId;
        }

        public void setTtaId(Integer ttaId) {
            this.ttaId = ttaId;
        }

        public String getTtaCodigo() {
            return ttaCodigo;
        }

        public void setTtaCodigo(String ttaCodigo) {
            this.ttaCodigo = ttaCodigo;
        }

        public String getTtaNombre() {
            return ttaNombre;
        }

        public void setTtaNombre(String ttaNombre) {
            this.ttaNombre = ttaNombre;
        }

        public String getTtaCodcobis() {
            return ttaCodcobis;
        }

        public void setTtaCodcobis(String ttaCodcobis) {
            this.ttaCodcobis = ttaCodcobis;
        }

        public String getTtaCodpcie() {
            return ttaCodpcie;
        }

        public void setTtaCodpcie(String ttaCodpcie) {
            this.ttaCodpcie = ttaCodpcie;
        }

        public Timestamp getTtaFechaHoraCrea() {
            return ttaFechaHoraCrea;
        }

        public void setTtaFechaHoraCrea(Timestamp ttaFechaHoraCrea) {
            this.ttaFechaHoraCrea = ttaFechaHoraCrea;
        }

        public Timestamp getTtaFechaHoraModifica() {
            return ttaFechaHoraModifica;
        }

        public void setTtaFechaHoraModifica(Timestamp ttaFechaHoraModifica) {
            this.ttaFechaHoraModifica = ttaFechaHoraModifica;
        }

        public String getTtaUsuarioCrea() {
            return ttaUsuarioCrea;
        }

        public void setTtaUsuarioCrea(String ttaUsuarioCrea) {
            this.ttaUsuarioCrea = ttaUsuarioCrea;
        }

        public String getTtaUsuarioModifica() {
            return ttaUsuarioModifica;
        }

        public void setTtaUsuarioModifica(String ttaUsuarioModifica) {
            this.ttaUsuarioModifica = ttaUsuarioModifica;
        }

        @Override
        public int hashCode() {
            int hash = 0;
            hash += (ttaId != null ? ttaId.hashCode() : 0);
            return hash;
        }

        @Override
        public boolean equals(Object object) {
            // TODO: Warning - this method won't work in the case the id fields are not set
            if (!(object instanceof TipoTarjeta)) {
                return false;
            }
            TipoTarjeta other = (TipoTarjeta) object;
            if ((this.ttaId == null && other.ttaId != null) || (this.ttaId != null && !this.ttaId.equals(other.ttaId))) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "javaapplication1.TipoTarjeta[ ttaId=" + ttaId + " ]";
        }

}

