// Count the number of occurrences of an element in an array.
const elements = [1, 2, 1, 3, 4, 1, 2, 4];
const count = countOccurrenceUsingReduce(elements, 1);
console.log(count);

function countOccurrence(array, element) {
    let count = 0;
    for(let value of array)
        if(value === element)
            count++;
    return count;
}

function countOccurrenceUsingReduce(array, element) {
    return array.reduce(
        (accumulator, currentValue) => {
            if(currentValue === element)
                accumulator++;
            return accumulator;
        }, 0
    );
}