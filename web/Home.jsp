
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <article >     
             <p>
                <c:if test="${empty airlinearray}">
                    <c:redirect url="AirlineServlet"/>
                 </c:if>
             </p>
            <div>
            <table  border="2">
                <th>Departure</th>
                <th>Destination</th>
                <th>Date</th>
                
               
                <c:forEach var="airlines" items="${airlinearray.airlines}">
                <tr>
                    <td>
                        ${airlines.departure}
                    </td>
                    <td>
                        ${airlines.destination}
                    </td>
                    <td> 
                        ${airlines.date}
                    </td>
                    
                </tr>
                </c:forEach>
                <table>
            </div>
        </article>
    </body>
</html>
