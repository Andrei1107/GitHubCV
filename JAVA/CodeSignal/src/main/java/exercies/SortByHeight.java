package exercies;

public class SortByHeight {

    /*
    Some people are standing in a row in a park. There are trees between them which cannot be moved.
     Your task is to rearrange the people by their heights
      in a non-descending order without moving the trees. People can be very tall!
     */
    public static void main(String[] args) {

        int [] height={-1, 150, 190, 170, -1, -1, 160, 180};
        sortByHeight(height);

    }
 static    int[] sortByHeight(int[] a) {

        int t;

        for(int i=0; i<a.length; i++)
            for(int j=i+1; j<a.length; j++)
                if(a[i]>a[j] && a[i]!=-1 && a[j]!=-1) {

                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }

        return a;
    }

}
