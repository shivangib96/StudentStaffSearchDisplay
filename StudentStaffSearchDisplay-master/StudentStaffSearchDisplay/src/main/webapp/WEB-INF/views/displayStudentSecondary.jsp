<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<h1> Student Records</h1>

Displaying SECONDARY
<table border="2">
		<tr><th>Student_Id<TH>EnglishMark<TH>HindiMark<TH>ScienceMark<TH>SocialMark<TH>MathsMark<TH>TotalMark<TH>AverageMark<TH>Grade</TH></tr>
<c:forEach items="${studentData}" var="student">
<tr>
<td>
${student.studentId}
</td>
<td>
${student.englishMark}
</td>
<td>
${student.hindiMark}
</td>
<td>
${student.scienceMark}
</td>
<td>
${student.socialMark}
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
