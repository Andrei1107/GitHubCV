package exercies;

public class Exercise5 {

    /*
    You are given a string.
    Remove its first and last characters until the string is empty or the first and the last characters are not equal.
    Output the resulting string.
     */


    public static void main(String[] args) {

        //reduceString("abaaba");


        System.out.println(reduceString("abaaba"));

    }
    //Nu e terminat


    public static String reduceString(String inputString) {

        StringBuilder sb = new StringBuilder(inputString);

        String result;

        for (int k = 0; k < sb.length(); k++) {
            for (int i = 0; i < k; i++) {
                for (int j = sb.length() - 1; j < sb.length(); j++) {
                    if (sb.charAt(i) == sb.charAt(j)) {
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(sb.length() - 1);

                    } else {
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(j);

                    }
                }
            }
        }


        result = sb.toString();

        return result;
    }


}
