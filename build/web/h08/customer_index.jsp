<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Index Page</title>
</head>
<body> 
<s:form>
<s:url action="h08_insert" var="in"></s:url>
<a href="${in}" >Insert Customer</a>
<br>
<s:url action="h08_retrieve" var="re"></s:url>
<a href="${re}" >Retrieve Customer</a>
</s:form>
</body>
</html>