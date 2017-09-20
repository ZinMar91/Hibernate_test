<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Index Page</title>
</head>
<body> 
<s:form>
<s:url action="h08_insertp" var="inp"></s:url>
<a href="${inp}" >Insert Phone</a>
<br> 
<s:url action="h08_retrievep" var="rep"></s:url>
<a href="${rep}" >Retrieve Phone</a>
</s:form>
</body>
</html>