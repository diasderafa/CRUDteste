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
	<p>GUIAS DISPONÍVEIS</p>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NOME</th>
				<th>CPF</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="listaGuias">
				<tr>
					<td><s:property value="getId()" /></td>
					<td><s:property value="getNome()" /></td>
					<td><s:property value="getCpf()" /></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<br>
	<p>Digite o ID do GUIA que deseja alterar:</p>
	<s:form action="mostrarGuia">
		<s:textfield name="id" label="Id" placeholder="ID" value=""/>
		<s:submit value="CONTINUAR"/>
	</s:form>
	<br>
	<p>Digite o ID do GUIA que deseja apagar:</p>
	<s:form action="apagarGuia">
		<s:textfield name="id" label="Id" placeholder="ID" value=""/>
		<s:submit value="APAGAR"/>
	</s:form>
	<br>
	<s:form action="index.jsp">
		<s:submit value="VOLTAR"/>
	</s:form>
	
<%-- 	<s:select label="Lista de Guias" --%>
<%--        name="listaGuias" --%>
<%--        headerKey="-1" headerValue="Lista de Guias" --%>
<%--        list="%{listaGuias}" --%>
<%-- /> --%>
	<s:include value="footer.jsp" />
</body>
</html>