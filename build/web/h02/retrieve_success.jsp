<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Sale Retrieve Success Page</title>
</head>
<body> 
Item ID: <s:property value="item.id"/> </br>
Product Name: <s:property value="item.name"/> </br>
Order Information:
 <s:property value="item.order.oid"/> 
 <s:property value="item.order.address"/> </br>
 <s:iterator value="item.order.item"> 
 Items:<s:property value="name"/> 
 <br>
 </s:iterator>
</body>
</html>