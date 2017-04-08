package co.com.cfn.personas.infrastructure.builder;

import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.EstadoCivil;

import java.sql.Timestamp;

/**
 * Created by Mark on 27/3/2017.
 */
public class EstadoCivilBuilder implements Builder<EstadoCivil> {
    private Integer id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public EstadoCivilBuilder(){
    }

    public EstadoCivilBuilder withId(Integer id){
        this.id = id;
        return this;
    }

    public EstadoCivilBuilder withCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public EstadoCivilBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public EstadoCivilBuilder withCodCobis(String codCobis){
        this.codCobis = codCobis;
        return this;
    }

    public EstadoCivilBuilder withCodPCIE(String codPCIE){
        this.codPCIE = codPCIE;
        return this;
    }

    public EstadoCivilBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public EstadoCivilBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public EstadoCivilBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public EstadoCivilBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    public static EstadoCivilBuilder newInstance(){
        return new EstadoCivilBuilder();
    }

    @Override
    public EstadoCivil build() throws InfrastructureException{
        return new EstadoCivil(id, codigo, nombre, codCobis, codPCIE, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }
}
