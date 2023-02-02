<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h2>Hello World!</h2>
	<form action="<c:redirect url = "/Principal/Login"/>" method="get">
		<input type="submit" value="ABRE FORM" />
	</form>
</body>
</html>
