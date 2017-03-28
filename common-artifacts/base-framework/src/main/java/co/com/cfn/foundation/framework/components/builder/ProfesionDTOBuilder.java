package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.ProfesionDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.util.Date;

/**
 * Created by zmiranda on 27/03/2017.
 */
public class ProfesionDTOBuilder implements Builder<ProfesionDTO> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Date fechaHoraCrea;
    private Date fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public ProfesionDTOBuilder() {
    }

    public static ProfesionDTOBuilder newInstance() {
        return new ProfesionDTOBuilder();
    }

    public ProfesionDTOBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public ProfesionDTOBuilder withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public ProfesionDTOBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProfesionDTOBuilder withCodCobis(String codCobis) {
        this.codCobis = codCobis;
        return this;
    }

    public ProfesionDTOBuilder withCodPCIE(String codPCIE) {
        this.codPCIE = codPCIE;
        return this;
    }

    public ProfesionDTOBuilder withFechaHoraCrea(Date fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public ProfesionDTOBuilder withFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public ProfesionDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public ProfesionDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public ProfesionDTO build() throws InfrastructureException {
        return new ProfesionDTO(id, codigo, nombre, codCobis, codPCIE, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }
}
