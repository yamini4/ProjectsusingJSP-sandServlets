

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.SubjectDao;
import com.entity.Subject;
import com.repo.SubjectRepo;

/**
 * Servlet implementation class SubjectServlet
 */
public class SubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Subject subject= new Subject();
    SubjectDao subjectDao=new SubjectDao();
    SubjectRepo crepo;
    public SubjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("AddSubject")!=null) {
			String name=request.getParameter("sname");
			subject.setSubName(name);
			subjectDao.createSubject(subject);
			RequestDispatcher rd= request.getRequestDispatcher("subject_add.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("updateSubject")!=null){
            int id1 = Integer.parseInt(request.getParameter("uid"));
            String ename = request.getParameter("ename");
            subjectDao.updateSubject(id1, ename);
           
            RequestDispatcher rd = request.getRequestDispatcher("subject_add.jsp");
            rd.include(request, response);
        }
	}

}
