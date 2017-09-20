<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Index Page</title>
</head>
<body> <h1>Hibernate_Unidirectional</h1>
<s:form>
<s:url action="h09_insertOd" var="inod"></s:url>
<a href="${inod}" >Insert Order Information</a>
</br>
<s:url action="h09_insertIt" var="init"></s:url>
<a href="${init}" >Insert Line Item</a>
</br>
<s:url action="h09_retrieveIt" var="reit"></s:url>
<a href="${reit}" >Retrieve Line Item</a>
<br>
<s:url action="h09_retrieveOd" var="reod"></s:url>
<a href="${reod}" >Retrieve Order Information</a>
</br>
</s:form>
</body>
</html>