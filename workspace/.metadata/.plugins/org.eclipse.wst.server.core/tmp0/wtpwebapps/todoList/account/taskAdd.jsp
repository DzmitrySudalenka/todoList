<%@ taglib uri="/jstl/core" prefix="c" %>
<%@ page import="by.gsu.epamlab.Constants" %>
<%@ page import="by.gsu.epamlab.model.beans.TaskSection" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title><%= Constants.TITLE_TASK_ADD %></title>
<link rel="stylesheet" type="text/css" 
	href="${pageContext.request.contextPath}<%= Constants.RESOURSE_PATH_CSS_STTYLE %>" />
</head>
<body>
<%@ include file="/header.jsp" %>

<section>
	<%@ include file="/menu.jsp" %>
	<h3><%= Constants.TITLE_TASK_ADD %></h3>
	<%@ include file="/report.jsp" %>
	<form name="<%= Constants.KEY_FORM_TASK_ADD %>" method="POST" 
			action="<c:url value="<%= Constants.JUMP_CONTROLLER_TASK_ADD %>"/>">
		<div class="inputs clearfix">
		<textarea name="<%= Constants.KEY_DESCRIPTION %>"></textarea><br>
		<c:set var="someday" scope="page" 
			value="<%= Constants.ID_CHAR_TASK_SECTION_SOMEDAY %>"/>
		<c:if test="${taskSection.someday}">
			<input type="date" name="<%= Constants.KEY_DATE %>" 
				value="<c:out value="${defaultDate}"/>"><br>
		</c:if>
		<input class="left" type="submit" value="<%= Constants.LABEL_ADD %>">
		<a class="right" href="<c:url value="<%= Constants.JUMP_CONTROLLER_TASKS %>"/>">
			<%= Constants.LABEL_CANCEL %>
		</a>
		</div>
	</form>
</section>

<%@ include file="/footer.jsp"%>
</body>
</html>