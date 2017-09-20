<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Insert Page</title>
</head>
<body> 
<s:form action="insertAirAnimal" method="post">
<s:textfield name="aa.id" key="Animal ID"></s:textfield>
<s:textfield name="aa.name" key="Animal Name"></s:textfield>
<s:textfield name="aa.wingSpan" key="Wing Span"></s:textfield>
<s:submit name="submit" value="Insert" ></s:submit>
</s:form>
</body>
</html>