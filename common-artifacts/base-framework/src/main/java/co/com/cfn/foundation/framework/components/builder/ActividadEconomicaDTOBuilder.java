package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.ActividadEconomicaDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 17/4/2017.
 */
public class ActividadEconomicaDTOBuilder implements Builder<ActividadEconomicaDTO> {

    private String aecId;
    private String aecNombre;
    private Integer aecNivel;
    private String aecCodcobis;
    private String aecCodpcie;
    private Timestamp aecFechaHoraCrea;
    private Timestamp aecFechaHoraModifica;
    private String aecUsuarioCrea;
    private String aecUsuarioModifica;

    public ActividadEconomicaDTOBuilder() {
    }

    public static ActividadEconomicaDTOBuilder newInstance() {
        return new ActividadEconomicaDTOBuilder();
    }

    public ActividadEconomicaDTOBuilder withaecId(String aecId) {
        this.aecId = aecId;
        return this;
    }

    public ActividadEconomicaDTOBuilder withNombre(String aecNombre) {
        this.aecNombre = aecNombre;
        return this;
    }

    public ActividadEconomicaDTOBuilder withNivel(Integer aecNivel) {
        this.aecNivel = aecNivel;
        return this;
    }

    public ActividadEconomicaDTOBuilder withCodCobis(String aecCodcobis) {
        this.aecCodcobis = aecCodcobis;
        return this;
    }

    public ActividadEconomicaDTOBuilder withCodPCIE(String aecCodpcie) {
        this.aecCodpcie = aecCodpcie;
        return this;
    }

    public ActividadEconomicaDTOBuilder withFechaHoraCrea(Timestamp aecFechaHoraCrea) {
        this.aecFechaHoraCrea = aecFechaHoraCrea;
        return this;
    }

    public ActividadEconomicaDTOBuilder withFechaHoraModifica(Timestamp aecfechaHoraModifica) {
        this.aecFechaHoraModifica = aecfechaHoraModifica;
        return this;
    }

    public ActividadEconomicaDTOBuilder withUsuarioCrea(String aecUsuarioCrea) {
        this.aecUsuarioCrea = aecUsuarioCrea;
        return this;
    }

    public ActividadEconomicaDTOBuilder withUsuarioModifica(String aecusuarioModifica) {
        this.aecUsuarioModifica = aecusuarioModifica;
        return this;
    }

    @Override
    public ActividadEconomicaDTO build() throws InfrastructureException{
        return new ActividadEconomicaDTO(aecId, aecNombre, aecNivel, aecCodcobis, aecCodpcie, aecFechaHoraCrea, aecFechaHoraModifica, aecUsuarioCrea, aecUsuarioModifica);
    }
}
