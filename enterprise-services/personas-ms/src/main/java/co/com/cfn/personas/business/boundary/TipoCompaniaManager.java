package co.com.cfn.personas.business.boundary;


import co.com.cfn.foundation.framework.components.util.ExceptionBuilder;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.domain.entity.TipoCompania;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import java.util.List;

/**
 * Created by Mark on 18/4/2017.
 */
public class TipoCompaniaManager {

    // [fields] -----------------------------------

    private static Logger LOGGER = LogManager.getLogger(TipoCompania.class.getName());

    @PersistenceContext(unitName = "persistenciaCatalogo")
    private EntityManager em;

    public TipoCompaniaManager(){
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<TipoCompania> listarTipoCompania() throws SystemException, BusinessException{
        try {
            return em.createNamedQuery("TipoCompania.findAll", TipoCompania.class).getResultList();
        } catch (PersistenceException ex){
            LOGGER.error("Business Boundary - a system error has occurred", ex);
            throw ExceptionBuilder.newBuilder()
                    .withMessage("system.generic.error")
                    .withRootException(ex)
                    .buildSystemException();
        }
    }
}
