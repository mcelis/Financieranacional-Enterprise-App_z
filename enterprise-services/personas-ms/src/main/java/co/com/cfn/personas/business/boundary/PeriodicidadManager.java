package co.com.cfn.personas.business.boundary;

import co.com.cfn.foundation.framework.annotations.BusinessBoundary;

/**
 * Created by zmiranda on 09/04/2017.
 */
import co.com.cfn.foundation.framework.components.util.ExceptionBuilder;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.domain.entity.Periodicidad;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import java.util.List;

@BusinessBoundary
public class PeriodicidadManager {

    // [fields] -----------------------------------

    private static Logger LOGGER = LogManager.getLogger(PeriodicidadManager.class.getName());

    @PersistenceContext(unitName = "persistenciaCatalogo")
    private EntityManager em;

    public PeriodicidadManager() {
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Periodicidad> listarPeriodicidad() throws SystemException, BusinessException {
        try {
            return em.createNamedQuery("Periodicidad.findAll", Periodicidad.class).getResultList();
        } catch (PersistenceException  ex) {
            LOGGER.error("Business Boundary - a system error has occurred", ex);
            throw ExceptionBuilder.newBuilder()
                    .withMessage("system.generic.error")
                    .withRootException(ex)
                    .buildSystemException();
        }
    }
}
