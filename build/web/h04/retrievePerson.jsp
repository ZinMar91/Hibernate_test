<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Retrieve Page</title>
</head>
<body> 
<s:form action="retrievePerson" method="post">
<s:textfield name="pno" key="lbl.repno"></s:textfield>
<s:submit name="submit" value="Find" ></s:submit>
</s:form>
</body>
</html>