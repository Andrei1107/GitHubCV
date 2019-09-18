package exercies;

//Check if all digits of the given integer are even.


public class EvenDigitsOnly {

    public static void main(String[] args) {

        System.out.println(evenDigitsOnly(3468));
    }

  static boolean evenDigitsOnly(int n) {
            int a=0;


      int[]digits = Integer.toString(n).chars().map(c -> c-'0').toArray();
      for(int d:digits){
          if(d%2 != 0){
              a++;
          }
      }
            if(a>0){
                return false;
            }else{
                return true;
            }


    }



}
