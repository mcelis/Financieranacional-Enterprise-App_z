package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.PeriodicidadDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by zmiranda on 09/04/2017.
 */
public class PeriodicidadDTOBuilder implements Builder<PeriodicidadDTO> {

    private Long id;
    private String codigo;
    private String nombre;
    private Integer numeroDias;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public PeriodicidadDTOBuilder() {
    }

    public static PeriodicidadDTOBuilder newInstance() {
        return new PeriodicidadDTOBuilder();
    }

    public PeriodicidadDTOBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public PeriodicidadDTOBuilder withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public PeriodicidadDTOBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PeriodicidadDTOBuilder withNumeroDias(Integer numeroDias) {
        this.numeroDias = numeroDias;
        return this;
    }

    public PeriodicidadDTOBuilder withCodCobis(String codCobis) {
        this.codCobis = codCobis;
        return this;
    }

    public PeriodicidadDTOBuilder withCodPCIE(String codPCIE) {
        this.codPCIE = codPCIE;
        return this;
    }

    public PeriodicidadDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public PeriodicidadDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public PeriodicidadDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public PeriodicidadDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public PeriodicidadDTO build() throws InfrastructureException {
        return new PeriodicidadDTO(id, codigo, nombre, numeroDias, codCobis, codPCIE, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }
}
