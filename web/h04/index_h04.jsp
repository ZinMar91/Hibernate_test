<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title> Index Page</title>
    </head>
    <body> 
        <h1>04 : Hibernate_ComponentMapping</h1>
        <s:form>
            <s:url action="insertPsn" var="in"></s:url>
            <a href="${in}" >Insert Person</a>
            </br>
            <s:url action="retrievePsn" var="re"></s:url>
            <a href="${re}" >Retrieve Person</a>
            </br>
        </s:form>
    </body>
</html>