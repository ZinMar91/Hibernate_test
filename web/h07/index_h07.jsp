<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Index Page</title>
</head>
<body> 
<s:form>
<s:url action="h07_insert" var="in"></s:url>
<s:a href="%{in}">Insert User Information with Entities</s:a>
<br>
<s:url action="h07_retrieve" var="re"></s:url>
<s:a href="%{re}" >Retrieve User Information with Entities</s:a>
<br>
</s:form>
</body>
</html>