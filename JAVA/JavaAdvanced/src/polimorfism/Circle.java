package polimorfism;

public class Circle extends  Shape {

   double r;
    static double pi=3.14;

    public Circle(int r){
        this.r=r;
    }


    public void calculateArea(){
        System.out.println("Area of circle: "+pi*(r*r));

    }

}
