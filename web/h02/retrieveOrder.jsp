<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Retrieve Page</title>
</head>
<body> 
<s:form action="RetrieveOrder" method="post">
<s:textfield name="odno" key="lbl.reod"></s:textfield>
<s:submit name="submit" value="Find" ></s:submit>
</s:form>
</body>
</html>