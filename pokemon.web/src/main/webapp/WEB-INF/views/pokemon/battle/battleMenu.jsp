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

<c:out value="${output.pokemon.base.name}"/>はどうする？

<c:url value="/fight" var="url"/>
<a href="${url}">たたかう</a>

<c:url value="/pokemon" var="url"/>
<a href="${url}">ポケモン</a>

<c:url value="/bag" var="url"/>
<a href="${url}">バッグ</a>

<c:url value="/run" var="url"/>
<a href="${url}">にげる</a>

</body>

</html>
