// Checks whether a number is prime or not
function isPrime(number) {
    for(let i=2; i<number; i++)
        if((number % i) === 0)
            return false;
    return true;
}

// Displays all the prime number upto the limit.
function showPrimes(limit) {
    for(let i=2; i<=limit; i++) {
        if(isPrime(i))
            console.log(i);
    }
}

showPrimes(50);