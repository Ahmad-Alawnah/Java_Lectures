import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        //System.out.println(x);

        long y = random.nextLong(); //ignore this plz
        //System.out.println(y);

        int ten = random.nextInt(10); //from 0 to 9

        //generate a random integer in a range
        // int from [20,75]

        int num = 20 + random.nextInt(76-20);

        //general formula
        // num = min + random.nextInt(max-min+1); (write it in a fcn to avoid having to repeat it "and pass the range to it")

        Random random1 = new Random( /*some long integer here (it is called seed value)*/ 1234);
        //seed is value that tells the algorithm from where to start
        // if no seed is provided, each run will generate different values, but if we provide a seed, same random numbers will be generated
        //this is sometimes needed in some experiments
        //it doesn't matter what value we provide

        int num2 = random1.nextInt(100);
        System.out.println(num2); //example when a seed is provided

        //but there is a chance that the same seed is randomly selected if we don't provide the seed
        //so we usually use system time in ms to provide a unique seed in every run, and thus ensuring no seed is re-selected

        Random random2 = new Random(System.currentTimeMillis()); //just like that

        int[] arr = new int[10];

        for(int i =0;i<arr.length;i++){
            arr[i] = 12 + random2.nextInt(244 +1 -12);
        }

        for(int n: arr){
            System.out.println(n);
        }

        System.out.println("hello this is just a separator");
        //die rolling experiment (i want to die) get it ? huh
        int simulation;
        final int COUNT = 6000000;
        Random die = new Random(System.currentTimeMillis());
        int[] counter = new int[7];

        for(int i = 0; i<COUNT;i++){
            simulation = die.nextInt(6)+1;
            counter[simulation]++;
        }

        for(int i =1;i<counter.length;i++){
            System.out.println("Number "+ i + " was rolled "+ counter[i]+ " times!");
        }
        // nobody in this class knows how to do it in this simple way, they all bad, so don't feel bad, it OK
        // but its not OK to give up
        // ur my hero Adel
        // boi why u sad ?
        // guess what? all of them student are of the same level so its fine
        // it should give u motivation to try and become better than them
        // we will talk after the lecture

        //enums

        //example : IT = 1, Engineering = 2, Business = 3,
        //we can do this
        final int it = 1;
        final int eng = 2;
        final int bus = 3;

        //some code later
        int college = 1;
        switch (college){
            case it: //do something
                break;
                //and so on
        }
        //but this is logically wrong because college can take any value other than 1,2,3
        //enums groups final variables and prevents them from taking values outside the range (not sure about this statement yet) (OK i am kinda sure now)
        /*
        enum COLLEGE {IT, Business, Engineering}; //idk why is it giving me an error but ok (i think i know but i am not sure yet "maybe because it has to be in a separate file")
        */


        College c;
        c = College.IT;
        //this will not allow c to take any other value than the ones we defined (we don't need to know how it is represented)
        //this helps in maintenance
        //if we want to add a new college we just modify the statement at line 98
        //usually enums are written and modified in a separate file
        //an enum has a method 'values' that shows available values
        System.out.println(c);
        for(College X: College.values()){
            System.out.println(X); //will print available values (IT, Business, Engineering) NOT actual values
        }

    }

    double avg(double a, double b){ //argument list length is 2 here
        return (a+b)/2;
    }

    double avg(double a, double b, double c){ //and 3 here
        return (a+b+c)/2;
    }

    // this is inefficient, solution is to use variable length argument list:

    double avg(double... args){ //name it whatever you want but usually it is 'args'
        //the ... is an array too, and we can replace it with [], the three dots are called 'ellipsis'
        // the size of the array depends on the number of sent elements
        //the method is called as usual
        //it must be at the end of the argument list
        //elements must be of the same type
        double sum = 0;

        for(int i =0;i<args.length;i++){
            sum += args[i];
        }

        return sum/args.length;
    }
    // check command line arguments
}


