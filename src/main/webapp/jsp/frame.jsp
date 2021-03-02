<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/27
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/jsp/common/head.jsp"%>
<div class="right">
    <img class="wColck" src="${pageContext.request.contextPath}/statics/images/clock.jpg" alt=""/>
    <div class="wFont">
        <h2>${userSession.userName}</h2>
        <p> 欢迎来到超市订单管理系统！</p>
    </div>
</div>
</section>
<%@ include file="/jsp/common/foot.jsp"%>
