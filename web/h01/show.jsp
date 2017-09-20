<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title><s:text name="label.title"/></title>
		<s:head/>
		<style type="text/css">
		@import url(h01/css/style.css);
		</style>
	</head>
	<body>
	<div align="center">
	<h2><s:text name="label.heading"/></h2>
	<hr>


	<div class="content">
	<table class="userTable" cellpadding="5px">
		<tr class="even">
			<th>Customer ID</th>
			<th>Customer Name</th>
			<th>Address</th>
			<th>Credit Score</th>
			<th>Reward Points</th>
			
		</tr>		  
		
				<tr>		
				<td><s:property value="cust.id" /></td>		
				<td><s:property value="cust.name" /></td>
				<td><s:property value="cust.address"/></td>
				<td><s:property value="cust.creditscore"/></td>
				<td><s:property value="cust.rewardpoints" /></td>				
			</tr>
		
	</table>
	</div>
	</body>
	</html>