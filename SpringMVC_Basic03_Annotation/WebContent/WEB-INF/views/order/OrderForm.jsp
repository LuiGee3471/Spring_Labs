<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 화면</title>
</head>
<body>
  <form method="post">
    상품1<br>
    상품ID: <input type="text" name="orderItems[0].itemId"> <br>
    상품수량: <input type="text" name="orderItems[0].number"> <br>
    상품주의사항: <input type="text" name="orderItems[0].remark"> <br>
    <hr>
    상품2<br>
    상품ID: <input type="text" name="orderItems[1].itemId"> <br>
    상품수량: <input type="text" name="orderItems[1].number"> <br>
    상품주의사항: <input type="text" name="orderItems[1].remark"> <br>
    <hr>
    상품3<br>
    상품ID: <input type="text" name="orderItems[2].itemId"> <br>
    상품수량: <input type="text" name="orderItems[2].number"> <br>
    상품주의사항: <input type="text" name="orderItems[2].remark"> <br>
    <hr>
    <input type="submit" value="전송">
  </form>
</body>
</html>