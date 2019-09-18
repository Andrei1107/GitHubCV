package delete;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Superior superior = new Superior();
        Superior superior2 = new Superior();
        Subaltern subaltern = new Subaltern();
        Subaltern subaltern2 = new Subaltern();
        Map<Superior, Subaltern> angajati = new HashMap<>();


        String stop = "stop";
        String enter = "";
        String[] result;
        while (!enter.equals(stop)) {
            System.out.println("Superior[Nume+prenume] + subaltern[nume+prenume]");
            enter = scanner.nextLine();
            result = enter.split(" ");
            if (!enter.equals(stop) && angajati.isEmpty()) {
                superior.setNume(result[0]);
                superior.setPrenume(result[1]);
                subaltern.setNume(result[2]);
                subaltern.setPrenume(result[3]);

                angajati.put(superior, subaltern);
            } else if (!angajati.isEmpty() && !enter.equals(stop)) {
                superior2.setNume(result[0]);
                superior2.setPrenume(result[1]);

                subaltern2.setNume(result[2]);
                subaltern2.setPrenume(result[3]);


                angajati.put(superior2, subaltern2);
            }

        }

        for (Map.Entry<Superior, Subaltern> entry : angajati.entrySet()) {
            System.out.println(entry.getKey().getNume() + " " +
                    entry.getKey().getPrenume() + "  " + entry.getValue().getNume() + "  " + entry.getValue().getPrenume());

        }


        JsonUtils.writeMaptoJsonFile(angajati,"angajati.json");


    }


}



