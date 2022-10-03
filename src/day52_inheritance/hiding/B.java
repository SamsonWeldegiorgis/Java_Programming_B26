package day52_inheritance.hiding;

public class B extends A{

    @Override
    public void instanceMethodA() {
        super.instanceMethodA();
    }
    // @override ... we cannot overide the static methods, but we can declare this method and the static method from the parent class will become hidden

    public static void staticMethod(){
        System.out.println("Static method from the CHILD Class");
    }
}
