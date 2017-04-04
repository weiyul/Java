Extracted some contents from Java EE Development with Eclipse-Second Edition by Ram Kulkarni

Java code is written in JSP between <% and %>; such Java code blocks in JSP are called scriplets. You can also set page-level attributes in JSP. They are called page directives and are included between <%@ and %>. The JSP that we created already has a page directive to set the content type of the page. The content type tells the browser the type of the response (in this case, html/text) returned by the server. On the basis of the content type, the browswer displays the appropriate response. 

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8">

In JSP, you have access to a number of objects to help you process and generate a response, as described in the following:

Object: Response
request: HttpServletRequest. Use it to get request parameters and other request-related data.
response: HttpServletResponse. Use it to send a response. 
out: JSPWriter. Use this to generate a text response.
session: HTTPSession. Use this to get/put object in a session.
Application: ServletContext. Use this to get/put objects shared in the sample application. 

Note: <%=errMsg %> is the shortcut for <%out.print(errMsg);%>