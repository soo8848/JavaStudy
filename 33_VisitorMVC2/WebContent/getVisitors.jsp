<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    ${loginName}님 환영합니다 <a href="controller?cmd=logoutAction">logout</a>
<a href="#">login</a>
<h1>회원 전용 방명록</h1>

<div>  
	<select>
		<option>작성자</option>
		<option>날짜</option>
		<option>글내용</option>
	</select>

	<input > <button>검색</button>
</div>
 <a href="#">방명록 작성</a>
<div>
	<div><span>
			<textarea rows="2" cols="40">로그인 한 사람 게시물</textarea> 
	     </span> 
	    <span>2010-10-22</span> 
	   <a href="#">수정</a> <a href="#">삭제</a></div>
	<div><span>어서오세요  방가방가</span> 
	    <span>2010-10-21</span> 
	</div>
</div>