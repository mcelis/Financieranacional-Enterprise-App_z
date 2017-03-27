package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.NacionalidadDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.util.Date;

/**
 * Created by zmiranda on 27/03/2017.
 */
public class NacionalidadDTOBuilder implements Builder<NacionalidadDTO> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Date fechaHoraCrea;
    private Date fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public NacionalidadDTOBuilder() {
    }

    public static NacionalidadDTOBuilder newInstance() {
        return new NacionalidadDTOBuilder();
    }

    public NacionalidadDTOBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public NacionalidadDTOBuilder withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public NacionalidadDTOBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public NacionalidadDTOBuilder withCodCobis(String codCobis) {
        this.codCobis = codCobis;
        return this;
    }

    public NacionalidadDTOBuilder withCodPCIE(String codPCIE) {
        this.codPCIE = codPCIE;
        return this;
    }

    public NacionalidadDTOBuilder withFechaHoraCrea(Date fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public NacionalidadDTOBuilder withFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public NacionalidadDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public NacionalidadDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public NacionalidadDTO build() throws InfrastructureException {
        return new NacionalidadDTO(id, codigo, nombre, codCobis, codPCIE, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }
}
