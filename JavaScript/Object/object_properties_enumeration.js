// Checking whether a perticular property exists in the object

const circle = {
    radius: 2,
    area() {
        return (Math.PI * this.radius ** 2);
    }
};

for(let key of Object.keys(circle))
    console.log(key);

for(let entries of Object.entries(circle))
    console.log(entries);

if('radius' in circle)
    console.log('radius property exists');

if('color' in circle)
    console.log('color property exists');
else
    console.log('color property do not exists');