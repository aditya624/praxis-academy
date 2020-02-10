function Animal(className){
    this.className=className;
}

Animal.prototype.getClass=function(){
    return this.className;
}

function Dog(name){
    Animal.call(this,'Animal');
    this.name=name;
}



Dog.prototype.getName=function(){
    return this.name;
}

// Dog.prototype=Animal.prototype;
// var d= new Dog('pika');

// console.log("Wrong ");

// console.log(d);
// console.log('protorype : ',d.__proto__);



Dog.prototype=Object.create(Animal.prototype);
Dog.prototype.constructor=Dog;

var e= new Dog('pika1');
console.log('True ');
console.log(e);
console.log('protorype : ',e.__proto__);
console.log('Class : ',e.getClass());
