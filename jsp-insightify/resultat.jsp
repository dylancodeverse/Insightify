<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="entities.ResultatDuTest" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Résultat du Test de Personnalité</title>
</head>
<body>
    <h1>Résultat du Test de Personnalité</h1>
    <% 
        // Récupération des paramètres de la requête
        String personnalite = request.getParameter("personnalite");
        double note = Double.parseDouble(request.getParameter("note"));
    %>
    <p>Personnalité la plus probable : <%= personnalite %></p>
    <p>Note : <%= note %> / 100</p>
</body>
</html>
