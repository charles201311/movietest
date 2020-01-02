<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>电影列表</title>

<link rel="stylesheet" href="/resource/css/index_work.css">

<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript">

var orderMethod ='${movieVO.orderMethod=="asc"?"desc":"asc"}';

function myOrder(orderColumn){
	location.href="/selects?orderColumn="+orderColumn+"&orderMethod="+orderMethod+"&"+$("#form1").serialize()
}
</script>



</head>
<body>
 <form action="/selects" method="post" id="form1">
  电影名称:<input type="text" name="name" value="${movieVO.name }">
  导演::<input type="text" name="actor"  value="${movieVO.actor}">
 年代:<input type="text" name="year">
  上映时间:<input type="text" name="uptimeStart">--<input type="text" name="uptimeEnd">
 <br>
   价格:<input type="text" name="priceStart">--<input type="text" name="priceEnd">
   电影时长:<input type="text" name="longtimeStart">--<input type="text" name="longtimeEnd">
 <input type="submit" value="查询">
 
 </form>



	<table>
		<tr>
			<td>电影名称</td>
			<td>导演</td>
			<td> <a href="javascript:myOrder('price')">价格</a></td>
			<td><a href="javascript:myOrder('uptime')">上映时间</a></td>
			<td><a href="javascript:myOrder('longtime')">时长</a></td>
			<td>年代</td>
			<td>区域</td>
			<td>状态</td>

		</tr>
		<c:forEach items="${movies }" var="m">
			<tr>
				<td>${m.name }</td>
				<td>${m.actor }</td>
				<td>${m.price }</td>
				<td>${m.uptime}</td>
				<td>${m.longtime }</td>
				<td>${m.year }</td>
				<td>${m.area }</td>
				<td>${m.status=="1"?"即将上映":m.status=="2"?"正在热映":"已经下架"}</td>
				
			</tr>




		</c:forEach>


	</table>
</body>
</html>