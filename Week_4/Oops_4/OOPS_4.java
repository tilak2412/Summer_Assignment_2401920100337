// Interface
interface Test {
    void square(int n);
}

// Implementing class
class Arithmetic implements Test {

    @Override
    public void square(int n) {
        System.out.println("Square of " + n + " = " + (n * n));
    }
}

// Main class
public class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        obj.square(5);
    }
}

class Outer {

    void display() {
        System.out.println("Display method of Outer class");
    }

    class Inner {

        void display() {
            System.out.println("Display method of Inner class");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.display();

        Outer.Inner in = obj.new Inner();
        in.display();
    }
}

class Point {

    private int x;
    private int y;

    // Default constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {

        Point p1 = new Point();
        p1.display();

        Point p2 = new Point(10, 20);
        p2.display();

        p2.setX(30);
        p2.setY(40);
        p2.display();

        p2.setXY(50, 60);
        p2.display();
    }
}

// Base class
class Box {

    protected double length;
    protected double breadth;

    // Constructor
    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Area of rectangle
    public double area() {
        return length * breadth;
    }
}

// Derived class
class Box3D extends Box {

    private double height;

    // Constructor
    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    // Volume
    public double volume() {
        return length * breadth * height;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Box box = new Box(10, 5);
        System.out.println("Area = " + box.area());

        Box3D box3d = new Box3D(10, 5, 4);
        System.out.println("Area = " + box3d.area());
        System.out.println("Volume = " + box3d.volume());
    }
}

