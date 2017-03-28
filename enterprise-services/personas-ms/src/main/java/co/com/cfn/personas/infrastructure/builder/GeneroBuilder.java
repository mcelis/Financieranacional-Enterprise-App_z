package co.com.cfn.personas.infrastructure.builder;

import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.Genero;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Mark on 27/3/2017.
 */
public class GeneroBuilder implements Builder<Genero> {
    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public GeneroBuilder(){
    }

    public GeneroBuilder withId(Integer id){
        this.id = id;
        return this;
    }

    public GeneroBuilder withCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public GeneroBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public GeneroBuilder withCodCobis(String codCobis){
        this.codCobis = codCobis;
        return this;
    }

    public GeneroBuilder withCodPCIE(String codPCIE){
        this.codPCIE = codPCIE;
        return this;
    }

    public GeneroBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public GeneroBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public GeneroBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public GeneroBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    public static GeneroBuilder newInstance(){
        return new GeneroBuilder();
    }

    public Genero build() throws InfrastructureException{
        return new Genero(id, codigo, nombre, codCobis, codPCIE, fechaHoraCrea,fechaHoraModifica, usuarioCrea, usuarioModifica);
    }

}
