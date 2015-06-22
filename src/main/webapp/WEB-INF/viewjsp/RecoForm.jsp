<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
새로운 신상품이 들어왔어요 :)
<br>
예쁜 색상의 [[
<a
	href="<c:url value='/jsp/viewProduct.do'>
<c:param name='productNum' value='${ recoLastProduct.productNum }' />
<c:param name='product' value='${ recoLastProduct }' /></c:url>">
	<c:out value='${recoLastProduct.productName}' />
</a>
]] 입니다! 눌러서 상품을 확인해 보세요~
<br>
<br>
<br>

<c:if test='${empty recoAgeProduct}'>
	아직 고객님 또래의 분이 구매하신 상품이 없어요~ <br>  가장 먼저 구매해 보는건 어때요?<br>
</c:if>
<c:if test='${!empty recoAgeProduct}'><font color="#CF59FF"> 
${userSession.user.userId }</font>님과 비슷한 나이대의 <font color="#CF59FF"> ${recoAgeAge }</font>살의 <font color="#CF59FF"> ${recoAgeName }</font>님이
최근에 구매하신
<br>
[[
<a
	href="<c:url value='/jsp/viewProduct.do'>
<c:param name='productNum' value='${ recoAgeProduct.productNum }' />
<c:param name='product' value='${ recoAgeProduct }' /></c:url>">
	<c:out value='${recoAgeProduct.productName}' />
</a>
]] 입니다! <font color="#CF59FF"> ${userSession.user.userId }</font>님도 한번 사용해 보세요!
</c:if>
<br>
<br>

<c:if test='${empty recoBuyProduct}'>
	아직 저희 가게에서 물건을 구매하지 않으셨네요~ <br> 빨리 구매해 보세요~ 
</c:if>
<c:if test='${!empty recoBuyProduct}'>
최근에 <font color="#CF59FF"> ${userSession.user.userId }</font>님이
		구매하신 제품들을 보고 <br> 저희가 [[ <a
		href="<c:url value='/jsp/viewProduct.do'>
<c:param name='productNum' value='${ recoBuyProduct.productNum }' />
<c:param name='product' value='${ recoBuyProduct }' /></c:url>">
			<c:out value='${recoBuyProduct.productName}' />
	</a> ]] 이 제품을 추천해 드립니다 ❤︎
</c:if>

