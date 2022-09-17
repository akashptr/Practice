// Constructor function
function Circle(radius) {
    this.radius = radius;
    this.calculateArea = function() {
        return (Math.PI * this.radius ** 2);
    }
}

const circle1 = new Circle(1);
console.log(circle1.calculateArea());