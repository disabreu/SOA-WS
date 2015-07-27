<%-- 
    Document   : custPending
    Created on : Apr 9, 2015, 8:41:14 PM
    Author     : Priyanka
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Italian Leather Store</title>
		<script src="bootstrap/js/jquery.js"></script>
        <script src="bootstrap/js/bootstrap.js"></script>
        <style type="text/css">
            <%@include file="bootstrap/css/bootstrap.css" %>
            <%@include file="css/bootstrap-theme.css" %>
        </style>
		<style>
		/* table, tr, td, th {
			border: 2px solid gray;
			border-spacing: 0px;
			text-align: center;
			margin-left: 40%;
		} */
		</style>
</head>
<body>
	<h1 style="text-align: center;">List of customers with pending
		orders</h1>
	<table class="tableBorder table table-bordered table-hover table-striped well">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Phone</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${WS2}" var="cust">
			     <tr>
					<td><c:out value="${cust.firstName}" /></td>
					<td><c:out value="${cust.lastName}" /></td>
					<td><c:out value="${cust.phone}" /></td>
					<td><c:out value="${cust.email}" /></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</body>
</html>
