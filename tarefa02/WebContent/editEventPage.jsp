<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar evento</title>
	</head>
	<body>
		<h1>Edita evento</h1>
		<form action="EditaEventoServlet" method="POST">
			<p>Id do evento:</p>
			<input id="eventoId" name="eventoId" type="number" disabled="true">
			<p>Nome do evento:</p>
			<input id="nome" name="nome" type="text" required>
			<p>Sigla:</p>
			<input id="sigla" name="sigla" type="text" required>
			<p>Área de concentração:</p>
			<input id="areaConcentracao" name="areaConcentracao" type="text" required>
			<p>Instituição organizadora:</p>
			<input id="instituicaoOrganizadora" name="instituicaoOrganizadora" type="text" required>
			<br/>
			<br/>
			<input type="submit" value="Enviar" name="enviar">
		</form>
	</body>
</html>