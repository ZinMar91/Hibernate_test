<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Insert Page</title>
</head>
<body> 
<s:form action="h08_InsertCustomer" method="post">
<s:textfield name="c.firstName" key="lbl.fname"></s:textfield>
<s:textfield name="c.lastName" key="lbl.lname"></s:textfield>
<s:password name="c.password" key="lbl.pwd"></s:password>
<s:password name="c.cpassword" key="lbl.cpwd"></s:password>
<s:textfield name="p.pno" key="Phone Number"></s:textfield>
<s:submit name="submit" value="Insert" ></s:submit>
</s:form>
</body>
</html>