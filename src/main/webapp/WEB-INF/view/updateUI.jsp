<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2016/10/8
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="/bootstrap/js/jquery.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<html>
<head>
    <title>update</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/admin/update" method="post" >
        id:<input type="text" name="id">
        用户名:<input type="text" name="adminname">
        密码:<input type="text" name="adminpass">
        <input type="submit" class="btn btn-primary" value="提交"/>
    </form>
</body>
</html>
