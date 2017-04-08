package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.GrupoEtnicoDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.util.Date;

/**
 * Created by Mark on 28/3/2017.
 */
public class GrupoEtnicoDTOBuilder implements Builder<GrupoEtnicoDTO> {
    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Date fechaHoraCrea;
    private Date fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public GrupoEtnicoDTOBuilder() {
    }

    public static GrupoEtnicoDTOBuilder newInstance() {
        return new GrupoEtnicoDTOBuilder();
    }

    public GrupoEtnicoDTOBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public GrupoEtnicoDTOBuilder withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public GrupoEtnicoDTOBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public GrupoEtnicoDTOBuilder withCodCobis(String codCobis) {
        this.codCobis = codCobis;
        return this;
    }

    public GrupoEtnicoDTOBuilder withCodPCIE(String codPCIE) {
        this.codPCIE = codPCIE;
        return this;
    }

    public GrupoEtnicoDTOBuilder withFechaHoraCrea(Date fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public GrupoEtnicoDTOBuilder withFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public GrupoEtnicoDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public GrupoEtnicoDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public GrupoEtnicoDTO build() throws InfrastructureException {
        return new GrupoEtnicoDTO(id, codigo, nombre, codCobis, codPCIE, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }
}
