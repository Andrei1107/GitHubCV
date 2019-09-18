package exercies;

public class isLucky {


    /*
    Ticket numbers usually consist of an even number of digits.
     A ticket number is considered lucky if the sum of the first half
     of the digits is equal to the sum of the second half.
     */
    public static void main(String[] args) {
        System.out.println(isLucky(1230));
    }

  static   boolean isLucky(int n) {

        int second = n % 100;
        int first = n / 100;
        int secondSum = 0, firstSum = 0;

        while(first!= 0) {
            firstSum+=first%10;
            first=first/10;

        }

        while(second!= 0) {
            secondSum+=second%10;
            second=second/10;

        }
        if(n > 99999){
            int secondd = n % 1000;
            int firstt = n / 1000;
            int secondSumm = 0, firstSumm = 0;
            while(firstt!= 0) {
                firstSumm+=firstt%10;
                firstt=firstt/10;

            }

            while(secondd!= 0) {
                secondSumm+=secondd%10;
                secondd=secondd/10;

            }
            if(firstSumm==secondSumm){
                return true;
            }else{
                return false;
            }


        }else if(n<100){

            int seccond = n % 10;
            int firrst = n / 10;
            int seconddSum = 0, firsttSum = 0;

            while(firrst!= 0) {
                firsttSum+=firrst%10;
                firrst=firrst/10;

            }

            while(seccond!= 0) {
                seconddSum+=seccond%10;
                seccond=seccond/10;

            }
            if(firsttSum==seconddSum){
                return true;

            }else {
                return false;
            }


        }

        if (firstSum == secondSum ) {
            return true;
        } else {
            return false;
        }


    }
}
