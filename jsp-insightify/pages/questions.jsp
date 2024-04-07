<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulaire Insertion de Questions</title>
</head>
<body>
    <h1>Insertion de Questions</h1>
    <form method="post" action="insert_questions.jsp">
        <label for="question">Question:</label>
        <input type="text" id="question" name="question"><br>
        <input type="submit" value="Ajouter">
    </form>
</body>
</html>
