package day54_abstraction.Shopping;

public final class Target extends Shopping  {

    @Override
    public void buyItem() {
        System.out.println("Buy always from Target ");
    }

    @Override
    public void returnItem() {
        System.out.println("Return always to Target ");

        // b/s it is final we can NOT inherit.....


    }
}
