package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/persona/listar")
public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("	<meta charset='UTF-8'>");
		pw.println("	<title>Persona</title>");
		pw.println("	<link rel='stylesheet' href='../css/comun.css' />");
		pw.println("	<style>");
		pw.println("		#tabla-form tr:last-child td {");
		pw.println("			text-align: center;");
		pw.println("		}");
		pw.println("		");
		pw.println("		#tabla-personas td:nth-child(3), ");
		pw.println("		#tabla-personas td:nth-child(4),");
		pw.println("		#tabla-personas td:nth-child(5) {");
		pw.println("			text-align: center;");
		pw.println("		}");
		pw.println("	</style>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("	<h1>Personas</h1>");
		pw.println("	<table id='tabla-form' class='tabla-centrada'>");
		pw.println("		<tr>");
		pw.println("			<td>Nombre</td>");
		pw.println("			<td><input type='text' name='nombre'></td>");
		pw.println("		</tr>");
		pw.println("		<tr>");
		pw.println("			<td>Apellido</td>");
		pw.println("			<td><input type='text' name='apellido'></td>");
		pw.println("		</tr>");
		pw.println("		<tr>");
		pw.println("			<td>Edad</td>");
		pw.println("			<td><input type='number' name='edad'></td>");
		pw.println("		</tr>");
		pw.println("		<tr>");
		pw.println("			<td colspan='2'>");
		pw.println("				<input type='button' value='Agregar'>			");
		pw.println("				<input type='button' value='Modificar'>			");
		pw.println("			</td>");
		pw.println("		</tr>");
		pw.println("	</table>");
		pw.println("	<br>");
		pw.println("	<table id='tabla-personas' class='tabla-centrada tabla-datos'>");
		pw.println("		<thead>");
		pw.println("			<tr>");
		pw.println("				<th>Nombre</th>");
		pw.println("				<th>Apellido</th>");
		pw.println("				<th>Edad</th>");
		pw.println("				<th>Mostrar</th>");
		pw.println("				<th>Eliminar</th>");
		pw.println("			</tr>");
		pw.println("		</thead>");
		pw.println("		<tbody>");
		pw.println("			<tr>");
		pw.println("				<td>Juan</td>");
		pw.println("				<td>Pérez</td>");
		pw.println("				<td>35</td>");
		pw.println("				<td><a href='#'>mostrar</a></td>");
		pw.println("				<td><a href='#'>eliminar</a></td>");
		pw.println("			</tr>");
		pw.println("			<tr>");
		pw.println("				<td>María</td>");
		pw.println("				<td>García</td>");
		pw.println("				<td>40</td>");
		pw.println("				<td><a href='#'>mostrar</a></td>");
		pw.println("				<td><a href='#'>eliminar</a></td>");
		pw.println("			</tr>");
		pw.println("			<tr>");
		pw.println("				<td>Pedro</td>");
		pw.println("				<td>Gónzalez</td>");
		pw.println("				<td>50</td>");
		pw.println("				<td><a href='#'>mostrar</a></td>");
		pw.println("				<td><a href='#'>eliminar</a></td>");
		pw.println("			</tr>");
		pw.println("		</tbody>");
		pw.println("	</table>");
		pw.println("</body>");
		pw.println("</html>");
		pw.println("");
		pw.println("");
		pw.println("");
		pw.println("");
		
	}

}
