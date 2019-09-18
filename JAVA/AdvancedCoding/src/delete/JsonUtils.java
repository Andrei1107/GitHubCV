package delete;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


import com.sun.xml.internal.bind.api.TypeReference;
import jdk.nashorn.internal.parser.JSONParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.json.JSONArray;

public class JsonUtils {

    public static void writeMaptoJsonFile(Map<Superior, Subaltern> angajati, String filename) {

        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();


        for (Map.Entry<Superior, Subaltern> entry : angajati.entrySet()) {


            JSONObject temporar = new JSONObject();

            temporar.put("Subalterni", entry.getValue().getNume() + " " + entry.getValue().getPrenume());
            temporar.put("Superiori", entry.getKey().getNume() + "   " + entry.getKey().getPrenume());
            jsonArray.put(temporar);

        }

        jsonObject.put("Angajati", jsonArray);

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(filename))) {
            bf.write(jsonObject.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void jsonParser(){

     ObjectMapper objectMapper=new ObjectMapper();

     String pathname="C:\\Users\\oprea\\Desktop\\Java\\AdvancedCoding\\angajati.json";

     Path path= Paths.get(pathname);

     try{

         Map<String,Object> angajatiMap=objectMapper.readValue(new File(pathname),
                 new TypeReference<Map<String,Object>>(){

                 });
     }

    }





}