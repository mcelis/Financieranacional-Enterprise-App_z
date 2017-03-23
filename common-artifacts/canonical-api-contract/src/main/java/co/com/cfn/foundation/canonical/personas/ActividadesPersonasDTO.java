package co.com.cfn.foundation.canonical.personas;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * CFN Generic Artifact
 * Created: 4-Ene-2017
 * Author: Administrator
 * Type: JAVA class
 * Artifact Purpose: DTO - Model Artifact
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */

@XmlRootElement(namespace = "http://cfn.com/domain-artifacts/personas/1.0.0")
public class ActividadesPersonasDTO {

    private List<ActividadPersonaDTO> personaDTOList;

    public ActividadesPersonasDTO(){}

    public List<ActividadPersonaDTO> getPersonaDTOList() {
        return personaDTOList;
    }

    public void setPersonaDTOList(List<ActividadPersonaDTO> personaDTOList) {
        this.personaDTOList = personaDTOList;
    }
}
