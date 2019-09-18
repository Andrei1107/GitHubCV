package exercies;


/*
An IP address is a numerical label assigned to each device
(e.g., computer, printer) participating in a computer network that uses the Internet Protocol
 for communication. There are two versions of the Internet protocol,
  and thus two versions of addresses. One of them is the IPv4 address.

Given a string, find out if it satisfies the IPv4 address naming rules.
 */


import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsIPv4Adress {

    public static void main(String[] args) {
        String input = "256.255.255.0";
        System.out.println(isIPv4Address(input));

    }

    static boolean isIPv4Address(String inputString) {

        String[] abcd = new String[4];
        int result = 0;

        abcd = inputString.split("\\.");

        int[] parse = new int[4];

        String regex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);


        boolean isFind = matcher.find();
        boolean isToLarge=abcd.length> 4;
        boolean inputToLarge=abcd.length<4;

        boolean isToSmall=inputString.length() < 4;

        if (isFind || isToLarge || isToSmall || inputToLarge) {
            return false;
        }

for(int i=0;i<abcd.length;i++){
    if(abcd[i].toCharArray().length >3){
        result++;
    }
}
if(result >0){
    return false;
}
        for (int i = 0; i < abcd.length; i++) {
            if (!abcd[i].equals("")) {
                parse[i] = Integer.parseInt(abcd[i]);
            } else {
                return false;
            }
        }


        for (int i = 0; i < parse.length; i++) {
            if (parse[i] < 0 || parse[i] > 255) {
                result++;
            }
        }
        if (result > 0 ) {
            return false;
        } else {
            return true;
        }


    }


}
