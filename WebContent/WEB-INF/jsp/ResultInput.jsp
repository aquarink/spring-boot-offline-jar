<html>
<body>
	<h1>Result Form</h1>
	<h5>${title}</h5>
 
	<table>
		<tr>
			<td>Name</td>
			<td>: ${identitas.personName}</td>
		</tr>
		
		<tr>
			<td>Hobby</td>
			<td>: ${identitas.personHobby}</td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td>: ${identitas.personMobile}</td>
		</tr>
		
		<tr>
			<td>Tanggal Lahir</td>
			<td>: ${identitas.personDOB}</td>
		</tr>
		<tr>
			<td>Kemampuan</td>
			<td>: ${identitas.personSkills}</td>
		</tr>
		
		<tr>
			<td>Negara</td>
			<td>: ${identitas.personAddress.country}</td>
		</tr>
		<tr>
			<td>Kota</td>
			<td>: ${identitas.personAddress.city}</td>
		</tr>
	</table>
 
</body>
</html>