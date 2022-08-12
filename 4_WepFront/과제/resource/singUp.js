// 유효성 검사 여부 저장할 객체
const checkObj = {
    "memberGender" : false,
    "memberTel"    : false
}

// input 태그들
const memberId = document.getElementById("memberId");
const memberPw = document.getElementById("memberPw");
const checkPw = document.getElementById("checkPw");
const memberName = document.getElementById("memberName");
const memberTel = document.getElementById("memberTel");

// radio type
const genderM = document.getElementById("genderM");
const genderF = document.getElementById("genderF");

// span 태그들
const pwMessage = document.getElementById("pwMessage");
const nameMessage = document.getElementById("nameMessage");

// button
const signUpBtn = document.getElementById("signUpBtn");

// 아이디 유효성 검사
const regExp = /^[a-z][\w\-\_]{5,13}$/;

memberId.addEventListener("input", function(){
 
    if(regExp.test(memberId.value)){
        memberId.style.backgroundColor = "springgreen";
        memberId.style.color = "black";
    } else {
        memberId.style.backgroundColor = "red";
        memberId.style.color = "white";
    }
});

// 비밀번호 일치
checkPw.addEventListener("keyup", function(){

    if(memberPw.value.length == 0){
        alert("비밀번호를 입력해주세요.");
        memberPw.focus();
        this.value = "";
    }

    if(memberPw.value == this.value){
        pwMessage.innerText = "비밀번호 일치";
        pwMessage.classList.remove("error");
        pwMessage.classList.add("confirm");
        
    } else {   
        pwMessage.innerText = "비밀번호 불일치";
        pwMessage.classList.remove("confirm");
        pwMessage.classList.add("error");
    }

});

// 이름 유효성 검사
const regExp2 = /^[가-힣]{2,5}$/;

memberName.addEventListener("change", function(){

    if(regExp2.test(memberName.value)){
        nameMessage.innerText="정상입력";
        nameMessage.classList.remove("error");
        nameMessage.classList.add("confirm");
    } else {
        nameMessage.innerText="한글만 입력하세요.";
        nameMessage.classList.remove("confirm");
        nameMessage.classList.add("error");
    }
})

// validate() 함수
function validate(){

    // 성별 선택
    if(genderM.checked | genderF.checked){
        checkObj.memberGender = true;
    } else{
        alert("성별을 선택해주세요.");
        return false;
    }
    
    // 전화번호 형식
    const regExp3 = /^[0][0-9]{1,2}-[0-9]{3,4}-[0-9]{4}/;
    
    if(regExp3.test(memberTel.value)){
        checkObj.memberTel = true;
    } else {
        alert("전화번호의 형식이 올바르지 않습니다.");
        return false;
    }
}