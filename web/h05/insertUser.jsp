<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Insert User Page</title>
</head>
<body> 

<s:form action="h05_insertUser">

<s:textfield name="user.firstName" key="lbl.fname"></s:textfield>
<s:textfield name="user.lastName" key="lbl.lname"></s:textfield>
<s:label label="Home Address"/>
<s:textfield name="street1" key="lbl.street"></s:textfield>
<s:textfield name="city1" key="lbl.city"></s:textfield>
<s:textfield name="state1" key="lbl.state"></s:textfield> <br>
<s:label label="Work Address"/>
<s:textfield name="street2" key="lbl.street"></s:textfield>
<s:textfield name="city2" key="lbl.city"></s:textfield>
<s:textfield name="state2" key="lbl.state"></s:textfield>

<s:submit name="submit" value="Insert User" ></s:submit>

</s:form>
</body>
</html>