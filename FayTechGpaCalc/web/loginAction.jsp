<%-- 
    Document   : loginAction
    Created on : Aug 7, 2022, 10:48:51 AM
    Author     : oreng
--%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.util.Properties"%>
<%@page import="java.util.ResourceBundle"%>
<%@ page  import="java.sql.*" %>
<%@ page import="java.util.List" %>
 <%@page import="Calculate.ReadSQL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    ReadSQL sqlRead = new ReadSQL();
    String userName = request.getParameter("username");
    String password = request.getParameter("password");
    //HashSHA512Encryption hash = new  HashSHA512Encryption(); 
    if(userName == null || password == null)
    {
        response.sendRedirect("error.jsp");
    }
    
else
{
   // hash.setHashText(password); @page import ="HashEncryption.HashSHA512Encryption"
    //password = hash.getHashText( );
    //Make changes to the connection string(database name, user/password)
    //Make changes to the String query(change table name)
    try{
            Properties props = new Properties();
            FileInputStream in = new FileInputStream("C:\\Users\\oreng\\OneDrive\\Desktop\\config.properties");
            props.load(in);
            in.close();

            String driver = props.getProperty("jdbc.driver");
            if (driver != null) {
                Class.forName(driver) ;
            }

            String url = props.getProperty("jdbc.url");
            String username = props.getProperty("jdbc.username");
            String password1 = props.getProperty("jdbc.password");

        Connection con = DriverManager.getConnection(url, username, password1);
        Class.forName("com.mysql.jdbc.Driver");
       //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Ant2014##");
       // sqlRead.ReadSQL();
        //Connection con = sqlRead.getConnections();
      
        
        String query = "select * From student where username=? && password=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,userName );
        ps.setString(2,password );    
        ResultSet rs = ps.executeQuery();    
        if (rs.next()){
        session.setAttribute("UserID", userName);
        response.sendRedirect("studentDashboard.html");              
    }
    else{
         response.sendRedirect("error.jsp");
    }
    ps.close();
    rs.close();
    con.close();
    }catch(Exception e)
    {     
        out.println(e); 
    } 
    
    
}
%> 
 
