// If a number is divisable by 3 only then it is a Fizz.
// If the number is divisable by 5 only then it is a Buzz.
// If the number is divisable by both 3 and 5 then it is FizzBuzz.

const output = fizzBuzz(17);
console.log(output);

function fizzBuzz(input) {
  if (typeof input !== 'number')
    return NaN; 

  if ((input % 3 === 0) && (input % 5 === 0))
    return 'FizzBuzz'; 

  if (input % 3 === 0)
    return 'Fizz'; 

    if (input % 5 === 0)
    return 'Buzz'; 

  return input; 
}