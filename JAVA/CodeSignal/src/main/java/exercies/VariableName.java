package exercies;

/*
Correct variable names consist only of English letters,

 digits and underscores and they can't start with a digit.

Check if the given string is a correct variable name.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableName {


    public static void main(String[] args) {


        System.out.println(variableName("1aaaaaa"));
    }

    //8Andrreiii=ii^ii%ii@iii,ii/i;ii<ii>ii.ii!ii#iii+ii-ii)ii(ii]ii[iiii&iiiiiiiiiiiii1

    //   [)($-/:-?{-~!"^`\[\]@#<>" ""+\s]

    // ^[\d]
    static boolean variableName(String name) {
        String regex = "[)($-/:-?{-~!\"^`\\[\\]@#<>\" \"\"+\\s ]";

        Pattern pattern = Pattern.compile(regex);
        Pattern pattern1=Pattern.compile("^[\\d]");
        Matcher matcher = pattern.matcher(name);
        Matcher matcher1=pattern1.matcher(name);
        boolean exist2=matcher1.find();
        boolean exist=matcher.find();

       return  !exist && !exist2;


    }


}
