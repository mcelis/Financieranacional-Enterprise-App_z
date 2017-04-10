package co.com.cfn.personas.domain.entity;

/**
 * Created by zmiranda on 08/04/2017.
 */

import javax.persistence.*;

@Entity
@Table(name = "??remplazar???", schema = "dbo", catalog = "PCIE_SEG")
@NamedNativeQueries(
        @NamedNativeQuery(
                name = "consultargOficinas",
                query = "EXEC dbo.[STP_OFICINA_SELECT] :I_OFI_ID, :I_EMP_ID",
                resultClass = Oficina.class
        )
)
public class Oficina {

    @Id
    @Basic
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "CODIGO")
    private Integer codigo;

    @Basic
    @Column(name = "NOMBRE")
    private String nombre;

    public Oficina() {
    }

    public Oficina(Integer id, Integer codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
