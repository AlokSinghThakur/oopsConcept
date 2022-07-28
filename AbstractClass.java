//Java programm to illustrate that an instance of Abstract
//class can not be created

// Class 1
// Abstract class

abstract class Base{
    abstract void fun();
}

// Class 2
class Derived extends Base{
    void fun(){
        System.out.println("Derived fun() called");
    }
}

//Class 3
//Main class
public class AbstractClass {

    //Main Driver method
    public static void main(String[] args) {
        //we can have refernce of Base type
        Base b= new Derived();
        b.fun();
    }
}
