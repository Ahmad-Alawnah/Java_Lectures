//public classes are accessed by all classes in the same package
public class Test { //class names should be capitalized
    //all classes must have a constructOr (a default one is generated automatically)
    //default constructOrs take no parameters and initialize everything to their default values
    //it is different than a 'no argument constructor' because this is written by us, while the default is generated implicitly
    // if we write a constructor, the default one is discarded
    //IMPORTANT: REVIEW REUSING CONSTRUCTORS;
    private int x;
    public Test(int x){
        this.x = x;
    }

    public Test(){ //reusing constructors (important)
        this(69);
    }
    //we can overload methods within the class (duh)

    /* this is wrong because they have the same name and parameters
    public int fcn(){

    }
    public double fcn(){

    }
     */
    //order, type, number of parameters must be difference
    public int fcn2(int a, float b){


        return 0;
    }

    public int fcn2(long a, char b){

        //int x = a; // cant store a large value in a small one
        int x = (int)a; //solution? use type casting
        return 0;
    }
}
