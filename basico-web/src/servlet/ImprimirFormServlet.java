package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enumeration.InstrumentoTipo;

@WebServlet("/ImprimirForm")
public class ImprimirFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = (String)request.getAttribute("nombre");
		List<String> instrumentos = (List<String>)request.getAttribute("instrumentos");
		
		response.setCharacterEncoding("utf-8"); // Por defecto escribe en ISO!!
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("Cántame una canción " + nombre);
		pw.println(". Utilizando:<br>");

		for (String i : instrumentos) 
			pw.println(i + "<br>");
			
		pw.println("</body>");
		pw.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
