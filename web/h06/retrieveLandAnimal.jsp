<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Retrieve Page</title>
</head>
<body> 
 <s:form action="retrieveLandAnimal">
	<s:textfield name="no" label="Given ID to Search"/>
	<s:submit value="Search"/>
</s:form>
</body>
</html>