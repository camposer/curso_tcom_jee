package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Pie")
public class PieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String quien = (String)request.getAttribute("quien");
		
		PrintWriter pw = response.getWriter();
		pw.println("<div style='background-color: grey'>"
				+ quien + ". Todos los derechos reservados</div>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
