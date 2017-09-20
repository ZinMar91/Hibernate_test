<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Index Page</title>
</head>
<body> <h1>05 : Hibernate_EntityCollectionMapping</h1>
<s:form>
<s:url action="h05_insert" var="in"></s:url>
<s:a href="%{in}">Insert User Information with Entity Collection</s:a>
<br>
<s:url action="h05_retrieve" var="re"></s:url>
<s:a href="%{re}" >Retrieve User Information with Entity Collection</s:a>
<br>
</s:form>
</body>
</html>