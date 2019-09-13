<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/6
  Time: 20:10
  note: 使用bootstrap输出后台返回的requestScope对象
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>管理员列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    IWPS <small>管理员</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <ul class="nav nav-tabs">
                <li class="active"><a href="<%=appPath%>/administrators/list">首页</a></li>
                <li><a href="<%=appPath%>/administrators/detail/1000">管理员具体信息</a></li>
                <li><a href="<%=appPath%>/add.jsp">添加管理员信息</a></li>
                <li class="disabled"><a href="#">信息</a></li>
            </ul>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>管理员列表 <small>显示当前管理员信息</small></h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>管理员编号</th>
                    <th>管理员名字</th>
                    <th>管理员头像</th>
                    <th>所属游泳馆</th>
                    <th>密码</th>
                    <th>信息</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="administrators" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${administrators.administratorId}</td>
                        <td>${administrators.name}</td>
                        <td>${administrators.avatar}</td>
                        <td>${administrators.swimmingPoolId}</td>
                        <td>${administrators.password}</td>
                        <td>${administrators.detail}</td>
                        <td>
                            <a href="<%=appPath%>/administrators/detail/${administrators.administratorId}">详情</a> |
                            <a href="<%=appPath%>/administrators/del/${administrators.administratorId}">删除</a>
                        </td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="https://code.jquery.com/jquery.js"></script>
</body>
</html>