import merge from "lodash";

const obj1 = { name: 'Bobo' };
const obj2 = { shoeSize: 400 };

const merged = merge(obj1, obj2);
// { name: 'Bobo', 'shoeSize: 400 }