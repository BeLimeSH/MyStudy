//Node 확인하기
document.getElementById("btn1").addEventListener("click", function(){

    // - 요소.childNodes : 요소의 자식 노드를 모두 반환
    const nodeList = document.getElementById("test").childNodes;

    console.log(nodeList);

    //노드 탐색

    // 1) 부모 노드 탐색 : parentNode
    const li1 = document.getElementById("li1");
    console.log(li1.parentNode);

    li1.parentNode.style.backgroundColor = "orange";

    //부모 노드 마지막에 새로운 노드 추가
    li1.parentNode.append("ABCD");


    //2) 첫 번째 자식 노드 탐색 : firstChild
    console.log(document.getElementById("test").firstChild);
    
    //3) 마지막
    console.log(document.getElementById("test").lastChild);
    
    //4) 중간 : 부모요소.childNodes[인덱스]
    console.log(nodeList[11]);
    console.log(nodeList[11].append("1234"));
    
    //5) 이전 형제 노드 탐색 : privious Sibling
    //   다음 형제 노드 탐색 : next Sibling

    console.log(nodeList[8].previousSibling);
    console.log(nodeList[8].nextSibling);
    
    //노드 탐색을 위한 구문은 연달아서 사용가능
    console.log(nodeList[8].previousSibling.previousSibling.previousSibling);

});

//Element 탐색 확인하기
document.getElementById("btn2").addEventListener("click", function(){

    // #test의 모든 자식 요소를 반환
    const list = document.getElementById("test").children;
    console.log(list);

    //#test의 첫 번째 자식 요소
    document.getElementById("test").firstElementChild.style.backgroundColor = "red";
    
    //#test의 마지막 자식 요소
    document.getElementById("test").lastElementChild.style.backgroundColor = "green";

    //#test의 자식 중(list) 2번 인덱스의 이전/다음 형제요소
    list[2].previousElementSibling.addEventListener("click", function(){
        alert("이전 요소 클릭 됨");
    });
    
    list[2].nextElementSibling.addEventListener("click", function(){
        alert("다음 요소 클릭 됨");
    });

    console.log(prevEl(list[2]));
    console.log(nextEl(list[2]));
});

//이전 형제 요소 선택 함수
function prevEl(el){
    return el.previousElementSibling;
}

//다음 형제 요소 선택 함수
function nextEl(el){
    return el.nextElementSibling;
}

let count1 = 1;

//innerHTML 버튼 클릭시
document.getElementById("btn3-1").addEventListener("click", function(){
    
    const div = document.getElementById("div3-1"); //#div3-1 선택
    
    if(count1 <= 10){
        div.innerHTML += "<div>"+ count1 +"</div>"
        count1++; //숫자 증가
    }
    
});

let count2 = 1;

//createElement 버튼 클릭시
document.getElementById("btn3-2").addEventListener("click", function(){
    
    const div = document.getElementById("div3-2"); //#div3-2 선택

    //createElement를 이용하여 div 요소 생성
    //document.createElement("태그명") : 해당 태그 요소를 생성하여 반환

    const child = document.createElement("div"); //div생성O, 화면 배치X

    if(count2 <= 10){
        //만들어진 div(child)에 내용 추가
        child.innerText = count2;
        count2++;
    
        // #div3-2의 마지막 자식 요소로 추가하기(append)
        div.append(child);
    }

})