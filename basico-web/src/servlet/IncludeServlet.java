package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/Include" })
public class IncludeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String[] numeros = new String[] { "Uno", "Dos", "Tres" };
		
		// Incluyendo cabecera
		getServletContext()
			.getRequestDispatcher("/Cabecera")
			.include(request, response);
		
		PrintWriter pw = response.getWriter();
		pw.println("Hola mundo! " + new Date());
		
		pw.println("<table border='1'>");
		for (String n : numeros) 
			pw.println("<tr><td>" + n + "</td></tr>");
		pw.println("</table>");
		
		pw.println("<input type=\"button\" value='clic' onclick='clic()'>");
		
		// Incluyendo pie de página
		request.setAttribute("quien", "Una empresa ahí");
		getServletContext()
			.getRequestDispatcher("/Pie")
			.include(request, response);
	}

}
