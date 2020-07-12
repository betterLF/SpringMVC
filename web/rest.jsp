<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/12
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<body>
<a href="testREST/1001">测试get请求</a>
<br/>
<form action="testREST" method="post">
    <input type="submit" value="测试post">
</form>
<form action="testREST" method="post">
    <input type="hidden" name="_method" value="PUT"></input>
    <input type="submit" value="测试put">
</form>
<form action="testREST/1001" method="post">
    <input type="hidden" name="_method" value="DELETE"></input>
    <input type="submit" value="测试delete">
</form>

<input type="button" value="测试Ajax" onclick="test()">
<script>
    function test() {
         $.ajax({
             url:"testAjax_DELETE",
             type:"DELETE",
            data:{id:1001},
            dataType:"json",
             success:function (obj) {
                    window.alert(obj)
             }
         });
    }
</script>
</body>
</html>
