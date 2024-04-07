<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="entities.Notesparreponseparpersonnalite" %>
<%
    String errorMessage = null;
    String successMessage = null;
    try {
        String note = request.getParameter("note");
        String idPersonnalite = request.getParameter("idPersonnalite");
        String idReponse = request.getParameter("idReponse");
        new Notesparreponseparpersonnalite().insert(idReponse, idPersonnalite, note);
        successMessage = "Notes insérées avec succès";
    } catch (Exception e) {
        errorMessage = e.getMessage();
    }

    response.sendRedirect("notes.jsp" +
    (errorMessage != null ? "?error=" + java.net.URLEncoder.encode(errorMessage, "UTF-8") : "") +
    (successMessage != null ? "?success=" + java.net.URLEncoder.encode(successMessage, "UTF-8") : ""));
%>
