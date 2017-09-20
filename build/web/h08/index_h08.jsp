<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Index Page</title>
</head>
<body> <h1>Hibernate_ManyToMany_Bidirectional</h1>
<s:form>
<s:url action="h08_phone" var="ph"></s:url>
<a href="${ph}" >Phone Operations</a>
<br> 
<s:url action="h08_customer" var="cust"></s:url>
<a href="${cust}" >Customer Operations</a>

</s:form>
</body>
</html>