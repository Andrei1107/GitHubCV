package exercies;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AllLongestStrings {


    // Given an array of strings, return another array containing all of its longest strings.

    public static void main(String[] args) {
        String[] inputArray = {"aba",
                "aa",
                "ad",
                "vcd",
                "aba"};

        allLongestStrings(inputArray);
    }

  static   String[] allLongestStrings(String[] inputArray) {
        return Arrays.stream(inputArray)
                .filter(i->i.length()==IntStream.range(0,inputArray.length).map(j->inputArray[j].length())
                        .max().getAsInt()).toArray(String[]::new);}


}


