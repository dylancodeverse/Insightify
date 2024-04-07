<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulaire Insertion de Notes</title>
</head>
<body>
    <h1>Insertion de Notes par Réponse par Personnalité</h1>
    <form method="post" action="insert_notes.jsp">
        <label for="note">Note:</label>
        <input type="text" id="note" name="note"><br>
        <label for="idReponse">ID de la Réponse:</label>
        <input type="text" id="idReponse" name="idReponse"><br>
        <label for="idPersonnalite">ID de la Personnalité:</label>
        <input type="text" id="idPersonnalite" name="idPersonnalite"><br>
        <input type="submit" value="Ajouter">
    </form>
</body>
</html>
