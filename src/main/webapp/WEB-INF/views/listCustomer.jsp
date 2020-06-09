<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details List</title>
</head>
<body>
	<header>
		<h1>Customer List</h1>
	</header>
	<a href="customer_form">Add Customer</a>
	<c:if test="${!empty customers}">
		<table>

			<thead>
				<tr>
					<th>SN</th>
					<th>Id</th>
					<th>Name</th>
					<th>LastName</th>
					<th>Email</th>
					<th>UserName</th>
					<th>Password</th>


				</tr>
			</thead>
			<tbody>
				<c:forEach items="${customers}" var="cus" varStatus="i">

					<tr>
						<td>${i.count}</td>
						<td>${cus.id}</td>
						<td>${cus.name}</td>
						<td>${cus.lastName}</td>
						<td>${cus.email }</td>
						<td>${cus.userName}</td>
						<td>${cus.password }</td>
						<td><a href="customer_edit?id=${cus.id}">Edit</a></td>
						<td><a href="customer_delete?id=${cus.id}">Delete</a></td>


					</tr>
				</c:forEach>
			</tbody>
		</table>


	</c:if>



</body>
</html>