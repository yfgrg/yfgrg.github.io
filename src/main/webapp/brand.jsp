<%--
  Created by IntelliJ IDEA.
  User: 肖扬泰
  Date: 2022/11/26
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><html>
<head>
    <title>Title</title>
</head>
<body>
<input type="button" id="add" value="新增">
<br>
<hr>
<table border="1" cellspacing="0" width="80%">
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${brandList}" var="Brand" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${Brand.brandName}</td>
            <td>${Brand.companyName}</td>
            <td>${Brand.ordered}</td>
            <td>${Brand.description}</td>
            <c:if test="${Brand.status==1}">
                <td>启用</td>
            </c:if>
            <c:if test="${Brand.status!=1}">
                <td>禁用</td>
            </c:if>
            <td><a href="/BrandDemo/selectByIdServlet?id=${Brand.id}">修改</a>
                <a href="/BrandDemo/deleteByIdServlet?id=${Brand.id}" id="delete">删除</a></td>
        </tr>
    </c:forEach>
</table>
<script>
    document.getElementById("add").onclick=function (){
        location.href="/BrandDemo/addData.jsp";
    }

</script>
</body>
</html>
