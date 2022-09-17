// Checking object equality base on their values and reference

const add1 = ['a', 'b', 2];
const add2 = ['a', 'b', 2];
const add3 = ['a', 'c', 3];
const add4 = add1;

function areEqual(address1, address2) {
    for(let key in address1) {
        if(!(key in address2) || (address1[key] !== address2[key]))
            return false;
    }
    return true;
}

function areSame(address1, address2) {
    return address1 === address2;
}

console.log(areEqual(add1, add2));
console.log(areSame(add1, add2));
console.log(areEqual(add2, add3));
console.log(areSame(add2, add3));
console.log(areEqual(add1, add4));
console.log(areSame(add1, add4));