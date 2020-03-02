public class Student extends Person{
    private int id;

    public Student(String name, int age, int id){
        super(name, age);//must be the first statement in the constructor
        this.id = id;
    }
}
