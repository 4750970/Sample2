<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ポケモン選択画面</title>
</head>


<body>
<h1>ポケモン</h1>


<c:url value="/pokemon" var="url"/>
<a href="${url}">（ポケモン1）</a>

<c:url value="/pokemon" var="url"/>
<a href="${url}">（ポケモン2）</a>

<c:url value="/pokemon" var="url"/>
<a href="${url}">（ポケモン3）</a>

<c:url value="/pokemon" var="url"/>
<a href="${url}">（ポケモン4）</a>

<c:url value="/pokemon" var="url"/>
<a href="${url}">（ポケモン5）</a>

<c:url value="/pokemon" var="url"/>
<a href="${url}">（ポケモン6）</a>

</body>

</html>
