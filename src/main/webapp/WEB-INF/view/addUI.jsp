<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2016/9/28
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addUI</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/admin/add" method="post">
    账户:<input type="text" name="adminname">
    密码:<input type="text" name="adminpass">
    <input type="submit" class="btn btn-primary" value="提交">
</form>
</body>
</html>
