<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Select</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<s:include value="header.jsp" />
	<br>

	<%-- 	<s:select label="Lista de Guias" --%>
	<%--        name="listaGuias" --%>
	<%--        headerKey="-1" headerValue="Lista de Guias" --%>
	<%--        list="%{listaGuias}" --%>
	<%-- /> --%>
	<h4>UPDATE REALIZADO COM SUCESSO:</h4>
	<s:form action="index.jsp">
		<s:submit value="VOLTAR"/>
	</s:form>

	<s:include value="footer.jsp" />
</body>
</html>