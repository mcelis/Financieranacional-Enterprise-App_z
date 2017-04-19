package co.com.cfn.foundation.canonical.personas;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Mark on 18/4/2017.
 */
@XmlRootElement(namespace = "http://cfn.com/domain-artifacts/personas/1.0.0")
public class TipoGarantiaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String codigo;
    private String nombre;
    private String codCobis;
    private String codPCIE;
    private Timestamp fechaHoraCrea;
    private Timestamp fechaHoraModifica;
    private String usuarioCrea;
    private String usuarioModifica;
}
