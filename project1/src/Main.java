import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Test.b = 6;
        Test t = new Test();
        t.b = 5;

        //Arrays
        int[] a; //array a = null
        a = new int[10]; //special syntax, no constructor, this reverses 10 elements

        int[] b = new int[10]; //will have default value (0 in this case)

        int a_length = a.length; //is a property that returns the number of elements in 'a' (very important)

        for(int i =0;i<a.length;i++){
            //do something
        }

        int[] c = {1,2,3,4,5}; // this is called array initializer, size will be = 5
        int[] d = new int[] {1,2,3,4,5,6,7}; //this is better (and more important)
        // this is useful when calling a function and passing an array with no name
        int sum = arraySum(d); //this is passing by its name
        System.out.println(sum);
        //int sum2 = arraySum({1,2,3,4}); this is wrong
        int sum2 = arraySum(new int[] {1,2,3,4}); //it is called an anonmouys array, it is stored temporarly in the memory and will be deleted after the function returns

        Test[] tlist = new Test[10]; //array of references (of objects), each element is a reference to a Test object (currently NULL)

        for(int i =0;i<tlist.length;i++){
            tlist[i] = new Test();
        }

        tlist[2].myFunction2(2);// will refer to the object which is referenced by the 3rd element in the array
        //if tlist[2] is not initialized, it will cause a runtime error (NullPointerException) "NPE"

        //enhanced for loop is used with collections
        for(int x: d){
            System.out.println(x);
            //x = 7; // wrong, cant modify elements
        }
        //will go through all elements (not part of the array)

        for(Test x: tlist){ //works the same with reference types
            //do something
        }

        //multidimentional arrays

        int[][] m = new int[3][3];

        System.out.println(m[1][1]);// first bracket is row number and 2nd is column number (0 based ofc)

        //each row can have a different number of columns:

        int[][] tomato = new int[3][]; //columns for each row is not specified yet
        tomato[0] = new int[5];
        tomato[1] = new int[7];
        //and so on

        for(int i =0;i<tomato.length;i++){
            for(int j = 0 ;j<tomato[i].length;j++){
                //dance
            }
        }
        //or:
        for(int[] x: tomato){
            for(int y: x){
                //cook some potatoes
            }
        }

    }
    //a method that returns 2D array
    public static int[][] func(){


        return new int[][] {{1,2,3},{1,2,3}}; //initializer list for a 2D array (2 rows, each has 3 elements)
    }

    public static int arraySum(int[] a){
        int s = 0;
        for(int i =0;i<a.length;i++){
            s+=a[i];
        }
        return s;
    }
}
