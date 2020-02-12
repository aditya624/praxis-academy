# 1. Error Handling "try .. catch"
## Penggunaan try catch seperti berikut,
```
try {

  // code...

} catch (err) {

  // error handling

}
```
dengan cara kerja seperti berikut,
1. Eksekusi try{}.
2. Jika tidak terjadi error try maka catch diabaikan.
3. Jika terjadi error pada try maka program akan berjalan sampai menemukan error tersebut kemudian lompat catch untuk mengeksekusi block tersebut.

## try catch di fungsi penjadwalan seperti ```setTimeout```
program tak dapat berjalan jika fungsi penjadwalan didalam try ataupun catch ,like this
```
try {
  setTimeout(function() {
    noSuchVariable; // script will die here
  }, 1000);
} catch (e) {
  alert( "won't work" );
}
```
gunakan try catch didalam fungsi penjadwalan tsb,
```
setTimeout(function() {
  try {
    noSuchVariable; // try..catch handles the error!
  } catch {
    alert( "error is caught here!" );
  }
}, 1000);
```

## Optional catch
Jika tidak membutuhkan error details silahkan gunakan
```
try {
  // ...
} catch { // <-- without (err)
  // ...
}
```

## catch tidak tereksekusi jika pemanggilan JSON yang seperti ini
```
let json = '{ "age": 30 }'; // incomplete data

try {

  let user = JSON.parse(json); // <-- no errors
  alert( user.name ); // no name!

} catch (e) {
  alert( "doesn't execute" );
}
```

sehingga gunakan trow operator ```throw <error object>```

javascript membuat standart error sbb,
```
let error = new Error(message);
// or
let error = new SyntaxError(message);
let error = new ReferenceError(message);
// ...
```
contoh penggunaan
```
let error = new Error("Things happen o_O");

alert(error.name); // Error
alert(error.message); // Things happen o_O
```
agar terbaca error untuk json,
```
let json = '{ "age": 30 }'; // incomplete data

try {

  let user = JSON.parse(json); // <-- no errors

  if (!user.name) {
    throw new SyntaxError("Incomplete data: no name"); // (*)
  }

  alert( user.name );

} catch(e) {
  alert( "JSON Error: " + e.message ); // JSON Error: Incomplete data: no name
}
```

## Cara kerja "try .. catch .. finaly"

contoh
```
try {
  alert( 'try' );
  if (confirm('Make an error?')) BAD_CODE();
} catch (e) {
  alert( 'catch' );
} finally {
  alert( 'finally' );
}
```
jika terjadi error maka algoritma ``` try -> catch -> finally```. jika tidak maka ``` try -> catch ```

# install vue.js
install secara global 
```
npm install --global vue-cli
```
new project 
```
vue init webpack my-project 
cd my-project
npm run dev
```
