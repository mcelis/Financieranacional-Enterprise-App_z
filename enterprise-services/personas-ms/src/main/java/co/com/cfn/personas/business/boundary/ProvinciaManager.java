package co.com.cfn.personas.business.boundary;

import co.com.cfn.foundation.framework.annotations.BusinessBoundary;

import co.com.cfn.foundation.framework.components.util.ExceptionBuilder;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.domain.entity.Provincia;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Mark on 11/4/2017.
 */
@BusinessBoundary
public class ProvinciaManager {

    // [fields] -----------------------------------

    private static Logger LOGGER = LogManager.getLogger(NacionalidadManager.class.getName());

    @PersistenceContext(unitName = "persistenciaCatalogo")
    private EntityManager em;

    public ProvinciaManager() {
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Provincia> listarProvincia() throws SystemException, BusinessException {
        try {
            Query q = em.createNamedQuery("Provincia.findByPaiId", Provincia.class);
            q.setParameter("paiId", 64);
            return q.getResultList();
        } catch (PersistenceException ex) {
            LOGGER.error("Business Boundary - a system error has occurred", ex);
            throw ExceptionBuilder.newBuilder()
                    .withMessage("system.generic.error")
                    .withRootException(ex)
                    .buildSystemException();
        }

    }
}
