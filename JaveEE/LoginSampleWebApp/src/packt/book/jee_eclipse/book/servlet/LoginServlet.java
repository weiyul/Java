package packt.book.jee_eclipse.book.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected String createForm(String errMsg){
		StringBuilder sb = new StringBuilder("<h2>Login</h2>");
		//check whether error message is to be displayed
		if(errMsg != null){
			sb.append("span style='color: red;'>")
			.append(errMsg)
			.append("</xpan>");
		}
		//create form
		sb.append("<form method = 'post'>\n")
		.append("User Name:<input type='text' name='userName'><br>\n")
		.append("Password:<input type='password' name='password'><br>\n")
		.append("<button type='submit' name='submit'>Submit</button>\n")
		.append("<button type='reset'>Reset</button>\n")
		.append("</form>");
		return sb.toString();
	}

}
