

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TeacherDao;
import com.entity.Teacher;
import com.repo.TeacherRepo;

/**
 * Servlet implementation class TeacherServlet
 */
public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Teacher teacher= new Teacher();
    TeacherDao teacherDao=new TeacherDao();
    TeacherRepo trepo;
    public TeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("AddTeacher")!=null) {
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			long pnumber=Long.parseLong(request.getParameter("pnumber"));
			String address=request.getParameter("address");
			String dn=request.getParameter("designation");
			
			teacher.setFirstName(fname);
			teacher.setLastName(lname);
			teacher.setPhoneNumber(pnumber);
			teacher.setAddress(address);
			teacher.setDesignation(dn);
			teacherDao.createTeacher(teacher);
			//response.sendRedirect("WelcomePage.jsp");
			RequestDispatcher rd= request.getRequestDispatcher("teacher_view.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("updateTeacher")!=null){
            int id1 = Integer.parseInt(request.getParameter("uid"));
            String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			long pnumber=Long.parseLong(request.getParameter("pnumber"));
			String address=request.getParameter("address");
			String dn=request.getParameter("designation");
			
			teacherDao.updateTeacher(id1, fname, lname, pnumber, address,dn);
           
            RequestDispatcher rd = request.getRequestDispatcher("teacher_view.jsp");
            rd.include(request, response);
        }
		
		if(request.getParameter("deleteTeacher")!=null){
			int id2 = Integer.parseInt(request.getParameter("did"));
			teacher.setTid(id2);
			teacherDao.deleteTeacher(teacher);
			
			RequestDispatcher rd = request.getRequestDispatcher("teacher_view.jsp");
            rd.include(request, response);
		}
	}

}
