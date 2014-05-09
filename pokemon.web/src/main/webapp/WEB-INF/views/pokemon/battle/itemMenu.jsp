<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>アイテム選択画面</title>
</head>


<body>
<h1>バッグ</h1>

<c:url value="/item" var="url"/>
<a href="${url}">（どうぐ1）</a>

<c:url value="/item" var="url"/>
<a href="${url}">（どうぐ2）</a>

<c:url value="/item" var="url"/>
<a href="${url}">（どうぐ3）</a>

<c:url value="/item" var="url"/>
<a href="${url}">（どうぐ4）</a>

</body>

</html>
