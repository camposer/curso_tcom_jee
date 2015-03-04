package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EjemploForm")
public class EjemploFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<form action='ImprimirForm'>");
		pw.println("Nombre: <input type='text' name='nombre'>");
		pw.println("<br>");
		pw.println("Guitarra <input type='checkbox' name='instrumento' value='0'>");
		pw.println("Batería <input type='checkbox' name='instrumento' value='1'>");
		pw.println("Bajo <input type='checkbox' name='instrumento' value='2'>");
		pw.println("<input type='submit' value='clic'>");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
