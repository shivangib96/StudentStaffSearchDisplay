<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<h1> Staff Records</h1>

Search staff

<form action="searchStaff">
Exp :<input type="number" name="exp">
Sal :<input type="text" name="salary">


Qul:
<select name="qul">
<option>B.Sc </option>
<option>M.Sc </option>
<option>M.Tech </option>
<option>B.Tech </option>
</select>


Desig:
<select name="designation">
<option>TGT </option>
<option>Sales Manager </option>
<option>Accountant </option>
<option>Office Boy </option>
</select>

<input type="submit" value="search">
</form>
</body>
</html>
