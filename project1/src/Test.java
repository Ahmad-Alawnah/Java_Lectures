public class Test {
   /* private int a = 10;
    public static void myFunction(int x){
        a = 15; //this is wrong because we access a non-static member in a static member, a is created via an object
    }*/

    //the opposite is correct

    public static int b = 10;

    public void myFunction2(int x){
        b = 10;
    }

    //class level members should be static (members used by all objects)
}
