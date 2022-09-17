const circle = {
    radius: 3,
    area() {
        return (Math.PI * this.radius ** 2);
    }
};

// Cloning an object using assign method
const circleClone = Object.assign({}, circle);
console.log(circleClone);

// Cloning an object using spread operator
const circleCloneSpread = {...circle};
console.log(circleCloneSpread);