package filesInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //de facut uppercase vocalele din fisier si de creat un nou fisier cu noile stringuri
    //GIT


    public static void main(String[] args) throws IOException {

        Path absolutePath = Paths.get("D:\\fisierJavaIO\\a.txt");

        System.out.println(Files.readAllLines(absolutePath));
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

//List<String> newList=new ArrayList<>();
//
//
//
//        try{
//            List<String> file=Files.readAllLines(absolutePath);
//
//         for(String s:file){
//
//             System.out.println(s);
//
//             //metoda pe git
//         }
//
//
//
//
//        }catch (IOException e){  //
//            e.printStackTrace();
//        }
//


        //Try with resources=inchide resursele pe care le folosesti[AutoClosable])

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\oprea\\OneDrive\\Desktop\\Java\\JavaAdvanced\\src\\resources\\b.txt"))) {

            String file;
            while ((file = bufferedReader.readLine()) != null) {
                System.out.println(file);
            }


        }









    }


}
