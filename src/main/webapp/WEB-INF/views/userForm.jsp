<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BookManager</title>
<style type="text/css">
fieldset {
	border: 1px solid #dedede;
}

legend {
	font-size: 20px;
	text-transform: uppercase;
}

.error {
	color: red;
}

.resltTable {
	width: 50%;
	border-collapse: collapse;
	border-spacing: 0px;
}

.resltTable td, .resltTable th {
	border: 1px solid #565454;
}
</style>
</head>
<body>
  <fieldset>
    <legend>User Input From</legend>
    <form:form action="saveUser" method="post" modelAttribute="user">
      <table>
        <tr>
          <th>Name</th>
          <td>
            <form:input path="username" /> 
            <form:errors path="username" cssClass="error" />
          </td>
          <th>PASSWORD</th>
          <td>
            <form:input path="password" /> 
            <form:errors path="password" cssClass="error" />
          </td>
          <td><button type="submit">Submit</button></td>
        </tr>
      </table>
    </form:form>
  </fieldset>
  <br>
  <br>

  <fieldset>
    <legend>Users List</legend>
    <table class="resltTable">
      <tr>
        <th>UserName</th>
        <th>Password</th>
      </tr>
      <c:forEach items="${users}" var="user">
        <tr>
          <td>${user.username}</td>
          <td>${user.password}</td>
        </tr>
      </c:forEach>

    </table>
  </fieldset>

</body>
</html>