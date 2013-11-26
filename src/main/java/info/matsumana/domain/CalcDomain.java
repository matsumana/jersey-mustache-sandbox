package info.matsumana.domain;

import info.matsumana.dto.CalcResourceParam;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * ドメイン
 *
 * @author matsumana
 */
@Named
@RequestScoped
public class CalcDomain {

    public void calc(CalcResourceParam param) {
        param.ans = param.left + param.right;
    }
}
