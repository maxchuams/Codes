
<%@page import="src.model.Person"%>
<%
Person p = (Person)session.getAttribute("loggedInPerson");
if(p==null){
    response.sendRedirect("index.jsp");
    return;
}
%>