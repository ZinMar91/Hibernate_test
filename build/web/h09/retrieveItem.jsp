<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Retrieve Page</title>
</head>
<body> 
<s:form action="h09_RetrieveItem" method="post">
<s:textfield name="itno" key="lbl.reit"></s:textfield>
<s:submit name="submit" value="Find" ></s:submit>
</s:form>
</body>
</html>