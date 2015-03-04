package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Resultado")
public class ResultadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String sedad = request.getParameter("edad");
		Integer edad = Integer.parseInt(sedad); // Esto puede fallar!!
		String btnAgregar = request.getParameter("btnAgregar");
		
		response.setCharacterEncoding("utf-8");

		getServletContext()
			.getRequestDispatcher("/Cabecera")
			.include(request, response);
		
		PrintWriter pw = response.getWriter();
		
		if (btnAgregar != null)
			pw.println("Agregando...<br>");
		else
			pw.println("Modificando...<br>");
		
		pw.println("Nombre: " + nombre + "<br>");
		pw.println("Apellido: " + apellido + "<br>");
		pw.println("Edad: " + edad + "<br>");
			
		getServletContext()
			.getRequestDispatcher("/Pie")
			.include(request, response);
	}

}
