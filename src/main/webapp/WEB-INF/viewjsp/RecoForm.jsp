<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


새로운 신상품이 들어왔어요 :) <br> 예쁜 색상의 [[
<a
	href="<c:url value='/jsp/viewProduct.do'>
<c:param name='productNum' value='${ recoLastProduct.productNum }' />
<c:param name='product' value='${ recoLastProduct }' /></c:url>">
	<c:out value='${recoLastProduct.productName}' />
</a> ]] 입니다! 눌러서 상품을 확인해 보세요~
<br><br>
<br>

${userSession.user.userId }님과 비슷한 나이대의 ${recoAgeAge }살의 ${recoAgeName }님이 최근에 구매하신 <br> [[
<a
	href="<c:url value='/jsp/viewProduct.do'>
<c:param name='productNum' value='${ recoAgeProduct.productNum }' />
<c:param name='product' value='${ recoAgeProduct }' /></c:url>">
	<c:out value='${recoAgeProduct.productName}' />
</a> ]] 입니다! ${userSession.user.userId }님도 한번 사용해 보세요!
<br>
<br>
최근에 ${userSession.user.userId }님이 구매하신 제품들을 보고 <br> 저희가
[[ <a
	href="<c:url value='/jsp/viewProduct.do'>
<c:param name='productNum' value='${ recoBuyProduct.productNum }' />
<c:param name='product' value='${ recoBuyProduct }' /></c:url>">
	<c:out value='${recoBuyProduct.productName}' />
</a> ]] 이 제품을 추천해 드립니다 ❤︎
