<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String sedad = request.getParameter("edad");
		Integer edad = Integer.parseInt(sedad); // Esto puede fallar!!
		String btnAgregar = request.getParameter("btnAgregar");
%>	

<%-- Esto es un comentario embebido --%>
<!-- La contraseña de BD es: 123445 -->

<%@ include file="cabecera.jsp" %>

<%		
		if (btnAgregar != null)
			out.println("Agregando...<br>");
		else
			out.println("Modificando...<br>");
%>		

Nombre: <%= nombre  %><br>
Apellido: <%= apellido  %><br>
Edad: <%= edad  %><br>
			
<%@ include file="pie.jsp" %>
