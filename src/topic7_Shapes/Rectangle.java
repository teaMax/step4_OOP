package topic7_Shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

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
