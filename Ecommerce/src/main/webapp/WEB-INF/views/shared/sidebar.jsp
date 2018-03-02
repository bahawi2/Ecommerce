<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<H2>Shooping Online</H2>
	  <div class="list-group">
		 <c:forEach items="${categories}" var="cat">
		 	<a href=" ${contextRoot}/Ecommerce/show/category/${cat.id}/products" class="list-group-item " id="a_${cat.name}">${cat.name}</a>
		 </c:forEach>           
 	</div>
	