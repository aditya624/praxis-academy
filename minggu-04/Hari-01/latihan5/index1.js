// rewriting class User in pure functions

// 1. Create constructor function
function User(name) {
    this.name = name;
  }
  // any function prototype has constructor property by default,
  // so we don't need to create it
  
  // 2. Add the method to prototype
  User.prototype.sayHi = function() {
    console.log(this.name);
    
  };
  
  // Usage:
  let user = new User("John");
  user.sayHi();