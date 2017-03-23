package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoIdentificacionDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.util.Date;

/**
 * Created by zmiranda on 22/03/2017.
 */
public class TipoIdentificacionDTOBuilder implements Builder<TipoIdentificacionDTO> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private String codCobis;
    private String codPCIE;
    private Date fechaHoraCrea;
    private Date fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoIdentificacionDTOBuilder() {
    }

    public static TipoIdentificacionDTOBuilder newInstance() {
        return new TipoIdentificacionDTOBuilder();
    }

    public TipoIdentificacionDTOBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public TipoIdentificacionDTOBuilder withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public TipoIdentificacionDTOBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public TipoIdentificacionDTOBuilder withDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public TipoIdentificacionDTOBuilder withCodCobis(String codCobis) {
        this.codCobis = codCobis;
        return this;
    }

    public TipoIdentificacionDTOBuilder withCodPCIE(String codPCIE) {
        this.codPCIE = codPCIE;
        return this;
    }

    public TipoIdentificacionDTOBuilder withFechaHoraCrea(Date fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoIdentificacionDTOBuilder withFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoIdentificacionDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoIdentificacionDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public TipoIdentificacionDTO build() throws InfrastructureException {
        return new TipoIdentificacionDTO(id, codigo, nombre, descripcion, codCobis, codPCIE, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }
}
