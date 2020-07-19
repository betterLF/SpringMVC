<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/18
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>>
<html>
<script type="text/javascript" src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<head>
    <title>展示员工信息</title>
<%--    <link rel="stylesheet" href="/css/index_like.css"/>--%>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>LASTNAME</th>
        <th>EMAIL</th>
        <th>GENDER</th>
        <th>DEPARTMENTNAME</th>
        <th>OPTIAN(<a href="emp">ADD</a>>)</th>
    </tr>
    <c:forEach items="${emps}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.lastName}</td>
            <td>${emp.email}</td>
            <td>${emp.gender==0?'女':'男'}</td>
            <td>${emp.department.departmentName}</td>
            <td>
                <a href="emp/${emp.id}">UPDATE</a>
                <a class="del" href="emp/${emp.id}">DELETE</a>
            </td>
        </tr>
    </c:forEach>
</table>
<form method="post">
    <input type="hidden" name="_method" value="DELETE"/>
</form>
</body>
<script type="text/javascript">
    $(function () {//防止页面里的元素在jquery执行之后执行
        $(".del").click(function () {
            //submit将所获得的form元素提交
            if(confirm("确认删除吗？")) {
                $("form").attr("action", this.href).submit();
            }
            return false;//将超链接的默认行为取消
        });
    });//预加载函数/文档就绪函数
</script>
</html>
