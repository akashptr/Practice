function calculateGrade(marks) {
    // 0-59: F
    // 60-69: D
    // 70-79: C
    // 80-89: B
    // 90-100: A
    
    let total = 0;
    
    for(let mark of marks)
        total += mark;
    const average = total / marks.length;
    if(average < 60)
        return 'F';
    if(average < 70)
        return 'D';
    if(average < 80)
        return 'C';
    if(average < 90)
        return 'B';
    return 'A';
}

console.log(calculateGrade([50,80,80]));