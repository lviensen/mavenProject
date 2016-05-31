<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Cliente</h1>

	<form action="adicionarClientes" method="post">
		<label for="nome">Nome:</label> <input type="text" id="nome"
			name="nome" /> <br /> <label for="ruaNroComp">Rua/Nro/Complemento:</label>
		<input type="text" id="ruaNroComp" name="ruaNroComp"><br /> <label
			for="bairro">Bairro:</label> <input type="text" id="bairro"
			name="bairro" /> <br /> <label for="cidade">Cidade:</label> <input
			type="text" id="cidade" name="cidade"><br />

		<button type="submit" name="opcao" value="adicionar">ADICIONAR:</button>
	</form>
	<h2>Lista de Clientes</h2>

	<table>
		<thead>
			<tr>
				<th>Nome</th>
				<th>Rua</th>
				<th>Bairro</th>
				<th>Cidade</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="cliente" items="${clientes}">
				<tr>
					<td>${cliente.nome}</td>
					<td>${cliente.ruaNroComp}</td>
					<td>${cliente.bairro}</td>
					<td>${cliente.cidade}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</html>