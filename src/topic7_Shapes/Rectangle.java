package topic7_Shapes;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    @Override
    public double getArea() {
        return width * height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPermieter() {
        return 2 * (width + height);
    }
}
