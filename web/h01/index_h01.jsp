<%@ taglib prefix="s" uri="/struts-tags" %>
<h1>01 : Hibernate_1Entity2Tables</h1>
<s:url action="save" var="save"/>
<s:url action="search" var="search"/>

<s:a href="%{save}">Insert Customer Information</s:a> <br/>
<s:a href="%{search}">Search Customer Information</s:a>

<br/>
<s:url action="aaa" var="aaa"/>
<s:a href="%{aaa}">Add Product</s:a>
<br/>
<s:url action="bbb" var="bbb"/>
<s:a href="%{bbb}">View All Products</s:a>