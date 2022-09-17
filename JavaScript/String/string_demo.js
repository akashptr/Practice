// Demonstration of different string methods.
const message = ' My name is Akash Patra ';

console.log(message);                               // Displays the string on console
console.log(message.length);                        // Displays the length of the string
console.log(message.trim());                        // Remove starting and trailing spaces in the string
console.log(message.trimStart());                   // Removes only the starting blank space
console.log(message.trimEnd());                     // Removes only the trailing blank space
console.log(message[2]);                            // Shows character at index 2
console.log(message.includes('name'));              // Checks whether the string contains a sub-string
console.log(message.startsWith(' My'));             // Checks whether the string starts with a sub-string
console.log(message.endsWith('tra '));              // Checks whether the string ends with a sub-string
console.log(message.indexOf('is'));                 // Returns the index of a sub-string in the string
console.log(message.replace('Akash', 'Bikash'));    // Replace a sub-string with another one
console.log(message.toUpperCase());                 // Converts to all upper case
console.log(message.toLowerCase());                 // Converts to all lower case
console.log(message.split(' '));                    // Splits the string into an array of tokens using the delimiter

const name = 'Akash';
const currentYear = 2022;
const yearOfBirth = 1998;
const stringTemplate = `My name is ${name} and
 I am ${currentYear - yearOfBirth} years old`;      // Template literal
 console.log(stringTemplate);