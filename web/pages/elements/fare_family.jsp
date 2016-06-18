<%@ taglib uri="/WEB-INF/custom.tld" prefix="ctg" %> 
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/jstl/core" prefix="c"%>

<div class="container">
    <div class="row"> 			
        <div class="col-md-9">	

            <jsp:include page="/pages/menu.jsp" />  

            <c:catch var ="catchException">  
                <ctg:fare-family var="fareFamily"/> 
            </c:catch> 

            <c:if test = "${empty catchException}">                
                <div>
                    <h4><span><bean:message key="fare.family" /></span></h4>                    
                    <p> <span><bean:message key="fare.family.code" /></span> : ${ fareFamily.fareFamilyCode }</p>					
                </div>

                <div>
                    <h4><span><bean:message key="fare.family.codes" /></span></h4>
                    <c:forEach items="${fareFamily.ancillaryAirComponentList}" var="ancillaryAirComponent">  
                        <p>${ ancillaryAirComponent.ancillaryAirComponentCode }</p>
                    </c:forEach>
                </div>
            </c:if>
            <c:if test = "${not empty catchException}">
                <br/>
                <div class="err">Error. Fair family is null</div>
            </c:if>
        </div>
    </div> 
</div>



