<html>  
<body>  
<%   
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
session.setAttribute("user",name);  
%>  
<a href="second.jsp">Click Here</a>  
</body>  
</html> 