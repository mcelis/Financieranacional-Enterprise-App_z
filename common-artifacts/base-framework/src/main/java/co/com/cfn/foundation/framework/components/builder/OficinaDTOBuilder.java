package co.com.cfn.foundation.framework.components.builder;

import co.com.cfn.foundation.canonical.personas.OficinaDTO;
import co.com.cfn.foundation.framework.components.interfaces.Builder;
import co.com.cfn.foundation.framework.exceptions.InfrastructureException;

/**
 * Created by zmiranda on 08/04/2017.
 */
public class OficinaDTOBuilder implements Builder<OficinaDTO> {

    private Integer id;
    private Integer codigo;
    private String nombre;

    public OficinaDTOBuilder() {
    }

    public static OficinaDTOBuilder newInstance() {
        return new OficinaDTOBuilder();
    }

    public OficinaDTOBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public OficinaDTOBuilder withCodigo(Integer codigo) {
        this.codigo = codigo;
        return this;
    }

    public OficinaDTOBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public OficinaDTO build() throws InfrastructureException {
        return new OficinaDTO(id, codigo, nombre);
    }
}
