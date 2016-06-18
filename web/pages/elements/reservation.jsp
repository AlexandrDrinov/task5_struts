<%@ taglib uri="/WEB-INF/custom.tld" prefix="ctg" %> 
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/jstl/core" prefix="c"%>

<div class="container">
    <div class="row"> 			
        <div class="col-md-9">	

            <jsp:include page="/pages/menu.jsp" />

            <c:catch var ="catchReservation">  
                <ctg:reservation var="reservation"/>                 
            </c:catch> 

            <c:if test = "${empty catchReservation }">
                <div>
                    <h4><span><bean:message key="reservation.title" /></span></h4>
                    <p><span><bean:message key="reservation.code" /></span> : ${ reservation.code }</p>
                    <p><span><bean:message key="reservation.description" /></span> : ${ reservation.description }</p>	

                    <h4><span><bean:message key="reservation.customer.title" /></span></h4>

                    <c:catch var ="catchExceptionCustomer">  
                        <ctg:customer var="customer"/>
                    </c:catch> 
                    <c:if test = "${empty catchExceptionCustomer}">                        
                        <p><span><bean:message key="reservation.customer.id" /></span> : ${ customer.customerDocID }</p>    
                    </c:if>
                    <c:if test = "${not empty catchExceptionCustomer}">
                        <p><span><bean:message key="reservation.customer.id" /></span> : null</p>
                        <div class="err">Error. Customer is null</div>
                    </c:if>
                </div>

                <div>
                    <h4><span><bean:message key="reservation.component.title" /></span></h4>

                    <c:catch var ="catchExceptionResComponent">  
                        <ctg:res-component var="components"/>
                    </c:catch>
                    <c:if test = "${empty catchExceptionResComponent}">
                        <table>
                            <tr>
                                <th><span><bean:message key="reservation.component.code" /></span></th><th><span><bean:message key="reservation.component.date" /></span></th>
                                <th><span><bean:message key="reservation.component.status" /></span></th><th><span><bean:message key="reservation.component.sequence" /></span></th>
                            </tr>
                            <c:forEach items="${resComponents}" var="component">  
                                <tr>
                                    <td>${component.componentTypeCode}</td>
                                    <td>${component.createDateTime}</td>
                                    <td>${component.internalStatus}</td>
                                    <td>${component.sequence}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </c:if>
                    <c:if test = "${not empty catchExceptionResComponent}">                        
                        <div class="err">Error. ResComponent is null</div>
                    </c:if>
                </div>

            </c:if>
            <c:if test = "${not empty catchReservation}">
                <br/>
                <div class="err">Error. Resrvation is null</div>
            </c:if>
        </div>
    </div> 
</div>



