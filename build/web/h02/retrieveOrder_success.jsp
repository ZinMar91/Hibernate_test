<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Retrieve Success Page</title>
</head>
<body> 
Order Number <s:property value="order.oid"/> <br>
Order Address: <s:property value="order.address"/> <br>
<s:if test="%{order.items.size()>0}">
Item list of This Order is<br>
<s:iterator value="order.items">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ID:<s:property value="id"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Name:<s:property value="name"/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Order Address:<s:property value="order.address"/>
	<br>
</s:iterator>
</s:if>
<s:else>No Item in This Order</s:else>
</body>
</html>