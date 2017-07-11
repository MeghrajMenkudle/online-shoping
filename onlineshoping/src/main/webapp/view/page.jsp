<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Online shopping - ${title}</title>

<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap diffrant theme -->
<link href="${css}/bootswatch-theme.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="${css}/style.css" rel="stylesheet">

<script type="text/javascript">
	window.menu = '${title}';
</script>

</head>

<body>
	<div class="wrpper">
		<!-- Navigation -->
		<%@include file="./comman/header.jsp"%>

		<!-- Page Content -->
		<div class="content">
			<c:if test="${isUserClickHome == true}">

				<%@include file="home.jsp"%>
			</c:if>
		</div>

		<c:if test="${isUserClickContact == true}">
			<%@include file="contact.jsp"%>
		</c:if>

		<c:if test="${isUserClickAbout == true}">
			<%@include file="about.jsp"%>
		</c:if>

		<!-- footer -->
		<%@include file="./comman/footer.jsp"%>

		<!-- jQuery -->
		<script src="${js}/jquery-1.9.1.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script src="${js}/bootstrap.min.js"></script>

		<!-- My project JavaScript -->
		<script src="${js}/myJs.js"></script>
	</div>
</body>

</html>
