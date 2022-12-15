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
	<p>Alterar GUIA:</p>
	<s:form action="alterarGuia">
		<s:textfield name="guiaConsultado.id" readonly="true" label="Id" />
		<s:textfield name="guiaConsultado.nome" label="Nome" />
		<s:textfield name="guiaConsultado.cpf" label="CPF" />
		<s:submit value="ALTERAR" />
	</s:form>
	<s:form action="listarGuia">
		<s:submit value="VOLTAR" />
	</s:form>
	<br>
	<s:include value="footer.jsp" />
</body>
</html>