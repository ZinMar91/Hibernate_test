<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Insert Customer Page</title>
</head>
<body> 
<s:form action="h09_InsertOrder">
<s:textfield name="order.oid" key="lbl.oid"></s:textfield>
<s:textfield name="order.address" key="lbl.add"></s:textfield>
<s:submit name="submit" value="Insert" ></s:submit>
</s:form>
</body>
</html>