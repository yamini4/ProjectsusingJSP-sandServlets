

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDAO;
import com.dao.Employee_Dao;
import com.entity.Employee;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Employee employee = new Employee();
	Employee_Dao employeeDao = new Employee_Dao();
	EmployeeDAO edao;
	
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("addEmployee")!=null) {
			String name = request.getParameter("ename");
			String email = request.getParameter("eEmail");
			employee.setName(name);
			employee.setEmail(email);
			employeeDao.saveEmployee(employee);
			RequestDispatcher rd=request.getRequestDispatcher("EmpAdd.jsp");
			rd.forward(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("showEmployee")!=null){
            List<Employee> employeeList = new ArrayList<>();
            employeeList = employeeDao.showAllEmployees();
            request.setAttribute("employeeList", employeeList);
            RequestDispatcher rd = request.getRequestDispatcher("ShowAll.jsp");
            rd.forward(request, response);
        }
         
          if(request.getParameter("updateEmployee")!=null){
             int id1 = Integer.parseInt(request.getParameter("uid"));
             String ename = request.getParameter("ename");
             String eEmail = request.getParameter("eEmail");
             employeeDao.updateEmployee(id1, ename, eEmail);
             
             RequestDispatcher rd = request.getRequestDispatcher("EmpAdd.jsp");
             rd.forward(request, response);
             
         }
          
         if(request.getParameter("deleteEmployee")!=null){
             int id2 = Integer.parseInt(request.getParameter("did"));
             employee.setId(id2);
             employeeDao.deleteEmployee(employee);
              RequestDispatcher rd = request.getRequestDispatcher("EmpAdd.jsp");
            rd.forward(request, response);
         }
         
	}

}
