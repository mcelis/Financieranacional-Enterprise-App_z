package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.ActividadPersonaDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.util.Date;

/**
 * Created by administrador_1 on 09/01/2017.
 */
public class ActividadPersonaDTOBuilder implements Builder<ActividadPersonaDTO> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String tipo;
    private String codCobis;
    private String codPcie;
    private Date fechaHoraCreacion;
    private Date fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;


    private ActividadPersonaDTOBuilder() {
    }

    public static ActividadPersonaDTOBuilder newInstance() {
        return new ActividadPersonaDTOBuilder();
    }


    public ActividadPersonaDTOBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public ActividadPersonaDTOBuilder withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public ActividadPersonaDTOBuilder withTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public ActividadPersonaDTOBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ActividadPersonaDTOBuilder withCodCobis(String codCobis) {
        this.codCobis = codCobis;
        return this;
    }

    public ActividadPersonaDTOBuilder withCodPcie(String codPcie) {
        this.codPcie = codPcie;
        return this;
    }

    public ActividadPersonaDTOBuilder withFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public ActividadPersonaDTOBuilder withFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
        return this;
    }

    public ActividadPersonaDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public ActividadPersonaDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public ActividadPersonaDTO build() throws InfrastructureException {
        return new ActividadPersonaDTO(id, codigo, nombre, tipo, codCobis, codPcie, fechaHoraCreacion, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }
}
