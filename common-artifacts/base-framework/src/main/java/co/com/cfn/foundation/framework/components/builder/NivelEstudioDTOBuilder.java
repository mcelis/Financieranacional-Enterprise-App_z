package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.NivelEstudioDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.util.Date;

/**
 * Created by zmiranda on 27/03/2017.
 */
public class NivelEstudioDTOBuilder implements Builder<NivelEstudioDTO> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Date fechaHoraCrea;
    private Date fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public NivelEstudioDTOBuilder() {
    }

    public static NivelEstudioDTOBuilder newInstance() {
        return new NivelEstudioDTOBuilder();
    }

    public NivelEstudioDTOBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public NivelEstudioDTOBuilder withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public NivelEstudioDTOBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public NivelEstudioDTOBuilder withCodCobis(String codCobis) {
        this.codCobis = codCobis;
        return this;
    }

    public NivelEstudioDTOBuilder withCodPCIE(String codPCIE) {
        this.codPCIE = codPCIE;
        return this;
    }

    public NivelEstudioDTOBuilder withFechaHoraCrea(Date fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public NivelEstudioDTOBuilder withFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public NivelEstudioDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public NivelEstudioDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public NivelEstudioDTO build() throws InfrastructureException {
        return new NivelEstudioDTO(id, codigo, nombre, codCobis, codPCIE, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }
}
