// var http = require('http');

// var server = http.createServer(function (req, res) {
//     res.end("Hi, selamat datang di nodejs");
// });
// server.listen(8000);

for (let i = 0; i < 7; i++) {
    var add = "";
    for (let j = 0; j <= i; j++) {
        add = add + "#";
    }
    console.log(add);
}

// console.log("server running on http://localhost:8000");
