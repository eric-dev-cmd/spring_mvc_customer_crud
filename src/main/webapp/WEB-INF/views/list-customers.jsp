<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Customers</title>
<%-- <link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" /> --%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<div class="bg-success text-white">
					<h3 class="py-3 text-center">CRM - Customer Relationship
						Manager</h3>
				</div>
			</div>
			<div class="col-12 my-2">
				<button class="btn btn-danger">
					<b>Add Customer</b>
				</button>

			</div>
			<div class="col-12">
				<table class="table">
					<thead class="table-dark">
						<tr>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Email</th>
							<th scope="col" class="text-center">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="customer" items="${customers}">
							<c:url var="updateUrl" value="/customer/update">
								<c:param name="customerId" value="${customer.id}" />
							</c:url>
							<c:url var="deleteUrl" value="/customer/delete">
								<c:param name="customerId" value="${customer.id}" />
							</c:url>
							<tr>
								<th scope="col">${customer.firstName}</th>
								<th scope="col">${customer.lastName}</th>
								<th scope="col">${customer.email}</th>
								<th scope="col" class="text-center">
									<button class="btn btn-sm btn-info">
										<a href="${updateUrl}" class="text-decoration-none text-dark">Update</a>
									</button> &nbsp;
									<button class="btn btn-sm btn-danger">
										<a href="${deleteUrl}" class="text-decoration-none text-white"
											onclick="if(!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
									</button>
								</th>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>
</body>
</html>