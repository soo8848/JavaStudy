//document.getElementById('registerBtn').addEventListener('click', function() {
//    location.href = 'register.html';
//});

//1. 기능 함수 정의
var goRegister = function() {
	location.href = 'register.html';
};

//var goRegister = ()=> location.href = 'register.html' //이클립스가 너무 옛날거라 인식을 못해

// 2. DOM 요소 가져오기
var registerBtn = document.getElementById('registerBtn');

// 3. 이벤트 연결
registerBtn.addEventListener('click', goRegister);//함수 자체를 전달해야 함 (괄호 X)
//DoRegister: <button id="registerBtn">회원가입</button>