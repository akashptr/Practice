// Count the number of elements which have truthy value.
function countTruthy(array) {
    let count = 0;
    for(let value of array) {
        if(value)
            count++;
    }
    return count;
}

const demoArray = [1, 'hello', 0, null, NaN];
console.log(countTruthy(demoArray));