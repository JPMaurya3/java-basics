// parent interface
interface Animal{
    void sleep();
    void eat();
}

// sub interface
interface Birds extends Animal{
    void fly();
}
// class implementing sub interface 
class Sparrow implements Birds{
    @Override
    public void eat(){
        System.out.println("Sparrow is eating");
    }
    public void fly(){
        System.out.println("Sparrow is flying");
    }
    public void sleep(){
        System.out.println("Sparrow is sleeping in the nest");
    }
}

public class SubInterface {

    public static void main(String[] args){
        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.fly();
        sparrow.sleep();
    }
}