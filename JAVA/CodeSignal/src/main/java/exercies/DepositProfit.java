package exercies;

public class DepositProfit {


    public static void main(String[] args) {
        System.out.println(depositProfit(100,20,170));
    }

 static    int depositProfit(int deposit, int rate, int threshold) {
        int years=0;

        while(deposit < threshold){
            deposit+=deposit*rate/100;
            years++;
        }
        return years;
    }



}
