<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulaire Insertion de Réponses</title>
</head>
<body>
    <h1>Insertion de Réponses par Question</h1>
    <form method="post" action="insert_reponses.jsp">
        <label for="reponse">Réponse:</label>
        <input type="text" id="reponse" name="reponse"><br>
        <label for="idQuestion">La Question:</label>
        <input type="text" id="idQuestion" name="idQuestion"><br>
        <input type="submit" value="Ajouter">
    </form>
</body>
</html>
