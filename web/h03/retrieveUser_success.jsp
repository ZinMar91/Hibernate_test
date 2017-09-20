<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Sale Retrieve Success Page</title>
</head>
<body> 
First Name: <s:property value="user.firstName"/> <br>
Last Name: <s:property value="user.lastName"/> <br>
<s:if test="user.nickNames.size()>0">
Nick Names:
<br>
 <s:iterator value="user.nickNames"> 
 <s:property/> 
 <br>
 </s:iterator>
</s:if>
<s:else>No Nick Name</s:else>
 
</body>
</html>