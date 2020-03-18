public class Test implements Comparable<Test> {

    /**
     * this class is a test class
     */


    int x;

    /**
     * @param x a number
     */
    public Test(int x) {
        this.x = x;

    }

    /**
     * hello hi how r u
     *
     * @return x this is the getter
     */
    public int getX() {
        return x;
    }


    @Override
    public int compareTo(Test o) {
        return 0;
    }
}
