<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Deletar edição</title>
	</head>
	<body>
		<h1>Deleta edição</h1>
		<form action="DeletaEdicaoServlet" method="POST">
			<p>Id da edição:</p>
			<input id="numero" name="numero" type="number" required>
			<br/>
			<br/>
			<input type="submit" value="Enviar" name="enviar">
		</form>
	</body>
</html>