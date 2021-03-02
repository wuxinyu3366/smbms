<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/29
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/common/head.jsp"%>
<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>用户管理页面 >> 用户信息查看页面</span>
    </div>
    <div class="providerView">
        <p><strong>用户编号：</strong><span>${user.userCode }</span></p>
        <p><strong>用户名称：</strong><span>${user.userName }</span></p>
        <p><strong>用户性别：</strong>
            <span>
            		<c:if test="${user.gender == 1 }">男</c:if>
					<c:if test="${user.gender == 2 }">女</c:if>
				</span>
        </p>
        <p><strong>出生日期：</strong><span>${user.birthday }</span></p>
        <p><strong>用户电话：</strong><span>${user.phone }</span></p>
        <p><strong>用户地址：</strong><span>${user.address }</span></p>
        <p><strong>用户角色：</strong><span>${user.userRoleName}</span></p>
        <div class="providerAddBtn">
            <input type="button" id="back" name="back" value="返回" >
        </div>
    </div>
</div>
</section>
<%@include file="/jsp/common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/userview.js"></script>
