
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class TShirtOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int orderNo = 100;

	public TShirtOrder() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String[] acc = request.getParameterValues("acc");
		String a = "";
		String tag = request.getParameter("tag");
		String pocket = request.getParameter("pocket");
		String colour = request.getParameter("colour");
		for (String s : acc) {
			a += s + " ";
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lab", "root",
					"root");
			if (conn != null) {
				Statement stmt;
				stmt = (Statement) conn.createStatement();
				stmt.executeUpdate("insert into TShirt values(" + orderNo + ",'" + a + "','" + tag + "','" + pocket + "','" + colour +"');");
				orderNo++;
				ResultSet rs;
				rs = stmt.executeQuery("select * from TShirt;");
				out.println("OrderNo\tAccessories\tTag\tPocket\tColour");
				while(rs.next()){
					out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));		
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
