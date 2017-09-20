<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Insert Person Page</title>
</head>
<body> 
<s:form action="insertPerson" method="post">
<s:textfield name="p.name" key="lbl.name"></s:textfield>
<s:textfield name="p.address.streetAddress" key="lbl.street"></s:textfield>
<s:textfield name="p.address.city" key="lbl.city"></s:textfield>
<s:textfield name="p.address.state" key="lbl.state"></s:textfield>
<s:textfield name="p.address.zip" key="lbl.zip"></s:textfield>
<s:submit name="submit" value="Insert" ></s:submit>
</s:form>
</body>
</html>