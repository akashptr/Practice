/* The function checkSpeed takes one argument - the speed of a car
   and shows "Ok" if the car is in speed limit which is 70 km/h.
   If the car exceeds the speed limit then 5 points will be assigned for
   every kilometer and the total points will be shown.
   If the car exceeds point limit which is 12 then it's license will be suspended.
*/

function checkSpeed(speed){
    const speedLimit = 70;
    const kmPerPoint = 5;
    const pointLimit = 12;

    if(speed < (speedLimit + kmPerPoint))
        console.log('Ok');
    else {
        const points = Math.floor((speed - speedLimit) / kmPerPoint);
        if(points >= pointLimit)
            console.log('License suspended');
        else
            console.log('Point:', points);
    }
}

checkSpeed(129);