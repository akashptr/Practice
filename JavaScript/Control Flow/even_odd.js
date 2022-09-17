// Function to check whether a number is even or odd
function showEvenOdd(limit) {
    for(let i=0; i<=limit; i++)
    {
        let string = ((i % 2) === 0) ? 'Even' : 'Odd';
        console.log(i, string);
    }
}

showEvenOdd(20);