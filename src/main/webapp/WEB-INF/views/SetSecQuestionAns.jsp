<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SetSecQuestionAns</title>
</head>
<body>
<h2>SetSecQuestionAns</h2>



	<form method="post" action="savequestionans">
		Question :  <select name="question">
							<option value="Your mother's BirthPlace">Your mother's BirthPlace</option>
				    		<option value="First Bank Who Provide CreditCard">First Bank Who Provide CreditCard</option>
				    		<option value="First Job Company Name">First Job Company Name</option>
				    </select>
		<br><br>
		Ans : <input type="text" name="ans"><br><br>
		<input type="submit" value="SetQuestion"/> 
	</form>
</body>
</html>