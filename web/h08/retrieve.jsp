<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Retrieve Page</title>
</head>
<body> 
<s:form action="h08_RetrieveCustomer" method="post">
<s:textfield name="cno" key="lbl.recno"></s:textfield>
<s:submit name="submit" value="Find" ></s:submit>
</s:form>
</body>
</html>