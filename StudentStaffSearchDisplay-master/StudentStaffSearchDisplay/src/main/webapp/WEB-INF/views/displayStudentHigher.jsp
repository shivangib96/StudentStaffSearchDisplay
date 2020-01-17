<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<h1> Student Records</h1>

Displaying HIGHER
<table border="2">
		<tr><th>Student_Id<TH>TamilMark<TH>PhysicsMark<TH>ChemistryMark<TH>ComputerMark<TH>MathsMark<TH>TotalMark<TH>AverageMark<TH>Grade</TH></tr>

<c:forEach items="${studentData}" var="student">
<tr>
<td>
${student.studentId}
</td>
<td>
${student.tamilMark}
</td>
<td>
${student.physicsMark}
</td>
<td>
${student.chemistryMark}
</td>
<td>
${student.computerMark}
</td>
<td>
${student.mathsMark}
</td>
<td>
${student.totalMark}
</td>
<td>
${student.averageMark}
</td>
<td>
${student.grade}
</td>
</c:forEach>

</table>
</body>
</html>