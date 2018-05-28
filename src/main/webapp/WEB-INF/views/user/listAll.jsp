<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
	유저목록
	</h1>

	<P> 유저 조회  </P>
	<form method=post>
	<table class="table table-bordered">
		<tr>
			<th style="width:10px">BNO</th>
			<th>아이디</th>
			<th>이름</th>
			<th>성별</th>
			<th>도시</th>
		</tr>
	
	<c:forEach items="${list}" var="userVO">
	  <tr>
		<td><a href="/user/read?bno= ${userVO.userID}">${userVO.userID } </a></td>
		<td> ${userVO.name }</td>
		<td>${userVO.gender }</td>
		<td>${userVO.city}</td>
	  </tr>
	</c:forEach>
	</table>
	</form>
</body>
</html>