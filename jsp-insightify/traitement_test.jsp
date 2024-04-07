<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="entities.ResultatDuTest" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>

<%
    // Récupération des données du formulaire
    Map<Integer, Integer> noteParPersonnalite = new HashMap<>();

    // Parcourir les paramètres de la requête pour extraire les notes par personnalité
    for (String paramName : request.getParameterMap().keySet()) {
        if (paramName.startsWith("reponse_")) {
            int questionId = Integer.parseInt(paramName.substring("reponse_".length()));
            int reponseId = Integer.parseInt(request.getParameter(paramName));
            noteParPersonnalite.put(questionId, reponseId);
        }
    }

    // Création d'un tableau de chaînes pour les réponses
    String[] choixReponse = new String[noteParPersonnalite.size()];

    // Remplissage du tableau avec les réponses sous forme de chaînes
    int index = 0;
    for (Map.Entry<Integer, Integer> entry : noteParPersonnalite.entrySet()) {
        choixReponse[index] = entry.getValue().toString();
        index++;
    }

    // Création d'un objet ResultatDuTest et attribution des notes par personnalité
    ResultatDuTest rs = new ResultatDuTest();
    rs.setNoteParPersonnalite(choixReponse);

    // Redirection vers une nouvelle page pour afficher les résultats
    response.sendRedirect("resultat.jsp?personnalite=" + rs.getPersonnaliteLePlusProbable() + "&note=" + rs.getNotePersonnaliteLePlusProbable());
%>
