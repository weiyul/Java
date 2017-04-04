JSP Standard Tag Library(JSTL)

JSTL tags can be used to replace much of the Java code written in scriplets. 

JSTL tags are classified in five broad groups:
Core: covers flow control and variable support among other things.
XML: Tags to process an XML document
i18n: Tags to support internationalization
SQL: Tags to access a database
Functions: Tags to perform some of the common string operations. 

We need to add a declaration for JSTL in our JSP, add the following tablib declaration below the first page declaration <%@ page language="java"...>

<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>


set tag of JSTL: 
<c:set var="errMsg" value="${null}"/>
<c:set var="displayForm" value="${true}"/>


We have enclosed the value in ${}. This is called Expresson Language(EL). You enclose the Java expression in JSTL in ${}.

The request object is accessed in the JSTL tag via pageContext. 

In a real-world application, you would probably forward the request to another page after logging in the user successfully, instead of just displaying the welcome message on the same page. You coule use the <jsp:forward> tage to achieve this.  
