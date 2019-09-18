package exceptions;

public class SumCalculator {




    public  int sum(int a, int b) throws InvalidNumbersExceptions {

        if (a > 0 && b > 0) {
            return a + b;
        } else {
            throw new InvalidNumbersExceptions("Numbers aren't greater than 0");
        }


    }



    public void calculateSum(int a ,int b){
        int sum=0;

        try{
            sum=sum(a,b);
        }catch (InvalidNumbersExceptions | NullPointerException e){
            e.printStackTrace();
        }
        System.out.println(sum);

    }












}
