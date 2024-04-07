<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="entities.Questions" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulaire Insertion de Réponses</title>
</head>
<body>
    <h1>Insertion de Réponses par Question</h1>
    <% if (request.getParameter("error") != null) { %>
        <p style="color: red;"><%= request.getParameter("error") %></p>
    <% } else if (request.getParameter("success") != null) { %>
        <p style="color: green;"><%= request.getParameter("success") %></p>
    <% } %>
    <form method="post" action="insert_reponses.jsp">

        <label for="reponse">Réponse:</label>
        <input type="text" id="reponse" name="reponse"><br>
        <label for="idQuestion">La Question:</label>
        <select id="idQuestion" name="idQuestion">
            <% for (Questions question : new Questions().select()) { %>
                <option value="<%= question.getId() %>"><%= question.getQuestions() %></option>
            <% } %>
        </select><br>
        <input type="submit" value="Ajouter">
    </form>
</body>
</html>
