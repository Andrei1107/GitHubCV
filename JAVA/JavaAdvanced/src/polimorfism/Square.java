package polimorfism;

public class Square extends Shape {

    int lat;

    public Square(int lat){
        this.lat=lat;
    }

    public void calculateArea(){
        System.out.println("Aria of square: "+ lat*lat);
    }


}
