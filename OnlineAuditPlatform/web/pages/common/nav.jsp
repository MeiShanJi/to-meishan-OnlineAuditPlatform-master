<%--
  Created by IntelliJ IDEA.
  User: 白夜
  Date: 2020/10/14
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="nav" style="background-color: #c8cfc4;height: 50px; width: 1580px;margin-top: 0px">

    <!-- <img src="img/catLogo.png" alt="Log" width="80" height="40"/> -->


    <a class="nav-item index" href="index.jsp">社 区</a>
    <div class="book_cond" style="display: inline-block">
        <form action="showServlet" method="get">
            <input type="hidden" name="action" value="listByFileName">
            <input id="findByUser" type="text" placeholder="搜索文章" name="username" value="">
            <input type="submit" value="查询" />
        </form>
    </div>
    <c:if test="${empty sessionScope.user.username}">
        <a class="nav-item nav-login" href="pages/user/login.jsp">登 录</a>|
        <a class="nav-item nav-regist" href="pages/user/register.jsp">注 册</a>
    </c:if>
    <c:if test="${ not empty sessionScope.user.username}">
        <span>欢迎<span class="um_span">${sessionScope.user.username}</span></span>
        <a class="nav-item nav-manage" href="showServlet?action=listByUserManage">| 管 理</a>
        <c:if test="${sessionScope.user.admin eq 1}">
            <a class="nav-item nav-manage" href="showServlet?action=listAllManage">|管 理 员 界 面</a>
        </c:if>
<%--        <a class="nav-item nav-login" href="pages/manage/upLoad.jsp">文章发布</a>--%>
        <a class="nav-item nav-login" href="userServlet?action=logout">退 出 登 录</a>
    </c:if>

</div>
