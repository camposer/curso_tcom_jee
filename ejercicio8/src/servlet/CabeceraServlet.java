package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CabeceraServlet
 */
@WebServlet("/Cabecera")
public class CabeceraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("	<meta charset='UTF-8'>");
		pw.println("	<title>Persona</title>");
		pw.println("	<link rel='stylesheet' href='css/comun.css' />");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<div style='background-color: blue; text-align: center'>Cabecera</div>");		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
