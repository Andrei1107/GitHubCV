package exercies;

/*
Given two cells on the standard chess board,
determine whether they have the same color or not.
For cell1 = "A1" and cell2 = "C3", the output should be
chessBoardCellColor(cell1, cell2) = true
 */

import java.util.HashMap;
import java.util.Map;

public class ChessBoardCellColor {

    public static void main(String[] args) {

        System.out.println(chessBoardCellColor("H1", "H1"));
    }


    static boolean chessBoardCellColor(String cell1, String cell2) {

        int cellone = 0;
        int celltwo = 0;

        Map<Character, Integer> position = new HashMap<>();
        position.put('A', 0);
        position.put('B', 1);
        position.put('C', 2);
        position.put('D', 3);
        position.put('E', 4);
        position.put('F', 5);
        position.put('G', 6);
        position.put('H', 7);

        for (Map.Entry<Character, Integer> entry : position.entrySet()) {
            if (entry.getKey() == cell1.charAt(0)) {
                cellone = entry.getValue() + cell1.charAt(1);
            }
        }
        for (Map.Entry<Character, Integer> entry : position.entrySet()) {
            if (entry.getKey() == cell2.charAt(0)) {
                celltwo = entry.getValue() + cell2.charAt(1);
            }
        }
boolean one=cellone%2!=0;
boolean two=celltwo%2!=0;

        if(one ==two){
            return true;
        }else{
            return false;
        }


    }

}
