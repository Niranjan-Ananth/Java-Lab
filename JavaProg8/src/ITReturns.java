

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ITReturns extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ITReturns() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		String salary = request.getParameter("salary");
		String tax = request.getParameter("tax");
		
		PrintWriter out = response.getWriter();
		PrintWriter fwriter = new PrintWriter("/home/niran/1.txt");
		out.println("Name: " + name);
		fwriter.println("Name: " + name);
		fwriter.println("Gender: " + gender);
		fwriter.println("Phone number: " + phone);
		fwriter.println("Salary: " + salary);
		fwriter.println("Tax: " + tax);
		fwriter.close();
	}

}
