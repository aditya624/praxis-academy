function Hero(name, level) {
    this.name = name;
    this.level = level;
}

// Adding a method to the constructor
Hero.prototype.greet = function() {
    return `${this.name} says hello.`;
}

// Creating a new constructor from the parent
function Mage(name, level, spell) {
    // Chain constructor with call
    Hero.call(this, name, level);

    this.spell = spell;
}