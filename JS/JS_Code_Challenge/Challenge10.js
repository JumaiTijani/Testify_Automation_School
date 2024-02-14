//Create a function that filters out negative numbers

function negativeNumbers(numbers) {
    return numbers.filter(number  => number >= 0)
}

const numbers = [-23,-20, -12, 5, 0, -1, 5, 12, -19, 20]
const positiveArray = negativeNumbers(numbers)


console.log(positiveArray);