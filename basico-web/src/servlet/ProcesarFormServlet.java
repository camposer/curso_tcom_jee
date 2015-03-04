package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enumeration.InstrumentoTipo;

@WebServlet("/ProcesarForm")
public class ProcesarFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Validando datos que vienen del cliente
		request.setCharacterEncoding("utf-8");
		String nombre = request.getParameter("nombre");
		
		if (nombre == null)
			throw new ServletException("Nombre inválido");
		
		String[] instrumentos = request.getParameterValues("instrumento");
		
		if (instrumentos == null || instrumentos.length <= 0)
			throw new ServletException("Instrumentos inválidos");
		
		// Pasando atributos al servlet que imprime
		List<String> listaInstrumentos = new ArrayList<String>();
		if (request.getParameterValues("instrumento") != null) {
			for (String i : request.getParameterValues("instrumento")) {
				Integer index = Integer.parseInt(i);
				listaInstrumentos.add(InstrumentoTipo.getTipo(index).name());
			}
		}
		
		request.setAttribute("nombre", nombre);
		request.setAttribute("instrumentos", listaInstrumentos);

		// Imprimiendo datos del cliente
		getServletContext()
			.getRequestDispatcher("/ImprimirForm")
			.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
