<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulaire Insertion de Personnalités</title>
</head>
<body>
    <h1>Insertion de Personnalités</h1>
    <% if (request.getParameter("error") != null) { %>
        <p style="color: red;"><%= request.getParameter("error") %></p>
    <% } else if (request.getParameter("success") != null) { %>
        <p style="color: green;"><%= request.getParameter("success") %></p>
    <% } %>
    <form method="post" action="insert_personnalites.jsp">
        <label for="personnalite">Personnalité:</label>
        <input type="text" id="personnalite" name="personnalite"><br>
        <input type="submit" value="Ajouter">
    </form>
</body>
</html>
