package by.epamlab.struts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import by.epamlab.ifaces.IUserDAO;
import by.epamlab.model.beans.User;
import by.epamlab.model.factories.UserFactory;
import by.epamlab.struts.forms.LoginForm;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

public class LoginAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ActionMessages errors = new ActionMessages();
        LoginForm loginForm = (LoginForm) form;
        IUserDAO userDAO = UserFactory.getClassFromFactory();
        User user = userDAO.getUser(loginForm.getUserLogin(), loginForm.getUserPassword());

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            return mapping.findForward("success");
        } else {
            errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("err.user.username.incorrect"));
            saveErrors(request, errors);
            return mapping.findForward("failure");
        }
    }
}
