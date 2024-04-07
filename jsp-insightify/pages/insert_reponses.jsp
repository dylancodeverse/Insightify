<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="votre.package.ReponsesParQuestion" %>
<%
    try {
        String reponse = request.getParameter("reponse");
        String idQuestion = request.getParameter("idQuestion");
        new ReponsesParQuestion().insert(reponse, idQuestion);
        response.sendRedirect("success.jsp?message=Réponse insérée avec succès");
    } catch (Exception e) {
        response.sendRedirect("error.jsp?message=Une erreur s'est produite lors de l'insertion de la réponse");
    }
%>
