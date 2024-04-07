<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="entities.Questionreponses" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Test de Personnalité</title>
</head>
<body>
    <h1>Test de Personnalité</h1>
    <form method="post" action="traitement_test.jsp">
        <% 
            // Récupérer les questions et réponses
            Questionreponses[] questionReponsesArray = new Questionreponses().select();

            // Parcourir les questions et afficher les options de réponse
            for (Questionreponses qr : questionReponsesArray) {
        %>
            <fieldset>
                <legend><%= qr.getQuestions() %></legend>
                <% 
                    // Afficher les options de réponse sous forme de boutons radio
                    for (int i = 0; i < qr.getReponsesids().length; i++) {
                %>
                    <input type="radio" id="reponse<%= i %>" name="reponse_<%= qr.getQuestionsid() %>" value="<%= qr.getReponsesids()[i] %>">
                    <label for="reponse<%= i %>"><%= qr.getReponses()[i] %></label><br>
                <% 
                    }
                %>
            </fieldset>
        <% 
            }
        %>
        <input type="submit" value="Soumettre">
    </form>
</body>
</html>
