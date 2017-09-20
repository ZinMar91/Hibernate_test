<%-- 
    Document   : product_show
    Created on : Sep 19, 2017, 11:43:09 PM
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
        <h1>Saved product detail as below :</h1>
        <table>
            <tr>
                <th>Name :</th>
                <td><s:property value="product.name"/></td>
            </tr>
            <tr>
                <th>Price :</th>
                <td><s:property value="product.price"/></td>
            </tr>
            <tr>
                <th>Quantity :</th>
                <td><s:property value="product.qty"/></td>
            </tr>
        </table>
    </body>
</html>
