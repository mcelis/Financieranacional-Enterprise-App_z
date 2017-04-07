package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.OtroProductoDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by Mark on 6/4/2017.
 */
public class OtroProductoDTOBuilder implements Builder<OtroProductoDTO> {

    private Integer id;
    private String nombre;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;

    public OtroProductoDTOBuilder(){
    }

    public static OtroProductoDTOBuilder newInstance(){
        return new OtroProductoDTOBuilder();
    }

    public OtroProductoDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }


    public OtroProductoDTOBuilder withNombre(String nombre){
        this.nombre = nombre;
        return this;
    }


    public OtroProductoDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public OtroProductoDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public OtroProductoDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public OtroProductoDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    @Override
    public OtroProductoDTO build() throws InfrastructureException {
        return new  OtroProductoDTO(id,  nombre, fechaHoraCrea, fechaHoraModifica, usuarioCrea, usuarioModifica);
    }
}
