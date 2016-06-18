<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/jstl/core" prefix="c"%>

<ul class="nav nav-tabs">
    <li>
        <a href="<c:url value='/pages/reservation.jsp'/>"><span>
                <bean:message key="menu.reservation.page" /></span></a>
    </li>
    <li>
        <a href="<c:url value='/pages/customer.jsp'/>" ><span>
                <bean:message key="menu.customer.page" /></span></a>
    </li>
    <li>
        <a href="<c:url value='/pages/fare_family.jsp'/>" ><span>
                <bean:message key="menu.fare.family.page" /></span></a>
    </li>
</ul>    