package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/HolaMundo" })
public class HolaMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String[] numeros = new String[] { "Uno", "Dos", "Tres" };
		
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Hola mundo</title>");
		pw.println("<script>");
		pw.println("var clic = function() {");
		pw.println("window.alert('hola');");
		pw.println("}");
		pw.println("</script>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("Hola mundo! " + new Date());
		
		pw.println("<table border='1'>");
		for (String n : numeros) 
			pw.println("<tr><td>" + n + "</td></tr>");
		pw.println("</table>");
		
		pw.println("<input type=\"button\" value='clic' onclick='clic()'>");
		pw.println("</body>");
		pw.println("</html>");
		
		// 1. Reiniciar servidor
		// 2. Ejecutar en el navegador 
		// http://localhost:8080/basico-web/HolaMundo
	}

}
