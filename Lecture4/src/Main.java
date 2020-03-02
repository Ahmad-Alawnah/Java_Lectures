import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        // 2/3/2020
        // command line arguments
        // "how to send parameters to a program (not a specific function)"
        // these parameters are received by the main method through String[] args

        //this main method receives 2 names, converts them to lower case, and concatanates them
        //if no parameters are provided, it will cause an exception, so we have to array check before we work with args
        if (false) { //args.length ==2

            String p1 = args[0];
            String p2 = args[1];
            p1 = p1.toLowerCase();
            p2 = p2.toLowerCase();
            p1 += " ";
            String res = p1.concat(p2);
            System.out.println(res);
        }
        else{
            System.out.println(args.length);
        }

        //if we want to pass integers for example, we have to convert the arguments into integers
        //Example (this example was written by the Dr)
        if (false) { //args.length != 0
            int sum = 0;
            float avg;
            for (String s : args) {
                sum += Integer.parseInt(s); //fancy
            }
            avg = (float)sum / args.length;
            System.out.println("Average is " + avg);
        }

        //Exercise
        /*
        write a program that takes three integers as command-line arguments to create and print an array.
        the first argument is the array size, the second argument is its first element, and the third argument is the increment
        to calculate remaining values
         */

        if (args.length == 3){
            int size = Integer.parseInt(args[0]);
            if (size > 0) {
                int[] a = new int[size];
                int init = Integer.parseInt(args[1]);
                a[0] = init;
                int increment = Integer.parseInt(args[2]);
                for(int i =1;i<a.length;i++){
                    a[i] = a[i-1] + increment;
                }

                for(int i =0;i<a.length;i++){
                    System.out.print(a[i] + " ");
                }
            }
        }

        Person p1 = new Person("Ahmad",35);
        Student s1 = new Student("Abdo",5,1234);
        Person p2 = new Student("Khalil",23,123);
        //what if we want to know at some point the type of object that some reference points at ??
        // we use instanceOf operator

        if (p2 instanceof Student){
            //do something
        }
        //but this is not good, because we must not need to check the type, this is against modularity
        //so you should avoid using it

        //the more extensions we do, the more specific we become, otherwise we are being abstract
        //the most super class is an abstract concept and objects of it have no meaning,
        //if we have a class like this, we should make it abstract, that way, we cant create objects of it
        //choosing whether a class should be abstract or not depends on the context
    }
}
