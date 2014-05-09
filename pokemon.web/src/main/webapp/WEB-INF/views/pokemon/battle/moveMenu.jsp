<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>技選択画面</title>
</head>


<body>
<h1>技</h1>

<c:url value="/move" var="url"/>
<a href="${url}"><c:out value="${output.pokemon.moves[0].name}"/></a>

<c:url value="/move" var="url"/>
<a href="${url}"><c:out value="${output.pokemon.moves[1].name}"/></a>

<c:url value="/move" var="url"/>
<a href="${url}"><c:out value="${output.pokemon.moves[2].name}"/></a>

<c:url value="/move" var="url"/>
<a href="${url}"><c:out value="${output.pokemon.moves[3].name}"/></a>

</body>

</html>
