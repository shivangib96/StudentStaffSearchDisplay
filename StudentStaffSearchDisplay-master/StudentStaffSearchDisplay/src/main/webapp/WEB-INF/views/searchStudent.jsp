<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<h1> Student Records</h1>

Display student

<form action="getdata">
<select name="std">
<option>primary</option>
<option>secondary </option>
<option>higher </option>
</select>


<input type="submit">

</form>
</body>
</html>
