<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Criar evento</title>
	</head>
	<body>
		<h1>Criar evento</h1>
		<form action="CriaEventoServlet" method="POST">
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