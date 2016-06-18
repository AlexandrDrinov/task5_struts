<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="container">
    <div class="row">           		
        <div class="col-md-3"></div>					
        <div class="col-md-9"> 
            <div class="err"><html:errors /></div>    

            <html:form action="/login">
                <span> <bean:message  key="user.login"/></span><span> : </span><html:text name="LoginForm" property="userLogin" />
                <span> <bean:message  key="user.password"/></span><span> : </span><html:password name="LoginForm" property="userPassword" />
                <html:submit>
                    <bean:message key="form.login.submit" />
                </html:submit>
            </html:form>
        </div>
    </div>
</div>