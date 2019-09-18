package exercies;

public class ReverseInParentheses {
    /*
    Write a function that reverses characters
    in (possibly nested) parentheses in the input string.
     */


    public static void main(String[] args) {

        String inputString = "Salut(abc)co(nt)(RO)(BG)";
         System.out.println("  " + reverseInParentheseS(inputString));

        // System.out.println(withoutParentheses(inputString));
        // countParentheses(inputString);

        //countPairs(inputString);
      //  System.out.println(countPairs(inputString));

    }


    static String reverseInParentheseS(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while(str.indexOf("(") != -1){
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);
            str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
        }
        return str.toString();
    }

    //eliminate Parentheses
    static String withoutParentheses(String input) {

        StringBuilder str = new StringBuilder(input);
        int start, end;

        while (str.indexOf("(") != -1) {
            start = str.indexOf("(");
            end = str.indexOf(")", start);

            str.replace(start, end + 1, new StringBuilder(str.substring(start + 1, end)).toString());

        }

        return str.toString();

    }

//count '(',')' and group of ()

    static int countParentheses(String inputString) {
        char[] input = new char[inputString.length()];
        input = inputString.toCharArray();
        int leftP = 0;
        int rightP = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '(') {
                leftP++;
            } else if (input[i] == ')') {
                rightP++;
            }
        }
        System.out.println("In string exist " + leftP + " (" + " and " + rightP + " )");

        return 0;
    }


    //countPairs

    static int countPairs(String inputString) {

        StringBuilder str = new StringBuilder(inputString);
        int k = 0;
        char[] pharentheses = new char[15];
        char[] newChar = inputString.toCharArray();

        for (int t = 0; t < newChar.length; t++) {
            if (newChar[t] == '(' || newChar[t] == ')') {

                pharentheses[k] += newChar[t];
                k++;
            }
        }
        int NoOfPairs = 0;
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < i + 2; j++) {
                if (pharentheses[i] == '(' && pharentheses[j] == ')') {
                    NoOfPairs++;
                }
            }

        }


        return NoOfPairs;
    }


}
