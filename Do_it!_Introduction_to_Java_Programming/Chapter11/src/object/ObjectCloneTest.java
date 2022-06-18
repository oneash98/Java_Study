package object;

class Circle implements Cloneable {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(1);
        Circle circle2 = (Circle)circle1.clone();

        System.out.println(circle1);
        System.out.println(circle2);
    }
}