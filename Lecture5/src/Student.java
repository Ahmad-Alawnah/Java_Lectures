public class Student implements Comparable<Student>{//this is an interface in java.util
    //btw this is a POJO class (plain old java object) which only has data, constructor(s), setters and getters
    private String name;
    private int age;
    private int id;

    public Student(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String toString(){
        return this.name+" "+ this.age +" "+ this.id;
    }

    @Override
    public int compareTo(Student s) {
        //will sort based on age
        if (this.age == s.age){
            return 0;
        }
        else if (this.age > s.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}
