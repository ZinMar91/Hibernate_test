<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:if test="per!=null">
Person id:
<s:property value="per.id"></s:property><br/>
Name:
<s:property value="per.pname"></s:property><br/>
Age:
<s:property value="per.age"></s:property><br/>
Mother Id:
<s:property value="per.mother.id"></s:property>
</s:if>
<s:else>No Match Data</s:else>
</body>
</html>