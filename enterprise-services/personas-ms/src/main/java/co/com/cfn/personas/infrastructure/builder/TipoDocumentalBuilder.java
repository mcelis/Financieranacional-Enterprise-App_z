package co.com.cfn.personas.infrastructure.builder;

import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;
import co.com.cfn.personas.domain.entity.TipoDocumental;

/**
 * Created by zmiranda on 21/02/2017.
 */
public class TipoDocumentalBuilder implements Builder<TipoDocumental> {

    private Integer id;
    private String nombre;
    private String descripcion;

    private TipoDocumentalBuilder(){

    }

    public TipoDocumentalBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public TipoDocumentalBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public TipoDocumentalBuilder withDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public static TipoDocumentalBuilder newInstance() {
        return new TipoDocumentalBuilder();
    }

    @Override
    public TipoDocumental build() throws InfrastructureException {
        return new TipoDocumental(id, nombre, descripcion);
    }
}
