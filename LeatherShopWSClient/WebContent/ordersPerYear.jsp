<%-- 
    Document   : ordersPerYear
    Created on : Apr 9, 2015, 8:40:45 PM
    Author     : Priyanka
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
     /*       table,tr,td,th{
                border:2px solid gray; 
                border-spacing: 0px;
                text-align: center;
                margin-left: 40%;
            }      */
        </style>
    </head>
    <body>
        <h1 style="text-align:center;">List of Orders given in a year</h1>
        <table align="center" class="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                    <th>Order.No.</th>
                    <th>Customer ID</th>
                    <th>Order Date</th>
                    <th>Status</th>
                </tr>                
            </thead>
            <tbody>
                 <c:forEach items="${WS1}" var= "order">
                    <tr>
                        <td><c:out value="${order.id}" /></td>
                        <td><c:out value="${order.customerId}" /></td>
                        <td><c:out value="${order.dateOrdered}" /></td>
                        <td><c:out value="${order.status}" /></td>
                    </tr>
                </c:forEach>
                
            </tbody>
        </table>
    </body>
</html>
