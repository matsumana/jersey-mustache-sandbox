package info.matsumana.infra.util;

import com.sun.jersey.api.view.Viewable;
import java.util.HashMap;

/**
 * JAX-RSユーティリティ
 *
 * @author matsumana
 */
public class JaxrsUtil {

    private JaxrsUtil() {
    }

    public static Viewable newViewable(String template) {
        return new Viewable(template, new HashMap());
    }

    public static Viewable newViewable(String template, Object model) {
        return new Viewable(template, model);
    }
}
