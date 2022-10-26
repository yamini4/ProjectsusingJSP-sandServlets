

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.*;
import com.entity.*;
import com.repo.*;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Student student= new Student();
    StudentDao studentDao=new StudentDao();
    StudentRepo srepo;
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("AddStudent")!=null) {
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			long pnumber=Long.parseLong(request.getParameter("pnumber"));
			String address=request.getParameter("address");
			Class1 c = new Class1();
			c.setId(Integer.parseInt(request.getParameter("cid")));
			
			student.setFirstName(fname);
			student.setLastNAme(lname);
			student.setPhoneNumber(pnumber);
			student.setAddress(address);
			student.setClasses(c);
			studentDao.createStudent(student);
			
			//response.sendRedirect("WelcomePage.jsp");
			RequestDispatcher rd= request.getRequestDispatcher("student_view.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("updateStudent")!=null){
            int id1 = Integer.parseInt(request.getParameter("uid"));
            String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			long pnumber=Long.parseLong(request.getParameter("pnumber"));
			String address=request.getParameter("address");
			
			studentDao.updateStudent(id1, fname, lname, pnumber, address);
           
            RequestDispatcher rd = request.getRequestDispatcher("student_view.jsp");
            rd.include(request, response);
        }
		
		if(request.getParameter("deleteStudent")!=null){
			int id2 = Integer.parseInt(request.getParameter("did"));
			student.setStid(id2);
			studentDao.deleteStudent(student);
			
			RequestDispatcher rd = request.getRequestDispatcher("student_view.jsp");
            rd.include(request, response);
		}
	}

}
