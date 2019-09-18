package exercies;

public class CenturyFromYear {


    /*
    Given a year, return the century it is in.
    The first century spans from the year 1 up to and including the year 100,
     the second - from the year 101 up to and including the year 200, etc.

     */

    public static void main(String[] args) {

        System.out.println(centuryFromYear(1101));


    }


    public static int centuryFromYear(int year) {

        if (year < 1 || year > 2005) {
            System.out.println("Enter the year between 1 and 2005!!!");
        } else if ((year % 100) != 0) {
            return (year / 100) + 1;
        } else if ((year % 100) == 0) {
            return (year / 100);
        }

        return 0;
    }


}
