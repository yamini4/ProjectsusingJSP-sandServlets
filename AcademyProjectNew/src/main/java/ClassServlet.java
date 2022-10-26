

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ClassDao;
import com.entity.Class1;
import com.entity.Subject;
import com.entity.Teacher;
import com.repo.ClassRepo;

/**
 * Servlet implementation class ClassServlet
 */
public class ClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Class1 classes= new Class1();
    ClassDao classDao=new ClassDao();
    ClassRepo crepo;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("AddClass")!=null) {
			String name=request.getParameter("cname");
			classes.setC_Name(name);
			classDao.createClass(classes);
			//response.sendRedirect("WelcomePage.jsp");
			RequestDispatcher rd= request.getRequestDispatcher("class_view1.jsp");
			rd.forward(request, response);
		}
		if(request.getParameter("AddSubjectTeacher")!=null) {
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("showClass")!=null){
            List<Class1> c = new ArrayList<>();
            c = classDao.showAllClasses();
            request.setAttribute("classList", c);
            RequestDispatcher rd = request.getRequestDispatcher("class_view1.jsp");
            rd.forward(request, response);
        }
		
		if(request.getParameter("updateClass")!=null){
            int id1 = Integer.parseInt(request.getParameter("uid"));
            String ename = request.getParameter("ename");
            classDao.updateClass(id1, ename);
           
            RequestDispatcher rd = request.getRequestDispatcher("class_view1.jsp");
            rd.include(request, response);
        }
		
		if(request.getParameter("deleteClass")!=null){
            int id2 = Integer.parseInt(request.getParameter("did"));
            classes.setId(id2);
            classDao.deleteClass(classes);
             RequestDispatcher rd = request.getRequestDispatcher("class_view1.jsp");
            rd.forward(request, response);
        }
		if(request.getParameter("addTeaSub")!=null) {
			Set<Subject> s=new HashSet<Subject>();
			Set<Teacher> t=new HashSet<Teacher>();
			int sid=Integer.parseInt(request.getParameter("sid"));
			int cid=Integer.parseInt(request.getParameter("cid"));
			int tid=Integer.parseInt(request.getParameter("tid"));
			String cname=request.getParameter("cname");
			
			
			Subject s1=new Subject();
			Teacher t1=new Teacher();
			
			
			
			s1.setId(sid);
			
			t1.setTid(tid);
			
			s.add(s1);
			t.add(t1);
			
			classDao.add_Subject_Teacher(cid,cname, s, t);
			RequestDispatcher rd = request.getRequestDispatcher("class_view1.jsp");
            rd.forward(request, response);
		}
	}

}
