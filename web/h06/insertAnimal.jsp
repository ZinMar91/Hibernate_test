<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Insert Page</title>
</head>
<body> 
<s:form action="insertAnimal" method="post">
<s:textfield name="a.id" key="Animal Id"></s:textfield>
<s:textfield name="a.name" key="Animal Name"></s:textfield>
<s:submit name="submit" value="Insert" ></s:submit>
</s:form>
</body>
</html>