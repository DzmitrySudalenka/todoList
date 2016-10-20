<%@ taglib uri="/jstl/core" prefix="c" %>
<%@ page import="by.gsu.epamlab.Constants" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title><%= Constants.TITLE_TASK_FILE_ATTACH %></title>
<link rel="stylesheet" type="text/css" 
	href="${pageContext.request.contextPath}<%= Constants.RESOURSE_PATH_CSS_STTYLE %>" />
</head>
<body>
<%@ include file="/header.jsp" %>

<section>
	<%@ include file="/menu.jsp" %>
	<h3><%= Constants.TITLE_TASK_FILE_ATTACH %></h3>
	<%@ include file="/report.jsp" %>
	<form name="<%= Constants.KEY_FORM_TASK_FILE_ATTACH %>" method="POST" 
		enctype="multipart/form-data" action="<c:url value="<%= Constants.SEND_FILE %>"/>">
		<div class="inputs clearfix">
			<input type="file" name="<%= Constants.KEY_FILE_NAME %>"><br>
			<input class="left" type="submit" value="<%= Constants.LABEL_ATTACH %>">
			<a class="right" href="<c:url value="<%= Constants.JUMP_CONTROLLER_TASKS %>"/>">
				<%= Constants.LABEL_CANCEL %>
			</a>
		</div>
	</form>
</section>

<%@ include file="/footer.jsp"%>
</body>
</html>