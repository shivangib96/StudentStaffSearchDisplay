<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<h1> School Record</h1>
<form action="display">

<select name="opt">
<option>staff </option>
<option>student </option>
</select>

<!-- 
Student Id : <input type="text" name="studentId">


Staff Id : <input type="text" name="staffId">
 -->
<input type="submit">

</form>
</body>
</html>
