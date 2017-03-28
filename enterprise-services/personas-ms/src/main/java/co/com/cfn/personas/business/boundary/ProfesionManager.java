package co.com.cfn.personas.business.boundary;

import co.com.cfn.foundation.framework.annotations.BusinessBoundary;
import co.com.cfn.foundation.framework.components.util.ExceptionBuilder;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.domain.entity.Profesion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import java.util.List;

/**
 * Created by zmiranda on 27/03/2017.
 */
@BusinessBoundary
public class ProfesionManager {

    // [fields] -----------------------------------

    private static Logger LOGGER = LogManager.getLogger(ProfesionManager.class.getName());

    @PersistenceContext
    private EntityManager em;

    public ProfesionManager() {
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Profesion> listarProfesion() throws SystemException, BusinessException {
        try {
            return em.createNamedQuery("Profesion.findAll", Profesion.class).getResultList();
        } catch (PersistenceException  ex) {
            LOGGER.error("Business Boundary - a system error has occurred", ex);
            throw ExceptionBuilder.newBuilder()
                    .withMessage("system.generic.error")
                    .withRootException(ex)
                    .buildSystemException();
        }

    }

}
