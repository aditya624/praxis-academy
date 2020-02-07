function countBs(a){
    return a.match(/B/g).length;
}

function countChar(a,b){
    for (let i = 1; i <= a.length; i++) {
        let count=0;
        if (a.subsring(i,i+1)==b) {
            count++;
        }
    }
    return count;
}

console.log(countBs("BBC"));
// → 2
console.log(countChar("kakkerlak", "k"));
// → 4