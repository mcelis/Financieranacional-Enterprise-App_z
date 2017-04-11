package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoDocumentalDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

import java.sql.Timestamp;

/**
 * Created by zmiranda on 21/02/2017.
 */
public class TipoDocumentalDTOBuilder implements Builder<TipoDocumentalDTO> {

    private Integer id;
    private String nombre;
    private String usuarioCrea;
    private String usuarioModifica;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String descripcion;
    private Integer mesesVigencia;
    private Integer esAnexoF;

    private TipoDocumentalDTOBuilder() {
    }

    public static TipoDocumentalDTOBuilder newInstance() {
        return new TipoDocumentalDTOBuilder();
    }

    public TipoDocumentalDTOBuilder withId(Integer id){
        this.id = id;
        return this;
    }

    public TipoDocumentalDTOBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public TipoDocumentalDTOBuilder withUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
        return this;
    }

    public TipoDocumentalDTOBuilder withUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
        return this;
    }

    public TipoDocumentalDTOBuilder withFechaHoraCrea(Timestamp fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
        return this;
    }

    public TipoDocumentalDTOBuilder withFechaHoraModifica(Timestamp fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
        return this;
    }

    public TipoDocumentalDTOBuilder withDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }
    public TipoDocumentalDTOBuilder withMesesVigencia(Integer mesesVigencia) {
        this.mesesVigencia = mesesVigencia;
        return this;
    }

    public TipoDocumentalDTOBuilder withEsAnexoF(Integer esAnexoF){
        this.esAnexoF = esAnexoF;
        return this;
    }

    @Override
    public TipoDocumentalDTO build() throws InfrastructureException {
        return new TipoDocumentalDTO(id, nombre, usuarioCrea,usuarioModifica,fechaHoraCrea,fechaHoraModifica ,descripcion, mesesVigencia,esAnexoF);
    }


}
