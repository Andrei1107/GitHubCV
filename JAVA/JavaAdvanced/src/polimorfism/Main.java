package polimorfism;

public class Main {


    public static void main(String[] args) {


        Shape shape = new Shape();
        shape.calculateArea();
        Shape rectangle = new Rectangle(2, 4);

        Shape square = new Square(2);

        Shape circle = new Circle(2);


        System.out.println("Geometric Array:");
        Shape[] geometricForms = {rectangle, square, circle};

        for (Shape s : geometricForms) {
            s.calculateArea();

        }


    }

}
