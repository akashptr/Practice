const practiceArray = [1, 2, 3];

//Adding elements
//End
console.log(practiceArray.push(4, 5));
console.log(practiceArray);
//Beginning
console.log(practiceArray.unshift(-1, 0));
console.log(practiceArray);
//Middle
console.log(practiceArray.splice(3, 0, 1.5, 1.75));
console.log(practiceArray);

//Finding elements.
//Primitive type.
console.log(practiceArray.indexOf(2));
console.log(practiceArray.indexOf(10));
console.log(practiceArray.includes(-1));
console.log(practiceArray.includes(10));
practiceArray.splice(6, 0, 1, 2);
console.log(practiceArray);
console.log(practiceArray.lastIndexOf(1));

console.log(practiceArray.indexOf(1, 3));
//Reference type.
const courses = [
    {id:1, name:'a'},
    {id:2, name:'b'}
];
let course = courses.find(function(course) {
    return course.name === 'a';
});
let courseIndex = courses.findIndex(function(course) {
    return course.name === 'a';
});
console.log(courseIndex, course);

//Removing elements
//End
console.log(practiceArray.pop(), practiceArray);
//Beginning
console.log(practiceArray.shift(), practiceArray);
//Middle
console.log(practiceArray.splice(2, 2), practiceArray);

//combining and spliting arrays
let split1 = practiceArray.slice(0, 3);
let split2 = practiceArray.slice(3);
let concatenated = split1.concat(split2);
console.log(`${split1}\n${split2}\n${concatenated}`);

//Spreading an array
console.log([...split1, 'a', ...split2, 'b']);

//Iterating using forEach
practiceArray.forEach((number, index) => console.log(index, number));

//Joining the elements of an array
console.log(practiceArray.join('-'));

//Sorting array
practiceArray.sort();
console.log(practiceArray);
practiceArray.reverse();
console.log(practiceArray);
courses.sort((a, b) => {
    if(a.name > b.name)
        return 1;
    if(a.name < b.name)
        return -1;
    return 0;
});
console.log(courses);

//Testing elements
console.log(
    practiceArray.every(function(value) {
        return value >= 0;
    })
);
practiceArray.push(-1);
console.log(
    practiceArray.some(function(value) {
        return value < 0;
    })
);

//Filtering elements
const allPositive = practiceArray.filter(value => value >= 0);
console.log(allPositive);

//Mapping the elements of an array
const newArray = practiceArray
    .map(num => '<li> ' + num + ' </li>')
    .join('\n');
console.log(newArray);

//Reducing an array
const sum = practiceArray.reduce(
    (accumulator, currentValue) => accumulator + currentValue,
    0
);
console.log(sum);
//Emptying an array
//solution 1
// practiceArray.length = 0;
// soloution 2
practiceArray.splice(0, practiceArray.length);
console.log(practiceArray);