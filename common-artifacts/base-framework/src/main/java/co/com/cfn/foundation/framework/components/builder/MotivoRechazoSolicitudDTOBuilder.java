package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.MotivoRechazoSolicitudDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;


/**
 * Created by Mark on 8/4/2017.
 */
public class MotivoRechazoSolicitudDTOBuilder implements Builder<MotivoRechazoSolicitudDTO> {

    private Integer id;
    private String nombre;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;
    private String abrevMacroProceso;

    public MotivoRechazoSolicitudDTOBuilder(){
    }

    public static MotivoRechazoSolicitudDTOBuilder newInstance(){
        return new MotivoRechazoSolicitudDTOBuilder();
    }

    public MotivoRechazoSolicitudDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }


    public MotivoRechazoSolicitudDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }


    public MotivoRechazoSolicitudDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public MotivoRechazoSolicitudDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public MotivoRechazoSolicitudDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public MotivoRechazoSolicitudDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    public MotivoRechazoSolicitudDTOBuilder withAbrevMacroProceso(String abrevMacroProceso) {
        this.abrevMacroProceso = abrevMacroProceso;
        return this;
    }

    @Override
    public MotivoRechazoSolicitudDTO build() throws InfrastructureException{
        return new MotivoRechazoSolicitudDTO(id, nombre,  fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica, abrevMacroProceso);
    }

}
