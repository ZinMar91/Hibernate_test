<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Retrieve Phone Success Page</title>
</head>
<body> 
<s:if test="%{p!=null}">
First Name: <s:property value="p.pno"/> <br>
Last Name: <s:property value="p.pname"/> <br>
Customers: 
<s:iterator value="p.cust">
<br>
<s:property value="firstName"/> &nbsp;&nbsp;
<s:property value="lastName"/>
</s:iterator>
</s:if>
<s:else>No Matching Phone Found:try Again</s:else>
</body>
</html>