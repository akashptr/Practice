// Moving an element in different position of array.
const elements = [1, 2, 3, 4];
const output = move(elements, 3, -4);
console.log(output);

function move(array, index, offset) {
    const position = index + offset;
    if(index < 0 || index >= array.length ||
        (position < 0) || (position >= array.length)){
        console.error('Invalid parameters');
        return array;
    }
    let newArray = [...array];
    let element = newArray.splice(index, 1)[0];
    newArray.splice(position, 0, element);
    return newArray;
}