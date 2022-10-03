package day51_inheritance.shapes;

public class Square extends Shape{

    double side;

    public Square (double side){
        super("Square");
        this.side=side;

    }

    @Override    // helps to tell us if we make methods correctly
    public double area () {
        return side * side ; // we changed the way it should do...this is Overridding
        // and we replaced the method of toString by area
    }

    @Override
    public double perimeter() {
        return side * 4 ;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", side=" + side +
                '}';
    }
}
