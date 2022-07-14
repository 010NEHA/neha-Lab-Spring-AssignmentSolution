<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Access Denied</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/styles.css" />
</head>
<body>
	<header>
		<h1>studentmanagement Portal</h1>
		<div class="user-info">
			<p>User: ${username}</p>
			|
			<p>
				<a href="${pageContext.request.contextPath}/logout">Logout</a>
			</p>
		</div>
	</header>
	<h1>HTTP Status 403 - Access is denied</h1>
	<h2>${msg}</h2>
	<button class="back-to-list back-to-list-update" type="button"
		onclick="location.href='${pageContext.request.contextPath}/students/list'">Back
		to List</button>
</body>
</html>