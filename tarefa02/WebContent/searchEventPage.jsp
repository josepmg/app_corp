<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Buscar evento</title>
	</head>
	<body>
		<h1>Busca evento</h1>
		<h2>Busca por id</h2>
		<form action="BuscaEventoPorIdServelet" method="POST">
			<p>Id do evento:</p>
			<input id="eventoId" name="eventoId" type="number" required>
			<br/>
			<br/>
			<input type="submit" value="Enviar" name="enviar">
		</form>
	</body>
</html>