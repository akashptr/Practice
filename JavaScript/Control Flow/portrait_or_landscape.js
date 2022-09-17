// Check whether a picture is in portrait or landscape view.
function isPotrait(width, height){
    return (width > height) ? false : true;
}

console.log(isPotrait(100, 200));
console.log(isPotrait(200, 100));