<%-- 
    Document   : product_add
    Created on : Sep 19, 2017, 11:37:10 PM
    Author     : Admin
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add new product!</h1>
        <s:form action="add" method="post">
            <s:textfield name="product.name" key="Name"/>
            <s:textfield name="product.price" key="Price"/>
            <s:textfield name="product.qty" key="Quantity"/>
            <s:submit value="Add"/>
        </s:form>
    </body>
</html>
