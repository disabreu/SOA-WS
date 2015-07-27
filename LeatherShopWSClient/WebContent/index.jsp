<%-- 
    Document   : newjsp
    Created on : Apr 9, 2015, 8:07:03 AM
    Author     : diana
--%>

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
            /*       .btn_service{
                       padding:5px;
                       margin:10px;
                       width:250px;
                   }
                   .container{
                       border:2px solid grey;
                       width:270px;
                       margin-left: 40%;
                       
                   }
                   .heading{
                       text-align: center;
                       margin-top: 5%;
                   }
            */    </style>

    </head>
<body>
	<div class="page-header">
		<h1>Italian Leather Store</h1>
	</div>
	<div class="container">
		<div></div>

		<div class="panel panel-default"
			style="width: 380px; float: left; margin-right: 9px;">
			<div class="panel-heading">
				<h3 class="panel-title">Orders</h3>
			</div>
			<form name="form1" method="post" action="ClientServlet?action=btn1">
				<div class="panel-body">
					Get the list of Orders in a year
					<div class="form-group">
						<label for="year">Year</label> <input type="text"
							class="form-control" id="year" name="yr">
							
					</div>
					<div class="">
						<button type="Submit"
							class="btn_service btn btn-default">Find</button>
						<br>
					</div>
				</div>
			</form>
		</div>

		<div class="panel panel-default" style="width: 380px; float: left;">
			<div class="panel-heading">
				<h3 class="panel-title">Customers with Pending Orders</h3>
			</div>
			<div class="panel-body">
				Get the list of customers which have pending orders. <br>
				<button type="button"
					onclick="location.href = 'ClientServlet?action=btn2'"
					class="btn_service btn btn-default">Find</button>
				<br>
			</div>
		</div>

		<div class="panel panel-default" style="width: 380px; float: left;">
			<div class="panel-heading">
				<h3 class="panel-title">Products with Pending Orders</h3>
			</div>
			<div class="panel-body">
				Get the list of products which have pending orders. <br>
				<button type="button"
					onclick="location.href = 'ClientServlet?action=btn3'"
					class="btn_service btn btn-default">Find</button>
				<br>
			</div>
		</div>

		<div class="panel panel-default" style="width: 380px; float: left;">
			<div class="panel-heading">
				<h3 class="panel-title">Customer Information</h3>
			</div>
			<form name="form1" method="post" action="ClientServlet?action=btn4">
			<div class="panel-body" style="width: 380px;">
				Get Customer Information for an order <br>
				<div class="form-group">
					<label for="order">Order Number</label> <input type="text"
						class="form-control" id="order" name="ordid">
				</div>
				<button type="Submit" class="btn_service btn btn-default">Find</button>
					<!-- onclick="location.href = 'ClientServlet?action=btn4'" -->
					
				<br>
			</div>
			</form>
		</div>

		<div class="panel panel-default" style="width: 380px; float: left;">
			<div class="panel-heading">
				<h3 class="panel-title">Items without orders</h3>
			</div>
			<div class="panel-body" style="width: 380px;">
				Get all item without orders <br>
				<button type="button"
					onclick="location.href = 'ClientServlet?action=btn5'"
					class="btn_service btn btn-default">Find</button>
				<br>
			</div>
		</div>
	</div>
</body>
</html>
