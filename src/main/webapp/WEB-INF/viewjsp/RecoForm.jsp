<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<c:forEach var="product" items="${ productAll.pageList }">
	<a href="<c:url value='/jsp/viewProduct.do'>
	<c:param name='productNum' value='${ product.productNum }' />
	<c:param name='product' value='${ product }' /></c:url>">
		<c:out value='${ product.productName }' />
	</a>
	<br>
</c:forEach>


신상품 추천 :
<a
	href="<c:url value='/jsp/viewProduct.do'>
<c:param name='productNum' value='${ recoLastProduct.productNum }' />
<c:param name='product' value='${ recoLastProduct }' /></c:url>">
	<c:out value='${recoLastProduct.productName}' />
</a>
<br>
<br>
나이대 추천 :
<a
	href="<c:url value='/jsp/viewProduct.do'>
<c:param name='productNum' value='${ recoLastProduct.productNum }' />
<c:param name='product' value='${ recoLastProduct }' /></c:url>">
	<c:out value='${recoLastProduct.productName}' />
</a>
<br>
<br>
구매목록 기반 추천 :
<a
	href="<c:url value='/jsp/viewProduct.do'>
<c:param name='productNum' value='${ recoLastProduct.productNum }' />
<c:param name='product' value='${ recoLastProduct }' /></c:url>">
	<c:out value='${recoLastProduct.productName}' />
</a>
