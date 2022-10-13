<%@taglib uri = "http://www.springframework.org/tags/form" prefix="frm"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>


<body>

	<h1>New Bank Customer Registration</h1>

	<frm:form method="POST" modelAttribute="bankcustomer"
		action="/addCustomer">

		<table>
			<tr>
				<td><spring:message code="lbl.firstName" text="fn" /></td>
				<td><frm:input path="firstName" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.lastName" text="ln" /></td>
				<td><frm:input path="lastName" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.email" text="eml" /></td>
				<td><frm:input path="email" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Bank Customer">
				</td>
			</tr>

		</table>

	</frm:form>

</body>




</html>