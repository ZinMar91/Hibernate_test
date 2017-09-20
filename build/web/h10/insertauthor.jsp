<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="h10_authorinsert">
<s:textfield name="author.name" label="Enter Author Name"></s:textfield>
<s:textfield name="biography.information" label="Enter Information"></s:textfield>
<s:submit value="Submit"/>
</s:form>
</body>
</html>