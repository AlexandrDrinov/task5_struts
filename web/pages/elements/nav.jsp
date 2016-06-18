<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">StrutsTask</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="<c:url value='/start.do'/>"><span><bean:message  key="url.start"/></span></a></li> 

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <bean:message  key="url.dropdown.language"/><b class="caret"></b>
                    </a>   
                    <ul class="dropdown-menu">
                        <li><a href="<c:url value='/en.do'/>">En</a></li> 
                        <li><a href="<c:url value='/ru.do'/>">Ru</a></li>    
                    </ul>   
                </li>
                
                <c:if test="${not empty user}">
                    <li><a href="<c:url value='/logout.do'/>"><span><bean:message  key="url.logout"/></span></a></li> 
                </c:if>
            </ul>
        </div>        
    </div>    
</nav>