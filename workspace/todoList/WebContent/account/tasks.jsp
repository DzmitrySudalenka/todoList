<%@ taglib uri="/jstl/core" prefix="c" %>
<%@ page import="by.gsu.epamlab.Constants" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title><c:out value="${taskSection.title}"/></title>
<link rel="stylesheet" type="text/css" 
	href="${pageContext.request.contextPath}<%= Constants.RESOURSE_PATH_CSS_STTYLE %>" />
</head>
<body>
<%@ include file="/header.jsp" %>

<section>
	<%@ include file="/menu.jsp" %>
	<h3><c:out value="${taskSection.title}"/></h3>
	<%@ include file="/report.jsp" %>
	<div class="clearfix">
	<c:choose>
		<c:when test="${empty tasks}">
			<div class="msg clearfix">
				<%= Constants.TEXT_NO_TASKS %>
			</div>
		</c:when>
		<c:otherwise>
			<form name="<%= Constants.KEY_FORM_TASKS %>" method="POST">
			<table class="tasks">
			<tr>
				<th></th>
				<th><%= Constants.LABEL_DESCRIPTION %></th>
				<c:if test="${taskSection.showDate}">
				   <th><%= Constants.LABEL_DATE %></th>
				</c:if>
				<th><%= Constants.LABEL_FILE %></th>
			</tr>
			<c:forEach items="${tasks}" var="task">
				<tr>
				<td><input type="checkbox" name="<%= Constants.KEY_TASK_IDS %>" 
						value="${task.id}"></td>
				<td>${task.description}</td>
				<c:if test="${taskSection.showDate}">
				   <td class="date">${task.date}</td>
				</c:if>
				<td class="file">
					<c:choose>
						<c:when test="${task.haveFile}">
							<button type="submit" name="<%= Constants.KEY_TASK_ID %>" 
							value="${task.id}" formaction="<c:url 
							value="<%= Constants.JUMP_CONTROLLER_TASK_FILE_DOWNLOAD %>"/>">
								<%= Constants.LABEL_DOWNLOAD %>
							</button>
							<button type="submit" name="<%= Constants.KEY_TASK_ID %>"
							value="${task.id}" formaction="<c:url 
							value="<%= Constants.JUMP_CONTROLLER_TASK_FILE_DELETE %>"/>">
								<%= Constants.LABEL_DELETE %>
							</button>
						</c:when>
						<c:otherwise>
							<button type="submit" name="<%= Constants.KEY_TASK_ID %>" 
							value="${task.id}" formaction="<c:url 
							value="<%= Constants.JUMP_CONTROLLER_TASK_FILE_ATTACH %>"/>">
								<%= Constants.LABEL_ATTACH %>
							</button>
						</c:otherwise>
					</c:choose>
				</td>
				</tr>
			</c:forEach>
			</table>
			<div class="btns">
			<c:if test="${taskSection.activeStatuses}">
			<button type="submit" name="<%= Constants.KEY_NEW_STATUS %>" 
			value="<%= Constants.ID_CHAR_TASK_STATUS_FIXED %>" formaction="<c:url 
			value="<%= Constants.JUMP_CONTROLLER_TASKS_CHANGE_STATUS %>"/>">
				<%= Constants.LABEL_FIX %>
			</button>
			</c:if>
			<c:if test="${taskSection.notMovedToRecycleBinStatuses}">
			<button type="submit" name="<%= Constants.KEY_NEW_STATUS %>" 
			value="<%= Constants.ID_CHAR_TASK_STATUS_MOVED_TO_RECYCLE_BIN %>" 
			formaction="<c:url 
			value="<%= Constants.JUMP_CONTROLLER_TASKS_CHANGE_STATUS %>"/>">
				<%= Constants.LABEL_MOVE_TO_RECYCLE_BIN %>
			</button>
			</c:if>
			<c:if test="${taskSection.movedToRecycleBinStatuses}">
			<button type="submit" name="<%= Constants.KEY_NEW_STATUS %>" 
			value="<%= Constants.ID_CHAR_TASK_STATUS_ACTIVE %>" formaction="<c:url 
			value="<%= Constants.JUMP_CONTROLLER_TASKS_CHANGE_STATUS %>"/>">
				<%= Constants.LABEL_RESTORE %>
			</button>
			<button type="submit" name="<%= Constants.KEY_DELETE %>" 
			value="<%= Constants.VALUE_SELECTED %>" formaction="<c:url 
			value="<%= Constants.JUMP_CONTROLLER_TASKS_DELETE %>"/>">
			<%= Constants.LABEL_DELETE %>
			</button>
			<button type="submit" name="<%= Constants.KEY_DELETE %>" 
			value="<%= Constants.VALUE_ALL %>" formaction="<c:url 
			value="<%= Constants.JUMP_CONTROLLER_TASKS_DELETE %>"/>">
			<%= Constants.LABEL_DELETE_ALL %>
			</button>
			</c:if>
			</div>
			</form>
		</c:otherwise>
	</c:choose>
	<c:if test="${taskSection.activeStatuses}">
		<a class="left" href="<c:url value="<%= Constants.JUMP_CONTROLLER_TASK_ADD %>"/>">
			<%= Constants.LABEL_ADD %></a>		
	</c:if>
	</div>
</section>

<%@ include file="/footer.jsp" %>
</body>
</html>