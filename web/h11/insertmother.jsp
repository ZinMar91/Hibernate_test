<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="h11_insertmother">
<s:textfield name="mother.mname" label="Mother Name"/>
<s:textfield name="mother.age" label="Mother Age"/>
<s:submit name="submit" value="Submit"/>
</s:form>
</body>
</html>