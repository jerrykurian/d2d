<%@page import="com.d2d.crud.model.User"%>
<%@page import="java.util.List"%>
<p>Create a <a href="new.jsp">new user</a>
<table>
	<thead>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
	</thead>
	<tbody>
		<% List<User> users = (List<User>)request.getAttribute("users"); 
		   for(User user:users){
		%>
		<tr>
			<td><%=user.getFirstName() %></td>
			<td><%=user.getLastName() %></td>
			<td><%=user.getEmail() %></td>
		</tr>
		<%
		   }
		%>
	</tbody>
</table>
