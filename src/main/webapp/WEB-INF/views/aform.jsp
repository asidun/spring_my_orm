<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
	<h2>Do you like a newsletter?</h2>
 
	<form:form method="POST" action="aform" commandName="personForm">
		<table>
			<tr>
				<td><form:label path="userName" >Name :</form:label></td>
				<td><form:input path="userName" />
				</td>
				<form:errors path="userName" cssStyle="color:red"/>
				<td>
				</td>
			</tr>
			<tr>
				<td><form:label path="address" >Address :</form:label></td>
				<td><form:textarea path="address" />
				</td>
				<td>
				<form:errors path="address" cssStyle="color:red"/>
				</td>
			</tr>
			<tr>
				<td><form:label path="youLikeNewsletter" >Do you like a newsletter? :</form:label></td>
				<td><form:checkbox path="youLikeNewsletter" value="true" />
				</td>
				<td>
				</td>
			</tr>
			<tr>
				<td><form:label path="sex" >Sex :</form:label></td>
				<td><form:radiobutton path="sex" value="M" />Male 
                                       <form:radiobutton path="sex" value="F" />Female</td>
				<td>
				</td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
 
</body>
</html>