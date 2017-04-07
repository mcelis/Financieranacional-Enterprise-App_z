package co.com.cfn.personas.business.boundary;

import co.com.cfn.foundation.framework.annotations.BusinessBoundary;

import co.com.cfn.foundation.framework.components.util.ExceptionBuilder;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.domain.entity.Genero;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import java.util.List;

/**
 * Created by Mark on 27/3/2017.
 */
@BusinessBoundary
public class GeneroManager {
    // [fields] -----------------------------------

    private static Logger LOGGER = LogManager.getLogger(GeneroManager.class.getName());

    @PersistenceContext
    private EntityManager em;

    public GeneroManager(){
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Genero> listarGeneros() throws SystemException, BusinessException{
        try {
            return em.createNamedQuery("Genero.findAll", Genero.class).getResultList();
        } catch (PersistenceException ex){
            LOGGER.error("Business Boundary - a system error has occurred", ex);
            throw ExceptionBuilder.newBuilder()
                    .withMessage("system.generic.error")
                    .withRootException(ex)
                    .buildSystemException();
        }
    }
}
