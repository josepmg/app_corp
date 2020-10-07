<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar edição</title>
	</head>
	<body>
		<h1>Edita edição</h1>
		<form action="EditaEdicaoServlet" method="POST">
			<p>Id da edição:</p>
			<input id="edicaoId" name="edicaoId" type="number" disabled="true">
			<p>Número da edição:</p>
			<input id="numero" name="numero" type="number" required>
			<p>Ano:</p>
			<input id="ano" name="ano" type="text" required>
			<p>Data de início:</p>
			<input id="dataInicio" name="dataInicio" type="date" required>
			<p>Data de fim:</p>
			<input id="dataFim" name="dataFim" type="date" required>
			<p>Cidade sede:</p>
			<input id="cidadeSede" name="cidadeSede" type="text" required>
			<p>País sede:</p>
			<input id="paisSede" name="paisSede" type="text" required>
			<p>Id do evento:</p>
			<input id="eventoId" name="eventoId" type="number" disabled="true">
			<br/>
			<br/>
			<input type="submit" value="Enviar" name="enviar">
		</form>
	</body>
</html>