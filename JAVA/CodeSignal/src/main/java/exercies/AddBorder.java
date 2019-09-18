package exercies;

import java.lang.reflect.Array;

public class AddBorder {

    /*
    Given a rectangular matrix of characters,
     add a border of asterisks(*) to it.
     */

    public static void main(String[] args) {

        String picture[] = new String[]{"abc", "ded"};
        System.out.println(addBorder(picture));

    }

static     String[] addBorder(String[] picture) {
        String[] framePicture = new String[picture.length + 2];
    for(int i=0;i<picture.length;i++){
        framePicture[i+1]='*' +picture[i]+'*';
    }
    framePicture[0]=framePicture[picture.length+1]=framePicture[1].replaceAll(".","*");

        return framePicture;
    }


}
