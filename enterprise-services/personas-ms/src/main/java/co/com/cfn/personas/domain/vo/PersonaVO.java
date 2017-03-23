package co.com.cfn.personas.domain.vo;

import java.util.Date;

public class PersonaVO {

    private Long idPersona;
    private String codigo;
    private String nombre;
    private String tipo;
    private String codCobis;
    private String codPcie;
    private Date fechaHoraCreacion;
    private Date fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public PersonaVO(Long idPersona, String codigo, String nombre, String tipo, String codPcie, String codCobis,
                     Date fechaHoraCreacion, Date fechaHoraModifica, String usuarioCrea, String usuarioModifica) {
        this.idPersona = idPersona;
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.codPcie = codPcie;
        this.codCobis = codCobis;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraModifica = fechaHoraModifica;
        this.usuarioCrea = usuarioCrea;
        this.usuarioModifica = usuarioModifica;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodCobis() {
        return codCobis;
    }

    public void setCodCobis(String codCobis) {
        this.codCobis = codCobis;
    }

    public String getCodPcie() {
        return codPcie;
    }

    public void setCodPcie(String codPcie) {
        this.codPcie = codPcie;
    }

    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public Date getFechaHoraModifica() {
        return fechaHoraModifica;
    }

    public void setFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
    }

    public String getUsuarioCrea() {
        return usuarioCrea;
    }

    public void setUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
    }

    public String getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }
}
