class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Cuboid {
    private Rectangle rectangle;
    private double height;

    public Cuboid(Rectangle rectangle, double height) {
        this.rectangle = rectangle;
        this.height = height;
    }

    public double getVolume() {
        return rectangle.getArea() * height;
    }
}

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Cuboid cuboid = new Cuboid(rectangle, 20);
        System.out.println("矩形的面积为：" + rectangle.getArea());
        System.out.println("长方体的体积为：" + cuboid.getVolume());
    }
}