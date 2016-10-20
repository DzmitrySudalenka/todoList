<%@ taglib uri="/jstl/core" prefix="c" %>
<c:if test="${not empty reportMessage}">
	<div class="report"><c:out value="${reportMessage}"/></div>
</c:if>