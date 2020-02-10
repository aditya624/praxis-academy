let A=[[1,2,3],[3,4,1],[9,9,9]];
let B=[[9,9,9],[2,2,2],[1,1,1]];
let C= new Array(A.length);
for (let i = 0; i < C.length; i++) {
    C[i]=new Array(A.length);
}
for (let i = 0; i < A.length; i++) {
    for (let j = 0; j < B.length; j++) {
        C[i][j]=A[i][j]+B[i][j];
    }
}
console.log(C);

