<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:if test="mo!=null">
Mother id:
<s:property value="mo.id"/><br/>
Mother Name:
<s:property value="mo.mname"/><br/>
Mother Age:
<s:property value="mo.age"/>
</s:if>
<s:else>No Match Data</s:else>
</body>
</html>