## index.jsp

	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>State Code</title>
	</head>
	<body>
		<h1>State Code Program - made by Ayush Wunnava</h1>
		<FORM ACTION="basic.jsp" METHOD="POST">
		    Enter State Code:
		    <BR>
		    <INPUT TYPE="TEXT" NAME="id">
		    <BR><br>
		    <INPUT TYPE="SUBMIT" value="Submit">
		</FORM>
	</body>
	</html>

## basic.jsp

	<%@ page import="java.sql.*" %>
	<%Class.forName("com.mysql.cj.jdbc.Driver");%>
	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Output</title>
	</head>
	<body>
		<% 
				String dbURL = "jdbc:mysql://localhost:3306/labfat";
				String username = "root";
				String password = "ayush";       	


				Connection connection = DriverManager.getConnection(dbURL,username,password);

		    Statement statement = connection.createStatement();

		    String id = request.getParameter("id");  

		    ResultSet resultset = 
			statement.executeQuery("select * from State where state_code = '" + id + "'") ; 

		    if(!resultset.next()) {
			out.println("Sorry, could not find that publisher. ");
		    } else {
		%>

		<TABLE BORDER="1">
		    <TR>


		       <TH>Capital</TH>
		   </TR>
		   <TR>
		       <TD> <%= resultset.getString(1) %> </TD>


		   </TR>
	       </TABLE>
	</body>
	</html>
