<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
        <h1>HibernateOnetoOne_Unidirectional</h1>
        <s:url action="h11_inperson" var="inp"></s:url>
        <s:a href="%{inp}">Insert Person</s:a>
            <br/>
        <s:url action="h11_inmother" var="inc"></s:url>
        <s:a href="%{inc}">Insert Mother</s:a>
            <br/>
        <s:url action="h11_reperson" var="rep"></s:url>
        <s:a href="%{rep}">Retrieval Person</s:a>
            <br/>
        <s:url action="h11_remother" var="rem"></s:url>
        <s:a href="%{rem}">Retrieval Mother</s:a>
    </body>
</html>