<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Retrieve Page</title>
</head>
<body> 
<s:form action="h05_retrieveUser" method="post">
<s:textfield name="uno" key="lbl.uno"></s:textfield>
<s:submit name="submit" value="Find" ></s:submit>
</s:form>
</body>
</html>