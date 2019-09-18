package exercies;

/*
Last night you partied a little too hard.
Now there's a black and white photo of you that's about to go viral!
 You can't let this ruin your reputation,
 so you want to apply the box blur algorithm to the photo to hide its content.

The pixels in the input image are represented as integers.
 The algorithm distorts the input image in the following way:
  Every pixel x in the output image has a value equal to the
  average value of the pixel values from the 3 × 3 square that
   has its center at x, including x itself. All the pixels on
   the border of x are then removed.

Return the blurred image as an integer, with the fractions rounded down.
 */


public class BoxBlur {


    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 7, 1}, {1, 1, 1}};
        System.out.println(boxBlur(matrix));

    }


    static int[][] boxBlur(int[][] image) {
        int[][] result = new int[image.length - 2][image[0].length - 2];

        for (int y = 1; y < image.length - 1; y++) {
            for (int x = 1; x < image[0].length - 1; x++) {
                result[y - 1][x - 1] = calculateAvgValue(x, y, image);
            }
        }

        return result;
    }

    static int calculateAvgValue(int x, int y, int[][] image) {
        int avg = 0;
        for (int i = y - 1; i <= y + 1; i++) {
            for (int j = x - 1; j <= x + 1; j++) {
                avg += image[i][j];
            }
        }
        return avg / 9;
    }

}




