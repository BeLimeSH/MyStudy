// 1단계

// [jQuery]

//addEventListener == on
$("#btn1").on("click", function (){
    
    //this : 이벤트가 발생한 요소(#btn1 버튼) -> JS
    
    //$(this) : 이벤트가 발생한 요소를 jQuery 방식으로 선택
    //          -> jQuery의 메서드 사용 가능
    
    // console.log($(this).prev());
    // console.log($(this).prev().prev());
    
    // 버튼 전, 전 요소(input)에 작성된 값 얻어오기
    const color = $(this).prev().prev().val();
    
    // 버튼 전, 전, 전 요소(div)의 배경색 변경 
    $(this).prev().prev().prev().css("backgroundColor", color);
    $(this).prev().prev().prev().css("font-weight", "bold");
    
});

// [JS]
document.getElementById("btn1").addEventListener("click", function(){
    const input = this.previousElementSibling.previousElementSibling.value;
    const box = this.previousElementSibling.previousElementSibling.previousElementSibling;

    box.style.color = "white";
    box.innerText = input;
})


// 2단계

// [jQuery]
$("#btn2").on("click", function (){
    
    const inputlist = $(".input2");

    for(let i=0; i<inputlist.length; i++){
        $(inputlist[i]).prev().css("backgroundColor", $(inputlist[i]).val());
        $(inputlist[i]).prev().css("font-weight", "bold");
    }
});

// [JS]
document.getElementById("btn2").addEventListener("click", function(){

    const inputlist = document.getElementsByClassName("input2");

    for(let i=0; i<=inputlist.length; i++){
        inputlist[i].previousElementSibling.style.color = "white";
        inputlist[i].previousElementSibling.innerText = inputlist[i].value;
    }
})

// 3단계

// [jQuery]
$(".input3").on("input", function(){

    $(this).prev().css("backgroundColor", $(this).val()).css("transition-duration", "1s");
    $(this).css("borderColor", $(this).val());
});

// [JS]
const inputList4 = document.getElementsByClassName("input4");

for(let input of inputList4){

    //for문으로 .input3 요소를 하나씩 접근해서 이벤트 추가
    input.addEventListener("input", function(){

        //입력 이벤트가 발생한 input요소의 이전 요소 배경색을 input값으로 변경
        this.previousElementSibling.style.backgroundColor = this.value;

        this.style.borderColor = this.value;

    })

}