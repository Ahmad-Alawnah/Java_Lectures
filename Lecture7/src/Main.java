public class Main {
    /** @see Test
     *
     */
    public static void main(String[] args) {
        //11/3/2020
        //java DOC and generics

        //this is a normal comment
        /* this is a normal
        multiline comment
         */
        // /** this is a javaDoc comment (includes notations (tags)) */
        //documentation is generated as an HTML file

        Test test  = new Test(5);
        fcn(1,2);
        fcn("Ahmad","Abdo");
        fcn(1,"A");

        //defining a generic object
        Tomato<Integer> tomato = new Tomato<>();
    }

    //hello this is a generic method:
    public static <T> void fcn(T x, T y){
        System.out.println(x);
        System.out.println(y);
    }
}
