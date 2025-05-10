package topic7_Shapes;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape cicle = new Cicle(3.3);
        double cicleArea = cicle.getArea();
        double ciclePerimeter = cicle.getPermieter();

        System.out.println("Площадь окружности: " + cicleArea + " \nПериметр окружности: " + ciclePerimeter);

        Shape rectangle = new Rectangle(3.5, 8.8);
        double rectangleArea = rectangle.getArea();
        double rectanglePermieter = rectangle.getPermieter();
        System.out.println("Площадь прямоугольника: " + rectangleArea + " \nПериметр прямоугольника: " + rectanglePermieter);
    }
}
