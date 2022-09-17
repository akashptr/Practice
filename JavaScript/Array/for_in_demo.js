// Demonstration of for-in loop
const person = {
    name: 'Akash',
    age: 24,
    city: 'Howrah'
};

for(let key in person)
    console.log(key, person[key]);

const personArray = ['Bikash', 29, 'Kolkata'];
for(let index in personArray)
    console.log(index, personArray[index]);