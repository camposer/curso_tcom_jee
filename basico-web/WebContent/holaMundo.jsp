<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String[] numeros = new String[] { "Uno", "Dos", "Tres" };
%>
<html>
<head>
	<title>Hola mundo</title>
	<script>
		var clic = function() {
			window.alert('hola');
		}
	</script>
</head>
<body>
	Hola mundo! <%= new Date() %>

	<table border='1'>
	<%
	
		for (String n : numeros) {
	%>
		<tr>
			<td><%= n %></td>
		</tr>
	<%
		}
	%>		
		
	</table>

	<input type="button" value='clic' onclick='clic()'>
</body>
</html>
