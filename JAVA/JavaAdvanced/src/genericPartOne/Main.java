package genericPartOne;

public class Main {

    public static void main(String[] args) {

        Ball ball=new Ball(10);

        Box<Ball> box=new Box<>(ball);


        Ball newBall=box.getItem();

        Airplane airplane=new Airplane(100);
        Airplane airplane2=new Airplane(500);


        if(airplane.compareTo(airplane2) >0){
            System.out.println("Airplane 1 > Airplane2");
        }
        if(airplane.compareTo(airplane2) ==0){
            System.out.println("Airplane 1 == Airplane2");
        }
        if(airplane.compareTo(airplane2) <0){
            System.out.println("Airplane 1 < Airplane2");
        }

//        Box<Airplane> airplaneBox=new Box(ball);
//        Airplane airplane3=airplaneBox.getItem();
        //System.out.println(airplane3);

//        System.out.println(newBall);


    }
    

}
