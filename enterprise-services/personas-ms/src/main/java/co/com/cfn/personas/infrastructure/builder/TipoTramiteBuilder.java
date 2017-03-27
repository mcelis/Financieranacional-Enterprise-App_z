package co.com.cfn.personas.infrastructure.builder;

import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoTramite;

import java.sql.Timestamp;

/**
 * Created by Mark on 24/3/2017.
 */
public class TipoTramiteBuilder implements Builder<TipoTramite> {
    private Integer id;
    private String nombre;
    private String usuarioCrea;
    private String usuarioModifica;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private Integer sePuedeVolverSolF;

    public TipoTramiteBuilder(){
    }

    public TipoTramiteBuilder withId(Integer id){
        this.id = id;
        return this;
    }

    public TipoTramiteBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public  TipoTramiteBuilder withUsuarioCrea(String usuarioCrea){
        this.usuarioCrea = usuarioCrea;
        return this;
    }
    public  TipoTramiteBuilder withUsuarioModifica(String usuarioModifica){
        this.usuarioModifica = usuarioModifica;
        return this;
    }
    public  TipoTramiteBuilder withFechaHoraCrea(Timestamp fechaHoraCrea){
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }
    public  TipoTramiteBuilder withFechaHoraModifica(Timestamp fechaHoraModifica){
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }
    public  TipoTramiteBuilder withSePuedeVolverSolF(Integer sePuedeVolverSolF){
        this.sePuedeVolverSolF = sePuedeVolverSolF;
        return this;
    }

    public static TipoTramiteBuilder newInstance() {
        return new TipoTramiteBuilder();
    }

    @Override
    public TipoTramite build() throws InfrastructureException{
        return new TipoTramite(id, nombre, usuarioCrea,usuarioModifica,fechaHoraCrea,fechaHoraModifica,sePuedeVolverSolF);
    }


}

