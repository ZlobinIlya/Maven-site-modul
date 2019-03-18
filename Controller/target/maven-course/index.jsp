<%@page import="com.epam.dao.Dao"%>
<html>
<body>
<h2>Hello World!</h2>
 
<%
 
int a = 100;
int b = 200;
Dao dao  = new Dao(); 
 
int s = dao.fullAnswer(a, b);

 
out.println("<h2>"+ s+"</h2>");
 
%>
 
</body>
</html>
