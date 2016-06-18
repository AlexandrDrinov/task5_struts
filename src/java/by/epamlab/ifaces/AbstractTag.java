package by.epamlab.ifaces;

import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public abstract class AbstractTag extends SimpleTagSupport {
    
    private String var;

    public void setVar(String var) {
        this.var = var;
    }

    public String getFullPath() {
        PageContext context = (PageContext) getJspContext();
        return context.getServletContext().getRealPath("/WEB-INF/reservation.xml");        
    }
}
