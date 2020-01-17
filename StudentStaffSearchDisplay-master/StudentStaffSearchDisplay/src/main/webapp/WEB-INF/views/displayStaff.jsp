<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<h1> Staff Records</h1>

Displaying staff

<table border="2">
<tr><th>Staff_Id<TH>Date Of Birth<TH>Staff_Name<TH>Address<TH>CountryId<TH>Gender<TH>Salary<TH>Qualification<TH>Mail_Id<TH>ContactNo<TH>Designation<TH>YearPassedOut<TH>Experience<TH>DOJ</TH></tr>
<c:forEach items="${staffList}" var="staffInfo">
<tr>
<td>
${staffInfo.staffId}
</td>
<td>
${staffInfo.dateOfBirth}
</td>
<td>
${staffInfo.staffName}
</td>
<td>
${staffInfo.address}
</td>
<td>
${staffInfo.countryId}
</td>
<td>
${staffInfo.gender}
</td>
<td>
${staffInfo.salary}
</td>
<td>
${staffInfo.highestQualification}
</td>
<td>
${staffInfo.emailId}
</td>
<td>
${staffInfo.contactNumber}
</td>
<td>
${staffInfo.designation}
</td>
<td>
${staffInfo.yearPassedOut}
</td>
<td>
${staffInfo.experience}
</td>
<td>
${staffInfo.doj}
</td>

</c:forEach>
</body>
</html>