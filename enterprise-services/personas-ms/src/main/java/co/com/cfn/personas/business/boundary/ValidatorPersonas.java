package co.com.cfn.personas.business.boundary;

import co.com.cfn.foundation.framework.annotations.BusinessControl;
import co.com.cfn.foundation.framework.components.util.ExceptionBuilder;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.personas.domain.entity.ActividadPersona;
import org.apache.commons.lang3.StringUtils;

@BusinessControl
public class ValidatorPersonas {

    public static final String TIPO_B1 = "TIPO_B1";
    public static final String TIPO_B2 = "TIPO_B2";

    public void validarTiposAprobados( final ActividadPersona ap ) throws BusinessException{

        if(StringUtils.isEmpty(ap.getAcpTipo()))
            throw ExceptionBuilder.newBuilder()
                    .withMessage("MessagesBundle.PERSONAS", "business.personas.validar_vacio_tipo")
                    .buildBusinessException();

        if(StringUtils.equals(ap.getAcpTipo(), TIPO_B1) || StringUtils.equals(ap.getAcpTipo(), TIPO_B2))
            throw ExceptionBuilder.newBuilder()
                    .withMessage("MessagesBundle.PERSONAS","business.personas.validar_tipo")
                    .buildBusinessException();

        //[] --------------------
    }


    public void validarAcuerdosPersona( final ActividadPersona ap) throws BusinessException{

        //[] --------------------
    }





}
