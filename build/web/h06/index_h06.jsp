<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Index Page</title>
</head>
<body> <h1>06 : Hibernate_EntityInheritance</h1>
<s:form>
<s:url action="inserta" var="in1"></s:url>
<a href="${in1}" >Insert Animal</a>
<br/>
<s:url action="insertla" var="in2"></s:url>
<a href="${in2}" >Insert Land Animal</a>
<br/>
<s:url action="insertaa" var="in3"></s:url>
<a href="${in3}" >Insert Air Animal</a>
<br/>

<s:url action="retrievea" var="re1"></s:url>
<a href="${re1}" >Retrieve Animal</a>
<br/>
<s:url action="retrievela" var="re2"></s:url>
<a href="${re2}" >Retrieve Land Animal</a>
<br/>
<s:url action="retrieveaa" var="re3"></s:url>
<a href="${re3}" >Retrieve Air Animal</a>
<br/>
</s:form>
</body>
</html>