package info.matsumana.dto;

import javax.ws.rs.FormParam;

/**
 * Dto
 *
 * @author matsumana
 */
public class CalcResourceParam {

    @FormParam("left")
    public Integer left;
    @FormParam("right")
    public Integer right;
    public Integer ans;
}
