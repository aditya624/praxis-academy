function Animal(name){
    this.name=name;
    this.getName=function(){
        return this.name;
    }
}

var a=new Animal('Pika');
console.log('objek ',a);
console.log('ambil nama ',a.getName());
console.log('construktor ',a.constructor===Animal);