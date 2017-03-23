package co.com.cfn.personas.business.boundary;

import co.com.cfn.foundation.framework.annotations.BusinessBoundary;

import co.com.cfn.foundation.framework.common.MessageUtil;
import co.com.cfn.foundation.framework.components.util.ExceptionBuilder;
import co.com.cfn.foundation.framework.constants.MessagesBundle;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.domain.entity.ActividadPersona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import java.util.List;

/**
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * CFN Generic Artifact
 * Created: 5-Ene-2017
 * Author: Administrator
 * JAVA class Artifact
 * Purpose: BOUNDARY - Model business services
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */

@BusinessBoundary
public class PersonasMananger {

    // [fields] -----------------------------------

    private static Logger LOGGER = LogManager.getLogger(PersonasMananger.class.getName());

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private ValidatorPersonas control;

    public PersonasMananger() {
    }

    // [business capability] ----------------------------------------

    public void crearPersona(final ActividadPersona ap) throws SystemException, BusinessException {

        LOGGER.info("processing business capability - crearPersona");

        try {

            control.validarAcuerdosPersona(ap);
            control.validarTiposAprobados(ap);

            em.persist(ap);
            em.flush();

            LOGGER.info("business capability 'crearPersona' has been executed succesfully");

        } catch (BusinessException be) {
            throw be;
        } catch (PersistenceException e) {
            LOGGER.error(MessageUtil.getInstance(MessagesBundle.PERSONAS).getMessage("system.generic.error"));
            throw ExceptionBuilder.newBuilder()
                    .withMessage(MessagesBundle.PERSONAS, "system.generic.error")
                    .buildSystemException();
        }

    }


    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ActividadPersona> listarActividadesPersona() throws SystemException, BusinessException {
        try {
            return em.createNamedQuery("ActividadPersona.findAll", ActividadPersona.class).getResultList();
        } catch (PersistenceException  ex) {
            LOGGER.error("Business Boundary - a system error has occurred", ex);
            throw ExceptionBuilder.newBuilder()
                    .withMessage("system.generic.error")
                    .withRootException(ex)
                    .buildSystemException();
        }

    }

}
