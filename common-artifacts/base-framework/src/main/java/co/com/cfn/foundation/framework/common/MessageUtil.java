package co.com.cfn.foundation.framework.common;

/**
 * Created by administrador_1 on 04/01/2017.
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ResourceBundle;

public class MessageUtil {

    private static Logger LOGGER = LogManager.getLogger(MessageUtil.class.getName());
    private ResourceBundle bundle;
    private static MessageUtil INSTANCE;

    // [constructor] ----------------------------

    private MessageUtil(String bundleId) {
        try {
            bundle = ResourceBundle.getBundle(bundleId);
        } catch (Exception e) {
            LOGGER.error("Message Util - a system error has occurred", e);
            throw new RuntimeException(e);
        }
    }

    // ----------------------------

    public static MessageUtil getInstance(String bundleId) {
        if (INSTANCE == null)
            INSTANCE = new MessageUtil(bundleId);
        return INSTANCE;
    }


    // ----------------------------

    public String getMessage(String key) {
        return bundle.getString(key);
    }

}