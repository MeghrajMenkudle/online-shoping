<div class="container">
	<div class="row">
	
		<div class="col-lg-3">
			<%@include file="./comman/sideBar.jsp"%>
		</div>
		
		<div class="col-lg-9">
			<div class="row">
				<div class="col-lg-12">
				
				<c:if test="${ isUserClickAllProducts == true }">
				
					<ol class="breadcrumb">
						<li><a href="/onlineshoping/home">Home</a></li>
						<li class="active">All Products</li>
					</ol>
				</c:if>
				
				<c:if test="${ isUserClickCategoryProducts == true }">
				
					<ol class="breadcrumb">
						<li><a href="/onlineshoping/home">Home</a></li>
						<li class="active">Category</li>
						<li class="active">${category.name}</li>
					</ol>
				</c:if>
				
				</div>
			</div>
		</div>
		
	</div>
</div>