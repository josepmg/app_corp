<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Buscar edição</title>
	</head>
	<body>
		<h1>Busca edição</h1>
		<h2>Busca por id</h2>
		<form action="BuscaEdicaoPorIdServelet" method="POST">
			<p>Id da edição:</p>
			<input id="edicaoId" name="edicaoId" type="number" required>
			<br/>
			<br/>
			<input type="submit" value="Enviar" name="enviar">
		</form>
	</body>
</html>