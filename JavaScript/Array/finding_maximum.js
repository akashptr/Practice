// Find maximum number in an array
const numbers = [1, 2, 3, 4];
const max = getMaxUsingReduce(numbers);
console.log(max);

function getMax(array) {
    let max = array[0];
    for(let i=1; i<array.length; i++)
        if(array[i] > max)
            max = array[i];
    return max;
}

function getMaxUsingReduce(array) {
    return array.reduce(
        (acc, curValue) => (acc > curValue) ? acc : curValue
    );
}