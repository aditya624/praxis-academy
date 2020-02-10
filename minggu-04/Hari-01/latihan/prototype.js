function Animal(name){
    this.name=name;
}

Animal.prototype.getName=function(){
    return this.name;
}
Animal.prototype.generation='100';

var a=new Animal('Dog');
console.log('Animal Prototype ',Animal.prototype);
console.log('prototype dari a ',a.__proto__);
console.log('sama ',Animal.prototype===a.__proto__);
console.log('a = ',a);
console.log('nama a =',a.getName());
console.log('generalisasi : ',a.generation);
console.log('cek :',a.hasOwnProperty('generation'));



