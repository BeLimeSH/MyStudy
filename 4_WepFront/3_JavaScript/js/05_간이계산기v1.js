
const num1 = document.getElementById("num1");
const num2 = document.getElementById("num2");
const result = document.getElementById("result");

//Number(num1.value) + Number(num2.value)
//Number(문자열) = 숫자로 변환

function plus(){
   result.innerText =  Number(num1.value) + Number(num2.value);
}