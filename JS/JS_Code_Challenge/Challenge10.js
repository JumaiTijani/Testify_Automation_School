//Create a function that filters out negative numbers
// function/for/ if...else/array

let numbers = [-23,-20, -12, 5, 0, -1, 5, 12, -19, 20];

let positive_array = numbers.filter(function(value){
    return value >= 0;
});

console.log(positive_array);