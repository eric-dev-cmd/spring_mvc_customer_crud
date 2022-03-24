<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<form:form action="saving" modelAttribute="customer"
				method="POST">
				<form:hidden path="id" />

				<div class="col-12">
					<div class="mb-3">
						<label for="firstName" class="form-label">First Name</label> <form:input path="firstName"
							type="text" class="form-control" id="firstName"
							placeholder="Trung"/>
					</div>
					<div class="mb-3">
						<label for="lastName" class="form-label">Last Name</label> <form:input
							type="text" class="form-control" path="lastName"/>
					</div>
					<div class="mb-3">
						<label for="email" class="form-label">Email</label> <form:input
							type="text" class="form-control" path="email"/>
					</div>


				</div>
				<div class="col-12 my-2">
					<button class="btn btn-danger" type="submit">
						<b>Save</b>
					</button>

				</div>
			</form:form>
			<div class="col-12 my-2">
				<button class="btn btn-info">
					<a href="/customer/list"><b>Back to list</b></a>
				</button>

			</div>
		</div>
	</div>
</body>
</html>