<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	String msg = "";
	String id = request.getParameter("userid").intern();
	if(id =="admin"){
		msg = "no";
	}
	else if(id !="admin"){
		msg = "yes";
	}
	
	if(msg.equals("")){
		msg = "error";
	}
	out.print(msg);
%>