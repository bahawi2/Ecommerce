<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div class="container">

	<div class="row">
		<div class="col-md-3">
		  <%@include file="./shared/sidebar.jsp"%>
		</div>
		<div class="col-md-9">
		
			<div class="row">
				
				<div class="col-lg-12">
					<c:if test="${userClickallproducts == true }">
							<!--  <ol class="breadcrumb">
								<li><a href="${contextRoot}/Ecommerce/home">Home</a></li>
								<li class="active">allproducts</li>
							</ol> -->
							<nav aria-label="breadcrumb">
								  <ol class="breadcrumb">
								    <li class="breadcrumb-item"><a href="${contextRoot}/Ecommerce/home">Home</a></li>
								    <li class="breadcrumb-item active" aria-current="page">allproducts</li>
								  </ol>
							</nav>
												</c:if>
					<c:if test="${userClickcategoryproducts == true }">
							<!--  <ol class="breadcrumb">
								<li><a href="${contextRoot}/Ecommerce/home">Home</a></li>
								<li class="active">Category</li>
								<li class="active">${category.name}</li>
							</ol>  -->
							<nav aria-label="breadcrumb">
							  <ol class="breadcrumb">
							    <li class="breadcrumb-item"><a href="${contextRoot}/Ecommerce/home">Home</a></li>
							    <li class="breadcrumb-item">Category</li>
							    <li class="breadcrumb-item active" aria-current="page">${category.name}</li>
							  </ol>
							</nav>
					</c:if>
				
				</div>
		</div>
		
	</div>
		
	</div>

</div>