<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script type="text/javascript" >

 $(document).ready(function(){
	
	var formObj = $('form[role="form"]');
	
	console.log(formObj);
	
	$("#btn_cancel").on("click", function(){
		self.location="/user/listAll"; 
		formObj.submit();
	});
	
	$("#btn_save").on("click", function(){
		formObj.submit();
	});
	
});
</script>


<form role="form" method="post">

	<table>
		<tr>
			<td><label>userID </label></td>
			<td><input type="text" value="${userVO.userID}" readonly="readonly"></input></td>
		</tr>
		<tr>
			<td><label>Name</label></td>
			<td><input type="text"	name='name' value="${userVO.name}" ></input></td>
		</tr>
		<tr>
			<td><label>Gender</label></td>
			<td><input type="radio" name='gender' >${userVO.gender}</input></td>
		</tr>
		<tr>
			<form>
    			<label for="city">City:</label>
    			<select name="city" id="city">
        			<option value="서울">서울</option>
				    <option value="인천">인천</option>
				    <option value="제주">제주</option>
				    <option value="부산">부산</option>
				    <option value="충남">충남</option>
				    <option value="의정부">의정부</option>
				    <option value="수원">수원</option>
				    <option value="정읍">정읍</option>
				    <option value="대구">대구</option>
				</select>
			</form>
		</tr>
		<tr>
		<td><button id="cancelbtn" type="submit">취소</button></td>
		<td><button id="savebtn"  type="submit" >저장</button></td>
		</tr>
	</table>
</form>