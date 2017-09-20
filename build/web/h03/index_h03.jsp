<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Index Page</title>
</head>
<body> <h1>03 : Hibernate_CollectionMapping</h1>
<s:form>
<s:url action="h03_insert" var="in"></s:url>
<s:a href="%{in}">Insert User Information with String Collection</s:a>
<br>
<s:url action="h03_retrieve" var="re"></s:url>
<s:a href="%{re}" >Retrieve User Information with String Collection</s:a>
<br>
</s:form>
</body>
</html>