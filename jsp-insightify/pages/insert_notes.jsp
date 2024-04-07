<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="votre.package.Notesparreponseparpersonnalite" %>
<%
    try {
        String note = request.getParameter("note");
        String idPersonnalite = request.getParameter("idPersonnalite");
        String idReponse = request.getParameter("idReponse";)
        new Notesparreponseparpersonnalite().insert(idReponse, idPersonnalite, note);
        response.sendRedirect("success.jsp?message=Notes insérées avec succès");
    } catch (Exception e) {
        response.sendRedirect("error.jsp?message=Une erreur s'est produite lors de l'insertion des notes");
    }
%>
