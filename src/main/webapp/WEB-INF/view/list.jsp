    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%--
      Created by IntelliJ IDEA.
      User: j
      Date: 2016/9/28
      Time: 10:22
      To change this template use File | Settings | File Templates.
    --%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
        <title>list</title>
        <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <script src="/bootstrap/js/jquery.min.js"></script>
        <script src="/bootstrap/js/bootstrap.min.js"></script>
        <style>
            .w{
                width: 600px;
                margin-left: auto;
                margin-right: auto;
            }

        </style>
    </head>
    <body>
    <table class="table table-hover w">
        <thead>
        <tr>
            <td>#</td>
            <td>用户名</td>
            <td>密码</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${adminList}" var="sl" varStatus="s">
            <tr>
                <td>${s.index+1}</td>
                <td>${sl.adminname}</td>
                <td>${sl.adminpass}</td>
                <td><a onclick="return confirm('确定要删除吗?')" href="<%=request.getContextPath()%>/admin/delete/${sl.id}" class="btn btn-danger">删除</a></td>
                <td><a href="<%=request.getContextPath()%>/admin/updateUI/${sl.id}" class="btn btn-info">修改</a></td>
            </tr>
        </c:forEach>
        </tbody>
        <a class="btn btn-primary" href="<%=request.getContextPath()%>/admin/addUI">添加</a>
    </table>
    </body>
    </html>
