Extracted some contents from Java EE Development with Eclipse-Second Edition by Ram Kulkarni

Java Server Faces

When working with JSP, we saw that it is not a good idea to mix scriplets with the HTML markup. We solved this problem by using JavaBean. Java Server Faces takes this design further, and in addition to supporting JavaBeans, it provides built-in tags for HTML user controls, which are context aware, can perform validation, and cna presere the state between request. 

1. Create a dynamic web application. In the last page of the wizard, make user that you check the Generate web.xml deployment descriptor box. 

2. Download JSF libraries from https://maven.java.net/content/repositories/releases/org/glassfish/javax.faces/2.2.9/javax.faces-2.2.9.jar
and copy to the WEB-INF/lib folder in your project. 

3. JSF follows the MVC pattern. In the MVC pattern, the code to generate a user interface(view) is separate from the container of the data(model). The controller acts as the interface between the view and the model. It selects the model for processing a request on the basis of the result of the processing in the model. The advantage of MVC is that there is a clear separation of the UI and the business logic(which requires a different set of expertise) so that they can be developed independently to a large extent. In JSP, the implementation of MVC is optional, but JSF enforces the MVC design. 

Views in JSF are created as xhtml files. The controller is a servlet from the JSF library, and the models are Managed Beans (JavaBeans).

4. We will first configure a controller for JSF. We will add the servlet configuration and mapping in web.xmp which locates in WEB-INF folder.

Add the following XML snippet before </web-app>

<servlet>
  	<servlet-name>JSFServlet</servlet-name>
  	<servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
  	<load-on-startup>1</load-on-startup>
  </servlet>
  
  <servlet-mapping>
  	<servlet-name>JSFServlet</servlet-name>
  	<url-pattern>*.xhtml</url-pattern>
  </servlet-mapping>



  You can specify any name as servlet-name; just make sure that you use the same name in servlet-mapping. The class for the servlet is  javax.faces.webapp.FacesServlet, which is in the JAR file that we downloaded as the JSF libraries and copied to WEB-INF/lib. Further, we have mapped any request ending with .xhtml to this servlet.

  5. Next, we will create Managed Bean for our login page, which is the same as JavaBean with addition of JSF-specific annotation. 

EX, 

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="loginBean")
@RequestScoped
public class LoginBean{
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

Note: we access the managed bean in JSF by using the value of the name attribute of the ManagedBean annotation. Further, unlike JavaBean in JSP, we do not create it by using the <jsp:useBean> tag. The JSF runtime creates the bean if it is not already there in the required scope, in this case, the Request scope.

6. Create a new file called index.xhtml inside the WebContent folder of the project. When using JSF, you need to add a few namespace declarations at the top of the file.

<html
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">

7. Add the title and start the body tag:
<HEAD>
	<title>Login</title>
</HEAD>	
<BODY>
	<H2>Login</H2>
</BODY>

.....


