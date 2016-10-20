<%@ taglib uri="/jstl/core" prefix="c" %>
<%@ page import="by.gsu.epamlab.Constants" %>
<header class="clearfix">
	<label>User:
		<b>
			<c:out value="${user.name}" default="guest"/>
		</b>
	</label>
	<nav class="<c:out value="${empty user ? 'left': 'right'}"/>">
		<c:choose>
			<c:when test="${empty user}">
				<a href="<c:url value="<%= Constants.JUMP_VIEW_LOGIN %>"/>">
					<%= Constants.LABEL_LOGIN %></a>
				<a href="<c:url value="<%= Constants.JUMP_VIEW_REGISTRATE %>"/>">
					<%= Constants.LABEL_REGISTRATE %></a>
			</c:when>
			<c:otherwise>
				<form class="logout" name="<%= Constants.KEY_FORM_LOGOUT %>" method="POST" 
						action="<c:url value="<%= Constants.SEND_LOGOUT %>"/>">
					<a href="javascript:document.forms['<%= Constants.KEY_FORM_LOGOUT %>
					'].submit();"><%= Constants.LABEL_LOGOUT %></a>
				</form>
			</c:otherwise>
		</c:choose>
	</nav>
</header>