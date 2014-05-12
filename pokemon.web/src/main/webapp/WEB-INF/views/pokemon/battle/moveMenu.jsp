<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>技選択画面</title>
</head>


<body>
<h1>技選択画面</h1>

<hr>

<p>
<c:out value="${output.enemies[0].base.name}"/>
<c:choose>
	<c:when test="${output.enemies[0].individual.sex}">♂</c:when>
	<c:when test="${!output.enemies[0].individual.sex}">♀</c:when>
	<c:otherwise>　</c:otherwise>
</c:choose> 
Lv.<c:out value="${output.enemies[0].level}"/><br>


HP　<meter value="300" max=<c:out value="${output.enemies[0].hp}"/>>
　　　　
</p>

<hr>
<p>
<c:out value="${output.pokemon.base.name}"/>
<c:choose>
	<c:when test="${output.enemies[0].individual.sex}">♂</c:when>
	<c:when test="${!output.enemies[0].individual.sex}">♀</c:when>
	<c:otherwise>　</c:otherwise>
</c:choose> 
Lv.<c:out value="${output.pokemon.level}"/><br>

<%--
c:ifタグで性別に応じて♂♀あるいは" "を表示
 --%>
HP　<meter value="300" max=<c:out value="${output.pokemon.hp}"/>>
　　　　
</p>
<p>
　　　300/<c:out value="${output.pokemon.hp}"/><br><br>
</p>

<c:url value="/move" var="url"/>
<c:forEach var="move" items="${output.pokemon.moves}" varStatus="status">
	<dt><a href="${url}"><c:out value="${move.name}"/></a></dt>
	<dd>タイプ：<c:out value="${move.type}"/></dd>
	<dd>PP　<c:out value="${move.powerPoint}"/>/<c:out value="${move.currentPoint}"/></dd></br></br>
</c:forEach>


</body>
</html>
