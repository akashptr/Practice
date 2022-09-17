//arguments keyword
function sum() {
    let total = 0;
    for(let element of arguments)
        total += element;
    return total;
}
console.log(sum(1, 2, 3, 4));
console.log(sum(2, 4));

//Rest operator
function netPrice(discount, ...price) {
    return price.reduce(
        (acc, curValue) => acc + curValue
    ) * (1 - discount);
}
console.log(netPrice(0.1, 20, 30));

//Default parameters
function interest(principle, rate=3.5, year=1) {
    return (principle * rate * year) / 100;
}
console.log(interest(1000));
console.log(interest(1000, 5));
console.log(interest(1000, undefined, 5));

//Getters and setters
const person = {
    firstName: 'Akash',
    lastName: 'Patra',
    get fullName() {
        return `${this.firstName} ${this.lastName}`;
    },
    set fullName(value) {
        const parts = value.split(' ');
        this.firstName = parts[0];
        this.lastName = parts[1];
    }
};

console.log(person.fullName);
person.fullName = 'Bikash Meheta';
console.log(person.fullName);

//Error handling
function division(a, b) {
    if(b === 0)
        throw new Error('Division by zero');
    return a/b;
}

try {
    console.log(division(20, 5));
}
catch(e){
    alert(e);
}

//Using this keyword
const video = {
    title: 'a',
    tag: ['A', 'B', 'C'],
    show() {
        this.tag.forEach(function(tag) {
            console.log(this.title, tag);
        }, this);
    }
};
video.show();

//Changing this
function show(a, b) {
    console.log(a, b, this);
}
show(1, 2);
show.call({name: 'Akash'}, 1, 2);
show.apply({name: 'Bikash'}, [1, 2]);
const fn = show.bind({name: 'Prakash'});
fn(1, 2);