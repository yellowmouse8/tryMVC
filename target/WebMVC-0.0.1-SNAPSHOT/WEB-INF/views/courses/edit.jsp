<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Курс</title>
<style>
	form fieldset {
		width : 40%;
	} 
	form fieldset label {
		display : block;
		/*width : 50%;
		float :left;*/
	}
	form fieldset input, form fieldset textarea {
		width : 100%;
	}
</style>
</head>
<body>
	<h1><spring:message code="header-course"/> </h1>
	<form method="POST">
		<fieldset>
			<div>
				<label>Название: </label>
				<label>
					<input type="text" name="title" value="${course.title}">
				</label>
			</div>
			<div>
				<label>Длительность: </label>
				<input  type="number" name="length" value="${course.length}">
			</div>
			<div>
				<label>Описание: </label>
				<textarea name="description" rows="7">${course.description}</textarea>
			</div>
			<div>
				<input type="submit" value="Сохранить">
				<s:authorize access="hasRole('ROLE_USER')">
				</s:authorize>
			</div>
		</fieldset>
	</form>
</body>
</html>