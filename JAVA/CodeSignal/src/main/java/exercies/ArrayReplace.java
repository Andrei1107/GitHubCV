package exercies;

public class ArrayReplace {

    public static void main(String[] args) {

        int[] input={1,2,3,4,5};
        System.out.println(arrayReplace(input,3,0));
    }


  static   int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {

        for(int i=0;i<inputArray.length;i++){
        if(inputArray[i]==elemToReplace){
            inputArray[i]=substitutionElem;
        }

        }

        for(int i=0;i<inputArray.length;i++){
            System.out.println(inputArray[i]);
        }


        return inputArray;
    }

}
