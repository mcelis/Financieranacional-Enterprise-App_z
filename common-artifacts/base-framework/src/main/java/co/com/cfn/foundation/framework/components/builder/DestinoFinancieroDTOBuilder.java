package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.DestinoFinancieroDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.util.Date;

/**
 * Created by Mark on 6/4/2017.
 */
public class DestinoFinancieroDTOBuilder implements Builder<DestinoFinancieroDTO> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Date fechaHoraCrea;
    private Date fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public DestinoFinancieroDTOBuilder(){
    }

    public static DestinoFinancieroDTOBuilder newInstance() {
        return new DestinoFinancieroDTOBuilder();
    }

    public DestinoFinancieroDTOBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public DestinoFinancieroDTOBuilder withCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public DestinoFinancieroDTOBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public DestinoFinancieroDTOBuilder withCodCobis(String codCobis) {
        this.codCobis = codCobis;
        return this;
    }

    public DestinoFinancieroDTOBuilder withCodPCIE(String codPCIE) {
        this.codPCIE = codPCIE;
        return this;
    }

    public DestinoFinancieroDTOBuilder withFechaHoraCrea(Date fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public DestinoFinancieroDTOBuilder withFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public DestinoFinancieroDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public DestinoFinancieroDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public DestinoFinancieroDTO build() throws InfrastructureException{
        return new DestinoFinancieroDTO(id, codigo, nombre, codCobis, codPCIE, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }



}
