<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Insert Phone Page</title>
</head>
<body> 
<s:form action="h08_InsertPhone">
<s:textfield name="p.pno" key="Phone Number"></s:textfield>
<s:textfield name="p.pname" key="Phone Name"></s:textfield>
<s:submit name="submit" value="Insert" ></s:submit>
</s:form>
</body>
</html>