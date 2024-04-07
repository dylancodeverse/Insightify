<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="entities.Personnalite" %>
<%
    String errorMessage = null;
    String successMessage = null;
    try {
        String personnalite = request.getParameter("personnalite");
        new Personnalite().insert(personnalite);
        successMessage = "Personnalité insérée avec succès";
    } catch (Exception e) {
        errorMessage = e.getMessage();
    }

    response.sendRedirect("personnalites.jsp" +
    (errorMessage != null ? "?error=" + java.net.URLEncoder.encode(errorMessage, "UTF-8") : "") +
    (successMessage != null ? "?success=" + java.net.URLEncoder.encode(successMessage, "UTF-8") : ""));
%>
