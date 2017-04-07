package co.com.cfn.foundation.canonical.personas;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Mark on 6/4/2017.
 */
@XmlRootElement(namespace = "http://cfn.com/domain-artifacts/personas/1.0.0")
public class ProductoDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nombre;
    private String usuarioCrea;
    private String usuarioModifica;
    private Date fechaHoraCrea;
    private Date fechaHoraModifica;
    private Integer esVigenteF;
    private String codCobis;
    private String codPCIE;


}
