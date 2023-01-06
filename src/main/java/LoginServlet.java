

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import com.web.dao.LoginDaO;
import com.web.dao.LoginDaOImpl;
import com.web.model.user;
import com.web.service.LoginService;
import com.web.service.LoginServiceImplement;


/**
 * Servlet Filter implementation class RegisterServlet
 */
@WebFilter("/LoginServlet")
public class LoginServlet extends HttpFilter implements Filter {

       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		String userid = request.getParameter("userid");
		String phone = request.getParameter("phone");
	
		LoginService service = new LoginServiceImplement();
		

		if(userid.equals("") || phone.equals("")) {
//			out.print("<h2>**Please enter username and password**</h2> <br>");
			
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.include(request, response);
				
		}
		
		else if(service.isValidUser_det(userid, phone)) {
			LoginDaO dao = new LoginDaOImpl();
			List<user> userList1 = dao.getUsers();
			request.setAttribute("userId", userid);
			request.setAttribute("phone", phone);
			request.setAttribute("userList", userList1);
			chain.doFilter(request, response);
//			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
//			rd.include(request, response);
//			chain.doFilter(request, response);

		}
		
		
		else {
//			out.print("<h2>** Incorrect Login Credentials **</h2> ");
			
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.include(request, response);
		}
	}

	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
