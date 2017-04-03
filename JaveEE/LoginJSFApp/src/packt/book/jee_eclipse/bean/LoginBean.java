package packt.book.jee_eclipse.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="loginBean")
@RequestScoped
public class LoginBean {
	private String userName;
	private String password;
	private String errorMsg;
	
	/* Note that the validate method returns a string. How is the return value used"?
	 * It is used for navigation purposes in JSF. The JSF runtime looks for hte JSF with tne same
	 * name as the string value returned after evaluating the expression in the action attribute of commandButton. 
	 * In the validate method, we return welcome if the user credentials are valid. We tell JSF runtime
	 * to navigate to welcome.xhtml in this case. If the credentials are invalid, we set an error message
	 * and return null, in which case, the JSF runtime displays th esame page.
	 */
	public String validate(){
		if("admin".equals(userName)&& "admin".equals(password)){
			errorMsg = null;
			return "welcome"; 
		}else{
			errorMsg = "Invalid user id or password. Please try again";
			return null;
		}
			
	}
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
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
