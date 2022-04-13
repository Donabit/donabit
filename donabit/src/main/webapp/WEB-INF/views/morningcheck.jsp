<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>미라클모닝 인증페이지</title>
<script src="resources/jquery-3.6.0.min.js"></script>

 <script src="mybatis_spring.js" defer></script>
<link rel="stylesheet" href="css/check.css">


<script type="text/javascript">
	$(document).ready(function(){
		//jquery code
	});
</script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<div class="checkform_container">
	<h1>파일 전송 폼</h1>
	<hr>
	<form action="/checkresult" method="post" enctype="multipart/form-data">
		닉네임:<input type=text name="nickname"> <br>
		체크번호:<input type=text name="checktitle"> <br>
		제목:<input type=text name="checktitle"> <br>
		설명:<input type=text name="checkdesc"><br>
		이미지:<input type=file name="checkimg" ><br>
		<input type=submit value="파일전송">	
	</form>
</div>

<div class="checkresult_container">
		<div class="header">1.미라클모닝</div>
		<div class="section">
			<div class="containerflex">
				<c:forEach items="${checklist}" var="dto">
					<div class="item">
						<div class="checkimg">
							이미지
						</div>

					</div>
				</c:forEach>
			</div>
		</div>
</div>
</body>
</html>