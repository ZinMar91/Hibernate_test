<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="h11_insertperson">
<s:textfield name="p.pname" label="Person Name"/>
<s:textfield name="p.age" label="Person Age"/>
<s:textfield name="p.mother.id" label="Mother Id"/>
<s:submit name="submit" value="Submit"/>
</s:form>
</body>
</html>