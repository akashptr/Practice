// Passing an user defined object to a function

function Address(street, city, zipCode) {
    this.street = street;
    this.city = city;
    this.zipCode = zipCode;
}

function showAddress(address) {
    for(let key in address)
        console.log(key, address[key]);
}

const add1 = new Address('Kaibarta Para Lane', 'Howrah', '711106');
showAddress(add1);