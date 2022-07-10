<%-- 
    Document   : GPASubmitAction
    Created on : Jul 3, 2022, 5:39:35 PM
    Author     : oreng
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="Calculate.GPACalculator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        
        GPACalculator gpaCal = new GPACalculator();
        DecimalFormat df = new DecimalFormat("0.00");
        double credits = 0.0;
        double points = 0.0;
        double gpaScore = 0;
        String getGPAScore = request.getParameter("gpaScore");        
        
        double letter1 = Double.parseDouble(request.getParameter("row1Letter"));
        double letter2 = Double.parseDouble(request.getParameter("row2Letter"));
        double letter3 = Double.parseDouble(request.getParameter("row3Letter"));
        double letter4 = Double.parseDouble(request.getParameter("row4Letter"));
        double letter5 = Double.parseDouble(request.getParameter("row5Letter"));
        double letter6 = Double.parseDouble(request.getParameter("row6Letter"));
        double letter7 = Double.parseDouble(request.getParameter("row7Letter"));
        double letter8 = Double.parseDouble(request.getParameter("row8Letter"));
        
        double credit1 = Double.parseDouble(request.getParameter("row1Credits"));
        double credit2 = Double.parseDouble(request.getParameter("row2Credits"));
        double credit3 = Double.parseDouble(request.getParameter("row3Credits"));
        double credit4 = Double.parseDouble(request.getParameter("row4Credits"));
        double credit5 = Double.parseDouble(request.getParameter("row5Credits"));
        double credit6 = Double.parseDouble(request.getParameter("row6Credits"));
        double credit7 = Double.parseDouble(request.getParameter("row7Credits"));
        double credit8 = Double.parseDouble(request.getParameter("row8Credits"));
        
        points+=  letter1 * credit1;        
        points+= letter2 * credit2;
        points+=  letter3 * credit3;        
        points+= letter4 * credit4;
        points+=  letter5 * credit5;        
        points+= letter6 * credit6;
        points+=  letter7 * credit7;        
        points+= letter8 * credit8;
        credits += credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8;
        
         
        
        double gpaTotal = points/credits;
        gpaCal.SetGPA(gpaTotal);
        request.setAttribute("sum",df.format(gpaCal.GetGPA())); // It'll be available as ${sum}.
        request.getRequestDispatcher("calculatorPage.jsp").forward(request, response); 
                         
         
         

         
         
        //<%session.setAttribute(df.format(gpaCal.GetGPA()),getGPAScore);
         
        
        
        
    %>
    <input class="gpa-input" type="text" name="gpa" value="<%gpaCal.GetGPA();%>">
    
    <%response.sendRedirect("calculatorPage.jsp"); %>%>
</html>

 