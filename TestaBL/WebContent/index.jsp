<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>index</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<s:include value="header.jsp" />
	<br>
	<p>Adicionar GUIA:</p>
	<s:form action="salvarGuia">
		<s:textfield name="nome" label="Nome"/>
		<s:textfield name="cpf" label="CPF"/>
		<s:submit value="SALVAR"/>
	</s:form>
	<s:form action="listarGuia">
		<s:submit value="LISTAR"/>
	</s:form>
	<br>
	<s:include value="footer.jsp" />
</body>
</html>