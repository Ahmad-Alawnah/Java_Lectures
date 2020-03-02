import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //arraylist size changes when adding or removing data
        arrayList.add(5); // will add 5 to the array list
        arrayList.add(-1);
        System.out.println(arrayList.get(1)); //will return element at index 1 (0 based)
        //other arraylist methods
        arrayList.add(2,15); //will add 15 at index 2 and shifts up
        //arrayList.clear(); //emptys the arraylist
        arrayList.remove(1); //removes element at index 1 and shifts down

        //arrayList.removeRange(from (inclusive) ,to (exclusive)); removes a range of elements

        int s =arrayList.size(); // return the length of the list

        Object[] a = arrayList.toArray(); //returns an array containing same elements (returns an array of objects 29/2)

        arrayList.isEmpty(); //yes

        arrayList.indexOf(4); //returns the first index that contains 4 (negative value if not found)
        arrayList.contains(4); //return true if 4 exists in the array

        arrayList.set(1,7);// changes the element at index 1 to 7 (different than add, the old value will be overwritten)

        //loops with array list:
        for(int i =0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();

        //enhanced for loop with array list:

        for(Integer x: arrayList){ //remember that it takes a collection and an iterator (coming soon)
            System.out.print(x + " ");
        }
        System.out.println();


        //polymorphism

        Student student = new Student();
        System.out.println(student.getName());
        Person person = new Person();
        System.out.println(person.getName()); //these are static binding because we know which methods we are gonna use

        Person person1 = new Student(); //this is polymorphism (it works because a student is a person) (the opposite is not correct)
        // this happens at runtime

        System.out.println(person1.getName()); //will call the one in student (this is called dynamic binding) "at runtime it 'chooses' which method to call"

        System.out.println(person);//will print the address because we did not override toString, in Object, toString prints the address

        Person person2 = new Person();

        boolean x = person == person2; // this compare addresses which will be false

        x = person.equals(person2); //this will also compare addresses until we override it, because in Object, it compares addresses
    }
}
