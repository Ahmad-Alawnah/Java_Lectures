public class Person {

    private int age;
    private String name;

    public String getName(){
        return this.name;
    }

    public String toString(){ //overridden from Object
        return "E";
    }

    public boolean equals(Person p){
        return this.age == p.age;
    }
}
// we can write class Student here BUT IT WILL NOT BE PUBLIC
