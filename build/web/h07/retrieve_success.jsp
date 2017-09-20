<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Person:</b><br/>
Name:<s:property value="per.name"/><br/>

Address:<s:property value="per.address.streetAddress"/><br/>
City:<s:property value="per.address.city"/><br/>

State:<s:property value="per.address.state"/><br/>

Zip:<s:property value="per.address.zip"/><br/>
<b>Customer</b><br/>
Name:<s:property value="cer.name"/><br/>

Address:<s:property value="cer.address.streetAddress"/><br/>
City:<s:property value="cer.address.city"/><br/>

State:<s:property value="cer.address.state"/><br/>

Zip:<s:property value="cer.address.zip"/><br/>
</body>
</html>