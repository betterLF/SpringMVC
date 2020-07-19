<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/19
  Time: 8:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>>
<html>
<head>
    <title>修改员工信息</title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/emp" method="post">
    <input type="hidden" name="id" value="${employee.id}"/>
    <input type="hidden" name="_method" value="put"/>
    <table>
        <tr>
            <th colspan="2">添加员工信息</th>
        </tr>
        <tr>
            <td>LASTNAME</td>
            <td>
                <input type="text" name="lastName" value="${employee.lastName}"/>
            </td>
        </tr>
        <tr>
            <td>EMAIL</td>
            <td>
                <input type="text" name="email" value="${employee.email}"/>
            </td>
        </tr>
        <tr>
            <td>GENDER</td>
            <td>
                <input type="radio" name="gender" value="1"${employee.gender==1?'checked':''}/>男
<%--                <input type="radio" name="gender" value="1"<c:if test="${employee.gender==1}">checked="checked"</c:if>/>男--%>
                <input type="radio" name="gender" value="0"${employee.gender==0?'checked':''}/>女
            </td>
        </tr>
        <tr>
            <td>DEPARTMENT</td>
            <td>
                <select name="department.id">
                    <option>-SELECT DEPARTMENT-</option>
                    <c:forEach items="${departments}" var="department">
                        <option value="${department.id}" ${department.id==employee.department.id?'selected':''}>${department.departmentName}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="UPDATE"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
