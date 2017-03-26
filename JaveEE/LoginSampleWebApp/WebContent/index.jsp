<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
	<%String errMsg = null; %>
	<%//first check whether the form was submitted
	if("POST".equalsIgnoreCase(request.getMethod()) && request.getParameter("submit")!= null){ %>
		<jsp:useBean id="loginBean" class="packt.book.jee_eclipse.ch2.bean.LoginBean">
			<jsp:setProperty name="loginBean" property="*"/>
		</jsp:useBean>
		<%
			if(loginBean.isValidUser()){
				//valid user
				out.println("<h2>Welcome admin !</h2>");
				out.println("You are successfully logged in");
			}else{
				errMsg ="Invalid user id or password. Please try again";
			}
		 %>
	
		<%} %>


<body>
	<h2>Login</h2>
	<!-- Check error message. It it is set, then display it -->
	<%if (errMsg != null) { %>
	<span style="color:red;"><%out.print(errMsg); %></span>
	<%} %>
	<form method="post">
		User Name:<input type="text" name="userName"><br>
		Password:<input type="password" name="password"><br>
		<button type="submit" name="submit">Submit</button>
		<button type="reset">Reset</button>
	</form>
	
</body>
</html>