<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Person Retrieve Success Page</title>
</head>
<body> 
Person ID: <s:property value="per.id"/> <br>
Person Name: <s:property value="per.name"/> &nbsp; <s:property value="per.lastName"/> <br>
Person Address: <br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="per.address.city"/> <br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="per.address.state"/> <br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="per.address.zip"/> <br>

</body>
</html>