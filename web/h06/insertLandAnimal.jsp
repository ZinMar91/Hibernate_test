<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Insert Page</title>
</head>
<body> 
<s:form action="insertLandAnimal" method="post">
<s:textfield name="la.id" key="Animal ID"></s:textfield>
<s:textfield name="la.name" key="Animal Name"></s:textfield>
<s:textfield name="la.legCount" key="Leg Count"></s:textfield>
<s:submit name="submit" value="Insert" ></s:submit>
</s:form>
</body>
</html>