<%@ taglib uri="/WEB-INF/custom.tld" prefix="ctg" %> 
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/jstl/core" prefix="c"%>

<div class="container">
    <div class="row"> 			
        <div class="col-md-9">	

            <jsp:include page="/pages/menu.jsp" />            	

            <c:catch var ="catchException">  
                <ctg:customer var="customer"/> 
            </c:catch> 

            <c:if test = "${empty catchException}">
                <div>
                    <h4><span><bean:message key="customer.information" /></span></h4>                    
                    <p><span><bean:message key="customer.customerDocID" /></span> : ${ customer.customerDocID }</p>
                    <p><span><bean:message key="customer.firstName" /></span> : ${ customer.firstName }</p>
                    <p><span><bean:message key="customer.lastName" /></span> : ${ customer.lastName }</p>
                    <p><span><bean:message key="customer.email" /></span> : ${ customer.email.emailAddress } </p>
                    <p><span><bean:message key="customer.phone" /></span> : ${ customer.phone.phoneNumber } </p>
                </div>
                <div>
                    <h4><span><bean:message key="customer.payments" /></span></h4>
                    <table>
                        <tr>
                            <th><span><bean:message key="customer.payment.amountPaid" /></span></th><th><span><bean:message key="customer.payment.formOfPaymentTypeCode" /></span></th><th><span><bean:message key="customer.payment.currencyCode" /></span></th>
                        </tr>
                        <c:forEach items="${customer.paymentsList}" var="payment">  
                            <tr>
                                <td>${payment.amountPaid}</td>
                                <td>${payment.formOfPaymentTypeCode}</td>
                                <td>${payment.currencyCode}</td>

                            </tr>
                        </c:forEach>
                    </table>

                </div>
            </c:if>
            <c:if test = "${not empty catchException}">
                <br/>
                <div class="err">Error. Customer is null</div>
            </c:if>
        </div>
    </div>



