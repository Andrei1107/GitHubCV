package exercies;

public class Exercise2 {

    /*

    You are given an n x n 2D matrix that
    represents an image. Rotate the image by 90 degrees clockwise

     */


    public static void main(String[] args) {

int [][] a={{1,2,3},{4,5,6},{7,8,9}};

for(int i=0;i<3;i++) {
    for (int j = 0; j < 3; j++) {
        System.out.print(" " + a[i][j]);

    }
    System.out.println(" ");
}


        System.out.println("  ");

rotateImage(a);




}





    public static int[][] rotateImage(int[][] a){

        int totalRowsofRotatedMatrix=a[0].length; //total columns of original matrix
        int totalColsOfRotatedMatrix=a.length;  //total rows of original matrix

        int [][] rotatedMatrix=new int[totalRowsofRotatedMatrix][totalColsOfRotatedMatrix];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                rotatedMatrix[j][ (totalColsOfRotatedMatrix-1)- i] = a[i][j];
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(" "+rotatedMatrix[i][j]);
            }
            System.out.println(" ");
        }


return rotatedMatrix;
    }




}
