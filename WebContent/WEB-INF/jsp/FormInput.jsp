<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
	<h1>Input Form</h1>
	<h5>${title}</h5>
	<br>
	<form:errors path="identitas.*" />
	<br>

	<form action="/SpringMVCProject1/input-form.php" method="post">
		<p>
			Input Name : <input type="text" name="personName" />
		</p>
		<p>
			Input Hobby : <input type="text" name="personHobby" />
		</p>
		<p>
			Input Mobile : <input type="tel" name="personMobile" />
			<small>must number</small>
		</p>
		<p>
			Input DOB : <input type="date" name="personDOB" />
			<small>yyyy/mm/dd</small>
		</p>
		<p>
			Input Name : 
			<select name="personSkills" multiple>
				<option value="php">PHP</option>
				<option value="java">Java</option>
				<option value="python">Python</option>
			</select>
		</p>
		<p>
			Input Negara : <input type="date" name="personAddress.country" />
		</p>
		<p>
			Input Kota : <input type="date" name="personAddress.city" />
		</p>
		<input type="submit" value="Submit" />
	</form>
 
</body>
</html>

