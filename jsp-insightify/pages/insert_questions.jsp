<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="entities.Questions" %>
<%
    String errorMessage = null;
    String successMessage = null;
    try {
        String question = request.getParameter("question");
        new Questions().insert(question);
        successMessage = "Question insérée avec succès";
    } catch (Exception e) {
        errorMessage = e.getMessage();
    }

    response.sendRedirect("questions.jsp" +
    (errorMessage != null ? "?error=" + java.net.URLEncoder.encode(errorMessage, "UTF-8") : "") +
    (successMessage != null ? "?success=" + java.net.URLEncoder.encode(successMessage, "UTF-8") : ""));
%>
