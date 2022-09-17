// Factory function
function createMovie(name, releaseDate, rating, director) {
    return {
        name,
        releaseDate,
        rating,
        director,
        showMovie() {
            return 'Movie named ' + this.name + ' is released on ' +
                this.releaseDate + ' rated with ' + this.rating + ' by the director named ' +
                this.director; 
        }
    };
}

const movie1 = createMovie('2012', '2-4-2012', 4.5, 'abc');
console.log(movie1.showMovie());