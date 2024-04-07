<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="entities.ReponsesParQuestion" %>
<%@ page import="entities.Personnalite" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulaire Insertion de Notes</title>
</head>
<body>
    <h1>Insertion de Notes par Réponse par Personnalité</h1>
    <% if (request.getParameter("error") != null) { %>
        <p style="color: red;"><%= request.getParameter("error") %></p>
    <% } else if (request.getParameter("success") != null) { %>
        <p style="color: green;"><%= request.getParameter("success") %></p>
    <% } %>

    
    <form method="post" action="insert_notes.jsp">
        <label for="note">Note:</label>
        <input type="text" id="note" name="note"><br>
        
        <label for="idReponse">Réponse:</label>
        <select id="idReponse" name="idReponse">
            <% for (ReponsesParQuestion reponse : new ReponsesParQuestion().select()) { %>
                <option value="<%= reponse.getId() %>"><%= reponse.getReponses() %></option>
            <% } %>
        </select><br>
        
        <label for="idPersonnalite">Personnalité:</label>
        <select id="idPersonnalite" name="idPersonnalite">
            <% for (Personnalite personnalite : new Personnalite().select()) { %>
                <option value="<%= personnalite.getId() %>"><%= personnalite.getPersonnalite() %></option>
            <% } %>
        </select><br>
        
        <input type="submit" value="Ajouter">
    </form>
</body>
</html>
