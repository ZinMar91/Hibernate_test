<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Retrieve Success Page</title>
</head>
<body> 
<s:if test="%{mc!=null}">
First Name: <s:property value="mc.firstName"/> </br>
Last Name: <s:property value="mc.lastName"/> <br>
Phones:
<s:iterator value="mc.phones">
<br>
<s:property value="pno"/>
</s:iterator>
</s:if>
<s:else>No Matching Customer Found:try Again</s:else>
</body>
</html>