<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="entities.Personnalite" %>
<%
    try {
        String personnalite = request.getParameter("personnalite");
        new Personnalite().insert(personnalite);
        response.sendRedirect("success.jsp?message=Personnalité insérée avec succès");
    } catch (Exception e) {
        response.sendRedirect("error.jsp?message=Une erreur s'est produite lors de l'insertion de la personnalité");
    }
%>
