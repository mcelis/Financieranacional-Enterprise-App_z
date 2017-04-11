package co.com.cfn.personas.business.boundary;

import co.com.cfn.foundation.framework.annotations.BusinessBoundary;
import co.com.cfn.foundation.framework.components.util.ExceptionBuilder;
import co.com.cfn.foundation.framework.exceptions.BusinessException;
import co.com.cfn.foundation.framework.exceptions.SystemException;
import co.com.cfn.personas.domain.entity.Oficina;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zmiranda on 08/04/2017.
 */

import javax.persistence.*;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@BusinessBoundary
public class OficinaManager {
    // [fields] -----------------------------------

    private static Logger LOGGER = LogManager.getLogger(OficinaManager.class.getName());

    @PersistenceContext(unitName = "persistenciaCatalogoPCIE")
    private EntityManager em;

    public OficinaManager() {
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Oficina> listarOficina() throws SystemException, BusinessException {
        try {
            /*
            Query q2 = em.createNativeQuery("{EXEC STP_OFICINA_SELECT (?,?)}", Oficina.class);
            q2.setParameter(1, null);
            q2.setParameter(2, 1);

            List<Oficina> oficinas2 = q2.getResultList();*/

            Query q = em.createNamedQuery("consultargOficinas");
            q.setParameter("I_OFI_ID", null);
            q.setParameter("I_EMP_ID", 1);

            List<Oficina> oficinas = q.getResultList();
            return oficinas;
        } catch (PersistenceException  ex) {
            LOGGER.error("Business Boundary - a system error has occurred", ex);
            throw ExceptionBuilder.newBuilder()
                    .withMessage("system.generic.error")
                    .withRootException(ex)
                    .buildSystemException();
        }

    }
}
