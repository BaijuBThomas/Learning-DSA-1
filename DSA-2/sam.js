// function multiplyBy(num){
//     return function(x){

//             return num * x;
//         }
      
// }

// var multiplyByTwo = multiplyBy(2);
// var multiplyByThree = multiplyBy(3);
// var result = multiplyByTwo(multiplyByThree(4));

// console.log(result);

// function outer() {
//     var x = 10;
//     function inner(){
//         console.log(x);
//         var x = 20;
//     }
//     return inner;
// }

// var closureFunc = outer();
// closureFunc();

// function add(x){
//     return function(y){
//         return function(z){
//             return x+y+z;
//         }
//     }
// }
// var result = add(2)(3,4);

// console.log(result);