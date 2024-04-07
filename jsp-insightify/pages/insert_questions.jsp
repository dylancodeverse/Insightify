<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="votre.package.Questions" %>
<%
    try {
        String question = request.getParameter("question");
        new Questions().insert(question);
        response.sendRedirect("success.jsp?message=Question insérée avec succès");
    } catch (Exception e) {
        response.sendRedirect("error.jsp?message=Une erreur s'est produite lors de l'insertion de la question");
    }
%>
