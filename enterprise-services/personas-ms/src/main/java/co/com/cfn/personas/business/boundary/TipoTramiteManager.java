package co.com.cfn.personas.business.boundary;

import co.com.cfn.foundation.framework.annotations.BusinessBoundary;
import co.com.cfn.foundation.framework.components.util.ExceptionBuilder;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.domain.entity.TipoTramite;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import java.util.List;

/**
 * Created by Mark on 26/3/2017.
 */
@BusinessBoundary
public class TipoTramiteManager {

    // [fields] -----------------------------------
    private static Logger LOGGER = LogManager.getLogger(PersonasMananger.class.getName());

    @PersistenceContext(unitName = "persistenciaCatalogo")
    private EntityManager em;

    public TipoTramiteManager(){
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<TipoTramite> listarTiposTramite() throws SystemException, BusinessException{
        try {
            return em.createNamedQuery("TipoTramite.findAll",TipoTramite.class).getResultList();
        } catch (PersistenceException ex) {
            LOGGER.error("Business Boundary - a system error has occurred", ex);
            throw ExceptionBuilder.newBuilder()
                    .withMessage("system.generic.error")
                    .withRootException(ex)
                    .buildSystemException();
        }
    }
}
