<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Sale Retrieve Success Page</title>
</head>
<body> 
First Name: <s:property value="user.firstName"/> <br>
Last Name: <s:property value="user.lastName"/> <br>

<s:if test="user.address.size()>1">
<h2>Home Address:</h2> <br>
Street: <s:property value="user.address.get(0).streetAddress"/> <br>
City: <s:property value="user.address.get(0).city"/> <br>
State: <s:property value="user.address.get(0).state"/> <br>
 <br>
 <h2>Work Address:</h2> <br>
Street: <s:property value="user.address.get(1).streetAddress"/> <br>
City: <s:property value="user.address.get(1).city"/> <br>
State: <s:property value="user.address.get(1).state"/> <br>
</s:if>

<s:elseif test="user.address.size()>0">
<h2>Home Address:</h2> <br>
Street: <s:property value="user.address.get(0).streetAddress"/> <br>
City: <s:property value="user.address.get(0).city"/> <br>
State: <s:property value="user.address.get(0).state"/> <br>
 <br>
</s:elseif>
<s:else>No Address</s:else>
 
</body>
</html>