<html>
<head>
	<title>${title}</title>
</head>
<body>
	学生列表：
	<table border="1">
	<#list students as s>
		<tr>
			<td>${s_index + 1}</td>
			<td>${s.id}</td>
			<td>${s.name}</td>
			<td>${s.address}</td>
		</tr>
	</#list>
	</table>
</body>
</html>