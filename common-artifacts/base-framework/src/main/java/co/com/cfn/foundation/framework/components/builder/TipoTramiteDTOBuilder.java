package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoTramiteDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.util.Date;

/**
 * Created by Mark on 26/3/2017.
 */
public class TipoTramiteDTOBuilder implements Builder<TipoTramiteDTO> {

    private Integer id;
    private String nombre;
    private String usuarioCrea;
    private String usuarioModifica;
    private Date fechaHoraCrea;
    private Date fechaHoraModifica;
    private Integer sePuedeVolverSolF;

    public TipoTramiteDTOBuilder(){
    }

    public static TipoTramiteDTOBuilder newInstance(){
        return new TipoTramiteDTOBuilder();
    }

    public TipoTramiteDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }
    public TipoTramiteDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public  TipoTramiteDTOBuilder withUsuarioCrea(String usuarioCrea){
        this.usuarioCrea = usuarioCrea;
        return this;
    }
    public  TipoTramiteDTOBuilder withUsuarioModifica(String usuarioModifica){
        this.usuarioModifica = usuarioModifica;
        return this;
    }
    public  TipoTramiteDTOBuilder withFechaHoraCrea(Date fechaHoraCrea){
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }
    public  TipoTramiteDTOBuilder withFechaHoraModifica(Date fechaHoraModifica){
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }
    public  TipoTramiteDTOBuilder withSePuedeVolverSolF(Integer sePuedeVolverSolF){
        this.sePuedeVolverSolF = sePuedeVolverSolF;
        return this;
    }

    @Override
    public TipoTramiteDTO build() throws InfrastructureException{
        return new TipoTramiteDTO(id,nombre,usuarioCrea,usuarioModifica,fechaHoraCrea,fechaHoraModifica,sePuedeVolverSolF);
    }

}
