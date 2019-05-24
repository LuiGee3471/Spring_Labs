<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h3>EL & JSTL 사용 출력</h3>
  <ul>
    <c:forEach var="item" items="${requestScope.orderCommand.orderItems}">
      <li>${item.itemId} / ${item.number} / ${item.remark}</li>
    </c:forEach>
  </ul>
</body>
</html>