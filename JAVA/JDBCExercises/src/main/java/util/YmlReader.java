package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Properties;

public class YmlReader {



    public Properties readFile(Path path){
        Properties properties=new Properties();
        InputStream inputStream=null;

try{
inputStream=new FileInputStream(path.toFile());
    properties.load(inputStream);

}catch (IOException e){
    e.printStackTrace();
}

return properties;
    }


}
