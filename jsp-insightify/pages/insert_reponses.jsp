<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="entities.ReponsesParQuestion" %>
<%
    String errorMessage = null;
    String successMessage = null;
    try {
        String reponse = request.getParameter("reponse");
        String idQuestion = request.getParameter("idQuestion");
        new ReponsesParQuestion().insert(reponse, idQuestion);
        successMessage = "Inserted";
    } catch (Exception e) {
        errorMessage = e.getMessage();
    }

    response.sendRedirect("reponses.jsp" +
    (errorMessage != null ? "?error=" + java.net.URLEncoder.encode(errorMessage, "UTF-8") : "") +
    (successMessage != null ? "?success=" + java.net.URLEncoder.encode(successMessage, "UTF-8") : ""));
%>
