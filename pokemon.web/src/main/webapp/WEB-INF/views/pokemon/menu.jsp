<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>メニュー画面</title>
</head>


<body>
<h1>シミュレーター</h1>

	<h2>メニュー</h2>
		<h3>図鑑</h3>
		<h3><abbr title="努力値エディット">育成</abbr></h3>
		<c:url value="/battle" var="url"/>
		<h3><a href="${url}">対戦</a></h3>
		<h3>・・・・・・Under Construction</h3>
	<h2>リンク</h2>

</body>

<%--
<img src="image/155.png" alt="アイコン">

<audio src="audio/menu.m4a" autoplay>
<p>お使いのブラウザでは、audioタグをサポートしていません。</p>
</audio>
 --%>
</html>
