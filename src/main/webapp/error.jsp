<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

body {
	background: url("${pageContext.request.contextPath}/statics/images/pic-error.png") 0 0 no-repeat;
	 background-position:55% -70%;
}
/* body{
	background-color: #ccc;
} */
</style>
<body>
	<!-- 使用输出全局异常信息-->
	<%-- <h1>全局异常信息：${exception.message}</h1> --%>
	<%-- 用来使用局部输出 <h1>${e}</h1> --%>
	<a href="${pageContext.request.contextPath }/login.jsp">返回</a>
</body>
</html>