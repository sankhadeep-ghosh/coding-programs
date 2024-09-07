//constructor function
function Person (firstName, lastName, dob){
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = new Date(dob);
}
const person1 = new Person('Sankhadeep', 'Ghosh', '6-26-2004');
console.log(person1);