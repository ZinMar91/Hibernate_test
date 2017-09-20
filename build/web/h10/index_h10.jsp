<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
        <h1>10 : HibernateOnetoOne_Bi</h1>
        <s:url action="h10_inserta" var="ina">
        </s:url>
        <s:a href="%{ina}">Insert Author</s:a>
            <br/>
        <s:url action="h10_insertb" var="inb">
        </s:url>
        <s:a href="%{inb}">Search Data</s:a>
        <s:url action="h10_deletetb" var="deb">
        </s:url>
        <s:a href="%{deb}">Delete Data</s:a>
    </body>
</html>