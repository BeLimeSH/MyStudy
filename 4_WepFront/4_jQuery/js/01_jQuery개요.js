// JS와 jQuery 차이점
// document.querySelector("#jsBtn")

//JS
document.getElementById("jsBtn").addEventListener("click", function(){
    this.style.backgroundColor = "black";
    this.style.color = "yellow";
    this.style.fontSize = "20px";
})

//jQuery
$("#jQueryBtn").on("click", function(){
    $(this).css("backgroundColor", "black").css("color", "white").css("fontSize", "20px");
})

// window.onload 확인
window.onload = function(){ //문서 로딩이 완료된 후 수행
    console.log("1");
}

//window.onload 중복 작성 -> 앞서 작성한 window.onload를 덮어씌움
window.onload = function(){ 
    console.log("3");
}

console.log("2");

//ready() 함수 확인
//-> 문서가 준비 되었을 때(로딩 완료) 실행
$(document).ready(function(){
    
    $("#readyTest").text("ready()함수 확인 중입니다.");
    
    $("#readyTest").on("click", function(){
        alert("클릭 되었습니다.")
    })
});

//ready 중복 작성 -> 작성한 모든 내용이 적용 됨.
$(document).ready(function(){
    document.getElementById("readyTest").style.color = "pink";
});

//ready() 함수 다른 형태
$(function(){
    console.log("ready() 함수 다른 형태");
});

//ready() + 화살표 함수
$(()=>{console.log("졸려요.");});