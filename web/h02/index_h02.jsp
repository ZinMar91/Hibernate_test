<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Index Page</title>
</head>
<body> <h1> h02 : Hibernate_Bidirectional</h1>
<s:form>
<s:url action="insertOd" var="inod"></s:url>
<a href="${inod}" >Insert Order Information</a>
</br>
<s:url action="insertIt" var="init"></s:url>
<a href="${init}" >Insert Line Item</a>
</br>
<s:url action="retrieveIt" var="reit"></s:url>
<a href="${reit}" >Retrieve Line Item</a>
<br>
<s:url action="retrieveOd" var="reod"></s:url>
<a href="${reod}" >Retrieve Order Information</a>
</br>
</s:form>
</body>
</html>