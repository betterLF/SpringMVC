<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/19
  Time: 7:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>>
<html>
<head>
    <title>添加员工信息</title>
</head>
<body>
<form action="/emp" method="post">
<table>
    <tr>
        <th colspan="2">添加员工信息</th>
    </tr>
    <tr>
        <td>LASTNAME</td>
        <td>
            <input type="text" name="lastName"/>
        </td>
    </tr>
    <tr>
        <td>EMAIL</td>
        <td>
            <input type="text" name="email"/>
        </td>
    </tr>
    <tr>
        <td>GENDER</td>
        <td>
            <input type="radio" name="gender" value="1"/>男
            <input type="radio" name="gender" value="0"/>女
        </td>
    </tr>
    <tr>
        <td>DEPARTMENT</td>
        <td>
            <select name="department.id">
                <option>-SELECT DEPARTMENT-</option>
                <c:forEach items="${departments}" var="department">
                    <option value="${department.id}">${department.departmentName}</option>
                </c:forEach>
            </select>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" VALUE="ADD"/>
        </td>
    </tr>
</table>
</form>
</body>
</html>
