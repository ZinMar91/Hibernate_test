<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title><s:text name="label.title"/></title>
		<s:head/>
	</head>
	<body>
	<div align="center">
		<s:form action="insert" theme="simple">
		<h2><s:text name="label.heading"/></h2>
			<table>
				<tr>
					<td><s:label key="label.name"/></td>
					<td><s:textfield name="customer.name" size="20"/></td>
					<td><s:fielderror fieldName="customer.name"/></td>
				</tr>
				<tr>
					<td><s:label key="label.address"/></td>
					<td><s:textfield name="customer.address" size="20"/></td>
					<td><s:fielderror fieldName="customer.address"/></td>
				</tr>
				<tr>
					<td><s:label key="label.creditscore"/></td>
					<td><s:textfield name="customer.creditscore" size="20"/></td>
					<td><s:fielderror fieldName="customer.creditscore"/></td>
				</tr>
				<tr>
					<td><s:label key="label.rewardpoints"/></td>
					<td><s:textfield name="customer.rewardpoints" size="20"/></td>
					<td><s:fielderror fieldName="customer.rewardpoints"/></td>
				</tr>
				<tr>
					<td colspan="2"><s:submit label="Enter"/><s:reset label="Cancel"/></td>
				</tr>
			</table>
		
		</s:form>
	</div>
	
	</body>

</html>