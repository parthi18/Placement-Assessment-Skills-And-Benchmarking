<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>parthiban is a hero...</h1>
<form action="AddQuestion">
<input type="text" name="question"/>
<input type="text" name="choice1"/>
<input type="text" name="choice2"/>

<input type="Submit" name="Submit">


<table th:if="${ not #lists.isEmpty(questions) }" border=1>
        <tr>
            <td></td>
            <td>Password</td>
            <td>Email</td>
            <td>Title</td>
            <td>Sex</td>
            <td>Salary</td>
            <td>Age</td>
        </tr>
        <tr th:each="question : ${questions}">
            <td th:text="${question.choice1}"></td>
   <td th:text="${question.choice2}"></td>        
</tr>
    </table>
</form> 
</body>
</html>










