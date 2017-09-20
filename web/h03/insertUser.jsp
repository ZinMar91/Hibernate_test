<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Insert Item Page</title>
</head>
<body> 
<s:form action="h03_insertUser">

<s:textfield name="user.firstName" key="lbl.fname"></s:textfield>
<s:textfield name="user.lastName" key="lbl.lname"></s:textfield>
<s:textfield name="nick1" key="lbl.nname1"></s:textfield>
<s:textfield name="nick2" key="lbl.nname2"></s:textfield>
<s:textfield name="nick3" key="lbl.nname3"></s:textfield>
<s:submit name="submit" value="Insert User" ></s:submit>

</s:form>
</body>
</html>