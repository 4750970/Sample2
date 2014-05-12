<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>コマンド選択画面</title>
</head>


<body>
<h1>コマンド選択</h1>
<hr>
<p>
<c:out value="${output.enemies[0].base.name}"/>
<c:choose>
	<c:when test="${output.enemies[0].individual.sex}">♂</c:when>
	<c:when test="${!output.enemies[0].individual.sex}">♀</c:when>
	<c:otherwise>　</c:otherwise>
</c:choose> 
Lv.<c:out value="${output.enemies[0].level}"/><br>
HP　<meter value="300" max=<c:out value="${output.enemies[0].hp}"/>></p>



<hr>
<p>
<c:out value="${output.party[0].base.name}"/>
<c:choose>
	<c:when test="${output.enemies[0].individual.sex}">♂</c:when>
	<c:when test="${!output.enemies[0].individual.sex}">♀</c:when>
	<c:otherwise>　</c:otherwise>
</c:choose> 
Lv.<c:out value="${output.party[0].level}"/><br>

<%--
c:ifタグで性別に応じて♂♀あるいは" "を表示
 --%>
HP　<meter value="300" max=<c:out value="${output.party[0].hp}"/>>
　　　　
</p>
<p>
　　　300/<c:out value="${output.party[0].hp}"/><br>
</p>

<c:out value="${output.party[0].base.name}"/>はどうする？<br><br>

<c:url value="/fight" var="url"/>
<a href="${url}">たたかう</a><br>

<c:url value="/pokemon" var="url"/>
<a href="${url}">ポケモン</a><br>

<c:url value="/bag" var="url"/>
<a href="${url}">バッグ</a><br>

<c:url value="/run" var="url"/>
<a href="${url}">にげる</a><br>

</body>

</html>
