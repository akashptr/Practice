// Demonstration of typeof operator
function showStringProperties(obj) {
    for(let key in obj) {
        if(typeof obj[key] === 'string')
            console.log(key, obj[key]);
    }
}

const movie = {
    name: 'Avater',
    releaseDate: 2012,
    rating: 4.5,
    director: 'James Cameron'
};

showStringProperties(movie);