// Given an array and a list of elements return a new array without the provided elements.
const array1 = [1, 2, 3];
const newArray = except(array1, [1, 2]);

function except(currentArray, exceptArray) {
    let newArray = [];
    for(let value of currentArray) {
        if(!exceptArray.includes(value))
            newArray.push(value);
    }
    return newArray;
}

console.log(newArray);