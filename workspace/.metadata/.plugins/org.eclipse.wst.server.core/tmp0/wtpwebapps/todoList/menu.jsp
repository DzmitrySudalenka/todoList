<%@ taglib uri="/jstl/core" prefix="c" %>
<%@ page import="by.gsu.epamlab.Constants" %>
<%@ page import="by.gsu.epamlab.model.beans.TaskSection" %>
<menu>
	<c:forEach items="<%= TaskSection.values() %>" var="taskSection">
		<li>
			<a href="<c:url value="<%= Constants.JUMP_CONTROLLER_TASKS_SECTION %>"/>
					<c:out value="${taskSection.id}"/>">
				<c:out value="${taskSection.label}"/>
			</a>
		</li>
	</c:forEach>
</menu>