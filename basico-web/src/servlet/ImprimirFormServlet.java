package servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
		request.setCharacterEncoding("utf-8");
		String nombre = request.getParameter("nombre");
		
		response.setCharacterEncoding("utf-8"); // Por defecto escribe en ISO!!
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("Cántame una canción " + nombre);
		pw.println(". Utilizando:<br>");

		String[] instrumentos = request.getParameterValues("instrumento");
		for (String i : instrumentos) {
			int index = Integer.parseInt(i);
			pw.println(InstrumentoTipo.getTipo(index) + "<br>");
		}
			
		pw.println("</body>");
		pw.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
