<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	String sign = "";
	String user = request.getParameter("userid");
	if(user.equals("admin")){
		sign = "no";
	}
	else{
		sign = "yes";
	}
	out.print(sign);
%>