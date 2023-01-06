

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.web.dao.RegisterDaoImpl;
import com.web.model.user;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		String userId=request.getParameter("user");
		String ph=request.getParameter("phone");


		RegisterDaoImpl dao1 = new RegisterDaoImpl();
//		List<user> userList=dao1.getUsers();
		user u=new user(userId,ph);
        int status=RegisterDaoImpl.insert(u);  
        if(status>0){  
        	RequestDispatcher rd = request.getRequestDispatcher("welcome2.jsp");
			rd.include(request, response);
            

        }else{  
 
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.include(request, response);
        }  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
