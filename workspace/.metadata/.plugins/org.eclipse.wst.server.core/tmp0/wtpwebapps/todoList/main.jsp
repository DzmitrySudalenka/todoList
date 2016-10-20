<%@ taglib uri="/jstl/core" prefix="c" %>
<%@ page import="by.gsu.epamlab.Constants" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title><%= Constants.TITLE_MAIN %></title>
<link rel="stylesheet" type="text/css" 
	href="${pageContext.request.contextPath}<%= Constants.RESOURSE_PATH_CSS_STTYLE %>" />
</head>
<body>
<%@ include file="header.jsp" %>

<section>
	<c:choose>
		<c:when test="${empty user}">
			<%= Constants.TEXT_MAIN %>
		</c:when>
		<c:otherwise>
			<%= Constants.TEXT_HI %><c:out value="${user.name}"/>
			<%= Constants.TEXT_YOU_ROLE %><c:out value="${user.role}"/>
			<%= Constants.TEXT_DOT %>
		</c:otherwise>
	</c:choose>
</section>

<%@ include file="footer.jsp" %>
</body>
</html>