<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Retrieve Success Page</title>
</head>
<body> 
	ID: <s:property value="result.id"/><br>
	Name: <s:property value="result.name"/><br>
	LegCount: <s:property value="result.legCount"/>
</body>
</html>