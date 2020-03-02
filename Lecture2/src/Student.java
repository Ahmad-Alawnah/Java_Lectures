public class Student extends Person {
    //all members of Person are here, BUT ONLY Public and Protected members are accessible
    //private members are accessed using setters and getters

    public Student(){

        // will call the constructor of Person implicitly, if in person there is no 'no argument' or default constructor, we must explicitly call the constructor of the parent using 'super' keyword
        super(); //just like that (must be the first statement in the constructor)

    }

    public String getName(){ //this is overriding (same name and parameters)
        return "student: "+ super.getName(); //the implementation can be different
        //'super' is a reference to the parent
        //'this' is a reference to the current object
    }

    public String toString(){
        return this.getName()+ " is a bad person";
    }
}
