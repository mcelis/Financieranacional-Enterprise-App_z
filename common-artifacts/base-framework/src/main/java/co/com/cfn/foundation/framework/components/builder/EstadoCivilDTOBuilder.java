package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.EstadoCivilDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 27/3/2017.
 */
public class EstadoCivilDTOBuilder implements Builder<EstadoCivilDTO> {

    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public EstadoCivilDTOBuilder(){
    }

    public static EstadoCivilDTOBuilder newInstance(){
        return new EstadoCivilDTOBuilder();
    }

    public EstadoCivilDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }

    public EstadoCivilDTOBuilder withCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public EstadoCivilDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public EstadoCivilDTOBuilder withCodCobis(String codCobis){
        this.codCobis = codCobis;
        return this;
    }

    public EstadoCivilDTOBuilder withCodPCIE(String codPCIE){
        this.codPCIE = codPCIE;
        return this;
    }

    public EstadoCivilDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public EstadoCivilDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public EstadoCivilDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public EstadoCivilDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public EstadoCivilDTO build() throws InfrastructureException{
        return new EstadoCivilDTO(id, codigo,nombre, codCobis, codPCIE, fechaHoraCrea,fechaHoraModifica,usuarioCrea,usuarioModifica);
    }


}
