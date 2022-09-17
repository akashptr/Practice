// Factory constructor which returns a new object
function createAddress(street, city, zipCode) {
    return {
        street,
        city,
        zipCode
    };
}
const add1 = createAddress('Gandhi Nagar', 'Delhi', 100112);

// Constructor function
function Address(street, city, zipCode) {
    this.street = street;
    this.city = city;
    this.zipCode = zipCode;
}
const add2 = new Address('Bandra', 'Mumbai', 200229);

console.log(add1);
console.log(add2);