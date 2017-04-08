package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.GeneroDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 27/3/2017.
 */
public class GeneroDTOBuilder implements Builder<GeneroDTO> {
    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public GeneroDTOBuilder(){
    }

    public static GeneroDTOBuilder newInstance(){
        return new GeneroDTOBuilder();
    }

    public GeneroDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }

    public GeneroDTOBuilder withCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public GeneroDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public GeneroDTOBuilder withCodCobis(String codCobis){
        this.codCobis = codCobis;
        return this;
    }

    public GeneroDTOBuilder withCodPCIE(String codPCIE){
        this.codPCIE = codPCIE;
        return this;
    }

    public GeneroDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public GeneroDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public GeneroDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public GeneroDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public GeneroDTO build() throws InfrastructureException{
        return new  GeneroDTO(id, codigo, nombre,codCobis,codPCIE,  fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }

}
