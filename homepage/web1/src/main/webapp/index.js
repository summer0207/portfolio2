//데이터 갯수
function data_ea(array){	//배열 갯수를 확인하는 return 함수
	var ea = array.length;
	return ea;
}

//js에서 style태그로 class를 사용시 해당 값을 가져오는 부분에서 오류가 발생
//getComputedStyle, getPropertyValue 이용하여 가져옴
function obj(dom,name){
	//console.log(dom);
	var color = getComputedStyle(dom).getPropertyValue(name);
	return color;
}

//할인율 계산 return
function showprice(money,sales){
	//상품금액 - (상품금액  * (할인율 / 100))
	var sum = money - (money * (sales/100));
	return sum;
}

//원 단위 절삭 return
function floormoney(money){
	//10단위로 나누어서 소수점이 나온것을 절삭 후 다시 10단위를 곱하면
	//원단위가 절삭 되어서 출력됨
	var sum = Math.floor(money/10) * 10;
	return sum;
}

