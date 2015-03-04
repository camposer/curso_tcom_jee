package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ambitos")
public class AmbitosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mensaje = request.getParameter("mensaje");
		
		// Agregando atributo al request
		request.setAttribute("mensaje", mensaje);
		
		// Agregando atributo a la sesión
		request.getSession().setAttribute("mensaje", mensaje);
		
		// Agregando atributo al servlet context
		getServletContext().setAttribute("mensaje", mensaje);
		
		// Redireccionando al servlet que imprime los atributos
		getServletContext()
			.getRequestDispatcher("/ImprimirAmbitos")
			.forward(request, response);
	}

}
