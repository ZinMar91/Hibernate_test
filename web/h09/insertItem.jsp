<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Insert Sale Page</title>
</head>
<body> 
<s:form action="h09_InsertItem" method="post">
<s:textfield name="item.id" key="lbl.itid"></s:textfield>
<s:textfield name="item.name" key="lbl.itname"></s:textfield>
<s:textfield name="item.order.oid" key="lbl.it.oid"></s:textfield>
<s:submit name="submit" value="Insert" ></s:submit>
</s:form>
</body>
</html>