// Demonstration of Arrow Function and Method Chaining
const movies = [
    {title: 'a', year: 2018, rating: 4.5},
    {title: 'b', year: 2018, rating: 4.7},
    {title: 'c', year: 2018, rating: 3},
    {title: 'd', year: 2017, rating: 4.5}
];

const output = movies.filter(value => value.year === 2018 && value.rating > 4)
    .sort((a, b) => b.rating - a.rating)
    .map(m => m.title);

console.log(output);