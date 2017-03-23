package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.TipoDocumentalDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

/**
 * Created by zmiranda on 21/02/2017.
 */
public class TipoDocumentalDTOBuilder implements Builder<TipoDocumentalDTO> {

    private Integer codigo;
    private String nombre;
    private String descripcion;

    private TipoDocumentalDTOBuilder() {
    }

    public static TipoDocumentalDTOBuilder newInstance() {
        return new TipoDocumentalDTOBuilder();
    }

    public TipoDocumentalDTOBuilder withCodigo(Integer codigo) {
        this.codigo = codigo;
        return this;
    }

    public TipoDocumentalDTOBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public TipoDocumentalDTOBuilder withDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    @Override
    public TipoDocumentalDTO build() throws InfrastructureException {
        return new TipoDocumentalDTO(codigo, nombre, descripcion);
    }


}
