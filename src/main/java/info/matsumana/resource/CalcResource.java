package info.matsumana.resource;

import com.sun.jersey.api.core.ResourceContext;
import com.sun.jersey.api.view.Viewable;
import info.matsumana.domain.CalcDomain;
import info.matsumana.dto.CalcResourceParam;
import info.matsumana.infra.util.JaxrsUtil;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * リソース
 *
 * @author matsumana
 */
@Named
@RequestScoped
@Path("calc")
@Produces(MediaType.TEXT_HTML)
public class CalcResource {

    @Inject
    CalcDomain calcDomain;

    @GET
    public Viewable index() {
        return JaxrsUtil.newViewable("/calc.mustache");
    }

    @POST
    public Viewable calc(@Context ResourceContext rc) {
        CalcResourceParam param = rc.getResource(CalcResourceParam.class);
        calcDomain.calc(param);

        return JaxrsUtil.newViewable("/calc.mustache", param);
    }
}
