package polimorfism;

public class Rectangle extends  Shape{

    int l, L;


    public Rectangle(int lungime,int latime){

        this.l=lungime;
        this.L =latime;


    }
    public void calculateArea(){
        System.out.println("Aria of rectangle: "+l* L);


    }




}
