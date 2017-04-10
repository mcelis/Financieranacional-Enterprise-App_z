package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.ProvinciaDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by zmiranda on 09/04/2017.
 */
public class ProvinciaDTOBuilder implements Builder<ProvinciaDTO> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;
    private Integer paisId;

    public ProvinciaDTOBuilder() {
    }

    public static ProvinciaDTOBuilder newInstance() {
        return new ProvinciaDTOBuilder();
    }

    public ProvinciaDTOBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public ProvinciaDTOBuilder withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public ProvinciaDTOBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProvinciaDTOBuilder withCodCobis(String codCobis) {
        this.codCobis = codCobis;
        return this;
    }

    public ProvinciaDTOBuilder withCodPCIE(String codPCIE) {
        this.codPCIE = codPCIE;
        return this;
    }

    public ProvinciaDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public ProvinciaDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public ProvinciaDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public ProvinciaDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    public ProvinciaDTOBuilder withPaisId(Integer paisId) {
        this.paisId = paisId;
        return this;
    }

    @Override
    public ProvinciaDTO build() throws InfrastructureException {
        return new ProvinciaDTO(id, codigo, nombre, codCobis, codPCIE, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica, paisId);
    }
}
