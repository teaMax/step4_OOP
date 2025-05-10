package topic7_Shapes;

public class Cicle extends Shape{
    private double radius;

    public Cicle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPermieter() {
        return 2 * Math.PI * radius;
    }
}
