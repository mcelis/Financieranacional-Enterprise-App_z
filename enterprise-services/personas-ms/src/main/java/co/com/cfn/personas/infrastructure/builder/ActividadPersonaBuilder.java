package co.com.cfn.personas.infrastructure.builder;

import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.ActividadPersona;

import java.sql.Timestamp;
import java.util.Date;

public class ActividadPersonaBuilder implements Builder<ActividadPersona> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String tipo;
    private String codCobis;
    private String codPcie;
    private Timestamp fechaHoraCreacion;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    private ActividadPersonaBuilder() {
    }

    public ActividadPersonaBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public ActividadPersonaBuilder withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public ActividadPersonaBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ActividadPersonaBuilder withTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public ActividadPersonaBuilder withCodCobis(String codCobis) {
        this.codCobis = codCobis;
        return this;
    }

    public ActividadPersonaBuilder withCodPcie(String codPcie) {
        this.codPcie = codPcie;
        return this;
    }

    public ActividadPersonaBuilder withFechaHoraCreacion(Timestamp fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
        return this;
    }

    public ActividadPersonaBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public ActividadPersonaBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public ActividadPersonaBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    public static ActividadPersonaBuilder newInstance() {
        return new ActividadPersonaBuilder();
    }


    @Override
    public ActividadPersona build() throws InfrastructureException {
        return new ActividadPersona(id, codigo, nombre, tipo, codCobis, codPcie, fechaHoraCreacion, fechaHoraModifica, usuarioCrea, usuarioModifica);

    }
}
