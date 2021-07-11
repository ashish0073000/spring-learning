<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addStudent">
		Roll No.: <input type="text" name="roll_no">
		Name: <input type="text" name="name">
		Surname: <input type="text" name="sname">
		<input type="submit">
	</form>
	<hr>
	Search By Name
	<form action="searchByName">
		Enter name: <input type="text" name="name">
		<input type="submit">
	</form>
	Search By Roll Number
	<form action="searchByRollNo">
		Enter name: <input type="text" name="roll_no">
		<input type="submit">
	</form>
	Find All Students
	<form action="searchAllStudents">
		<input type="submit">
	</form>
	Remove Student By Name
	<form action="removeByName">
		Enter name to be removed: <input type="text" name="name">
		<input type="submit">
	</form>
	Remove Student By Roll Number
	<form action="removeByRollNo">
		Enter name to be removed: <input type="text" name="roll_no">
		<input type="submit">
	</form>
	<br>
	<hr>
	<br>
	Update student name and surname by roll_no
	<form action="updateByRollNo">
		Enter roll_no: <input type="text" name="roll_no">
		Enter name: <input type="text" name="name">
		Enter Surname: <input type="text" name="sname">
		<input type="submit">
	</form>
</body>
</html>