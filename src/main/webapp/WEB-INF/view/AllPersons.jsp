<%@page import="com.rebel.model.Person"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>allPersons</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
		</tr>
		<%
			List<Person> persons = (List<Person>) request.getAttribute("persons");
			for(Person person : persons){
				%>
				<tr>
					<td><%= person.getId() %> </td>
					<td><%= person.getName() %></td>
					<td><%= person.getEmail() %></td>
				</tr>				
				<%
			}
		%>
	</table>
</body>
</html>