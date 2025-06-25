<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mybatis 실습</title>
<script src="${pageContext.request.contextPath}/js/jquery-3.6.0.js"></script>
<style>
div#student-container{text-align:center;}
table.tbl-student{margin:10px auto;border:1px solid; border-collapse:collapse;}
table.tbl-student th,table.tbl-student td{
	border:1px solid;
	padding:5px;
	line-height: 2em; 
}
table.tbl-student th{text-align:right;}
table.tbl-student td{text-align:left;}
table.tbl-student tr:last-of-type td:first-child{text-align:center;}
</style>
</head>
<body>
	<div id="student-container">
		<h2>학생정보 검색</h2>
		<p>총 학생수는 ?명입니다.</p>
		<form>
			<table class="tbl-student">
				<tr>
					<th>학생번호</th>
					<td>
						<input type="number" name="no" value="" required/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="검색" />
					</td>
				</tr>
			</table>
		</form>
		
		<hr />
		
		<h1>학생 정보 수정</h1>
		<form 
			name="studentUpdateFrm"
			action="${pageContext.request.contextPath}/student/updateStudent"
			method="POST">
			<table class="tbl-student">
				<tr>
					<th>학생번호</th>
					<td>
						<input type="number" name="no" value="" required readonly/>
					</td>
				</tr>
				<tr>
					<th>학생이름</th>
					<td>
						<input type="text" name="name" value="" required/>
					</td>
				</tr>
				<tr>
					<th>학생전화번호</th>
					<td>
						<input type="tel" name="tel" value="" required/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="수정" />
						<input type="button" value="삭제" onclick="deleteStudent();" />
					</td>
				</tr>
			</table>
		</form>
		<form method="POST" name="studentDelFrm" action="${pageContext.request.contextPath}/student/deleteStudent">
			<input type="hidden" name="no" value="" />			
		</form>
		<script>
		var deleteStudent = () => {
			if(confirm("정말 삭제하시겠습니까?")){
				$(document.studentDelFrm).submit();
			}
		};
		</script>
		
		<hr />
		
		<h2>학생 정보 조회(Map)</h2>
		<form name="ajaxStudentSearchFrm">
			<table class="tbl-student">
				<tr>
					<th>학생번호</th>
					<td>
						<input type="number" name="no" value="" required/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="검색" />
					</td>
				</tr>
			</table>
		</form>
		<table class='tbl-student'></table>
		<script>
		// 학생번호와 일치하는 학생 한명을 비동기 방식으로 조회하여 
		// 학생번호, 이름 , 전화번호 , 등록일정보를 .tbl-student내부에 추가할 것
		</script>
		
		
	</div>
</body>
</html>
