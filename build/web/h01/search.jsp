<%@ taglib prefix="s" uri="/struts-tags"%>

<html>

<body>
	
		<s:form action="find">
		<s:textfield name="cno" key="Give Customer Number to Search" size="20" requiredLabel="true"/>
		<s:submit value="Search"/>
	</s:form>
	
	
</body>
</html>