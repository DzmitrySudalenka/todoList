<%@ taglib uri="/jstl/core" prefix="c" %>
<%@ page import="by.gsu.epamlab.Constants" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title><%= Constants.TITLE_LOGIN %></title>
<link rel="stylesheet" type="text/css" 
	href="${pageContext.request.contextPath}<%= Constants.RESOURSE_PATH_CSS_STTYLE %>" />
</head>
<body>
<%@ include file="header.jsp" %>

<section>
	<%@ include file="report.jsp" %>
	<form name="<%= Constants.KEY_FORM_LOGIN %>" method="POST" 
			action="<c:url value="<%= Constants.SEND_LOGIN %>"/>">
		<%= Constants.FORM_LABEL_LOGIN %><br>
		<input type="text" name=<%= Constants.KEY_LOGIN %> value=""><br>
		<%= Constants.FORM_LABEL_PASSWORD %><br>
		<input type="password" name=<%= Constants.KEY_PASSWORD %> value=""><br>
		<input type="submit" value="<%= Constants.LABEL_ENTER %>">
	</form>
</section>

<%@ include file="footer.jsp" %>
</body>
</html>