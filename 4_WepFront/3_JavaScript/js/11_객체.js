//객체 생성1
document.getElementById("btn1").addEventListener("click", function() {

    const div1 = document.getElementById("div1");

    //{} 객체 리터럴 표기법으로 객체 생성

    // ** 중요 **
    // 자바스크립트 객체의 Key는 무조건 String
    // "Key" 또는 'Key' 또는 Key (따옴표 없어도 String으로 인식)
    
    const product = { 
        "pName" : "텀블러",
        'brand' : "스타벅스",
        color : ["white", "black", "silver"],
        price : 35000,

        //기능(메서드)
        mix : function(){
            console.log("섞기 시작합니다.")
        },

        information : function() {

            // 같은 객체 내부의 다른 속성을 호출하고 싶은 경우
            // 현재 객체를 뜻하는 this를 붙여야 한다.
            console.log(this.brand);

            //this 미작성시 객체 외부 변수 호출
            // console.log(this.brand);
        }
    };

    //결과 출력
    div1.innerHTML = "";

    div1.innerHTML += "product.pName : " + product.pName + "<br>";
    div1.innerHTML += "product.brand : " + product.brand + "<br>";
    div1.innerHTML += "product.color : " + product.color + "<br>";
    div1.innerHTML += "product.price : " + product.price + "<br>";

    div1.innerHTML += "<hr>";
    
    //자바스크립트 객체용 향상된 for문(for in)
    //-> 객체 내부에 작성된 Key를 순서대로 하나씩 꺼내옴
    for(let key in product){
        div1.innerHTML += product[key] + "<br>";
        // 배열 인덱스 선택하듯이 작성
    }
    
    div1.innerHTML += "<hr>";

    //객체 메서드 호출
    product.mix();
    product.information();

});

// ------------------------------------------

// 생성자 함수 (자바의 생성자를 함수로 작성하는 모양)

// 1. 생성자 함수 정의 (생성자 함수명은 대문자로 시작)
function Student(name, grade, ban){

    //속성
    // this == 생성되는 객체
    this.name = name; // 생성되는 객체 name에 변수 name을 대입
    this.grade = grade;
    this.ban = ban;

    //기능(메서드)
    this.intro = function(){
        console.log(grade + "학년 " + ban + "반 " + name + "입니다.");
    }
}

// 2. 생성자 함수 호출(new 연산자)
document.getElementById("btn2").addEventListener("click", function(){

    const std1 = new Student("홍길동", 3, 2);
    const std2 = new Student("홍길순", 2, 1);
    const std3 = new Student("김길동", 1, 3);

    console.log(std1);
    console.log(std2);
    console.log(std3);

    //생성자 함수 사용 이유 : 같은 형태의 객체가 다수 필요할 때 사용 -> 재사용성
});