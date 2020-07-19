<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/19
  Time: 8:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>编辑员工信息</title>
</head>
<body>
<!--modelAttribute:自定义回显对象的属性名 -->
<form:form action="${pageContext.servletContext.contextPath}/emp" method="post" modelAttribute="employee">
    <c:if test="${empty employee.id}" var="flag"></c:if>
    <c:if test="${!flag}">
        <form:hidden path="id"></form:hidden>
        <input type="hidden" name="_method" value="PUT">
    </c:if>
    <table>
        <tr>
            <th colspan="2">
                <c:if test="${flag}">添加员工信息</c:if>
                <c:if test="${!flag}">修改员工信息</c:if>
            </th>
        </tr>
        <tr>
            <td>LASTNAME</td>
            <td>
                <form:input path="lastName"/>
            </td>
        </tr>
        <tr>
            <td>EMAIL</td>
            <td>
                <form:input path="email"/>
            </td>
        </tr>
        <tr>
            <td>GENDER</td>
            <td>
                <%%>
                <form:radiobuttons path="gender" items="${genders}"/>
            </td>
        </tr>
        <tr>
            <td>DEPARTMENT</td>
            <td>
                <form:select path="department.id" items="${departments}" itemLabel="departmentName" itemValue="id"></form:select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${flag}">
                    <input type="submit" VALUE="ADD"/>
                </c:if>
                <c:if test="${!flag}">
                    <input type="submit" VALUE="UPDATE"/>
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
