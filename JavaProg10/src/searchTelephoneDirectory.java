
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread.State;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class searchTelephoneDirectory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public searchTelephoneDirectory() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String non = request.getParameter("nameornumber");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/OnlineDirectory",
					"root", "root");
			if (conn != null) {
				Statement stmt;
				stmt = (Statement) conn.createStatement();
				ResultSet rs;
				try{
					rs = stmt.executeQuery("select * from TelephoneDirectory where pno = " + Integer.parseInt(non) + ";");
				}
				catch(Exception e){
					rs = stmt.executeQuery("select * from TelephoneDirectory where name = '" + non + "';");
				}
				while (rs.next()) {
					out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4)
							+ "\t" + rs.getString(5));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
