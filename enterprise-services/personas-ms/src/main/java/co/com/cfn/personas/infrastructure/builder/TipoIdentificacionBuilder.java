package co.com.cfn.personas.infrastructure.builder;

import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoIdentificacion;

import java.sql.Timestamp;

/**
 * Created by zmiranda on 22/03/2017.
 */
public class TipoIdentificacionBuilder implements Builder<TipoIdentificacion> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public TipoIdentificacionBuilder() {
    }

    public TipoIdentificacionBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public TipoIdentificacionBuilder withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public TipoIdentificacionBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public TipoIdentificacionBuilder withDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public TipoIdentificacionBuilder withCodCobis(String codCobis) {
        this.codCobis = codCobis;
        return this;
    }

    public TipoIdentificacionBuilder withCodPCIE(String codPCIE) {
        this.codPCIE = codPCIE;
        return this;
    }

    public TipoIdentificacionBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoIdentificacionBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoIdentificacionBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoIdentificacionBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    public static TipoIdentificacionBuilder newInstance() {
        return new TipoIdentificacionBuilder();
    }

    @Override
    public TipoIdentificacion build() throws InfrastructureException {
        return new TipoIdentificacion(id, codigo, nombre, descripcion, codCobis, codPCIE, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }

}
