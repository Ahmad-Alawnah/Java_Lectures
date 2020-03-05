public interface Payable {
    //by default all methods are public and abstract, so no need to type it
    void pay (double amount);
    void deduct (double amount);
    void bonus (double amount);

}
