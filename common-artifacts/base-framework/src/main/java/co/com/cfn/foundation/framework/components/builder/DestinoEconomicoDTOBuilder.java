package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.DestinoEconomicoDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.util.Date;

/**
 * Created by Mark on 5/4/2017.
 */
public class DestinoEconomicoDTOBuilder implements Builder<DestinoEconomicoDTO> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Date fechaHoraCrea;
    private Date fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public DestinoEconomicoDTOBuilder(){
    }

    public static DestinoEconomicoDTOBuilder newInstance() {
        return new DestinoEconomicoDTOBuilder();
    }

    public DestinoEconomicoDTOBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public DestinoEconomicoDTOBuilder withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public DestinoEconomicoDTOBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public DestinoEconomicoDTOBuilder withCodCobis(String codCobis) {
        this.codCobis = codCobis;
        return this;
    }

    public DestinoEconomicoDTOBuilder withCodPCIE(String codPCIE) {
        this.codPCIE = codPCIE;
        return this;
    }

    public DestinoEconomicoDTOBuilder withFechaHoraCrea(Date fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public DestinoEconomicoDTOBuilder withFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public DestinoEconomicoDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public DestinoEconomicoDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public DestinoEconomicoDTO build() throws InfrastructureException{
        return new DestinoEconomicoDTO(id, codigo, nombre, codCobis, codPCIE, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }
}
