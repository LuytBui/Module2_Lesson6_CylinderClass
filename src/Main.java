public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.printf("Area: %.2f\n", c1.getArea());
        Circle c2 = new Circle(2, "blue");
        System.out.println(c1);
        System.out.printf("Area: %.2f\n", c2.getArea());

        Cylinder cy1 = new Cylinder(4);
        cy1.setColor("red");
        System.out.println(cy1);
        System.out.printf("Area: %.2f\n", cy1.getArea());
        System.out.printf("Volume: %.2f\n", cy1.getVolume());

    }
}
