package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        List<Integer> listaNumere = new ArrayList<>();
        listaNumere.add(10);
        listaNumere.add(11);
        listaNumere.add(50);
        listaNumere.add(43);
        listaNumere.add(32);
        listaNumere.add(19);


        for (int i = 0; i < listaNumere.size(); i++) {
            System.out.println(listaNumere.get(i));
        }
        System.out.println("FOR:EACH");


        for (Integer i : listaNumere) {
            System.out.println(i);
        }

        System.out.println("Parcurgere cu ITERATOR");

        Iterator<Integer> itr = listaNumere.iterator();
        while (itr.hasNext()) {            //has next intoarce True daca exista un element dupa
            System.out.println(itr.next());
        }

        System.out.println(listaNumere);  //lista.toString,


        //remove
        listaNumere.remove(0);

        System.out.println(listaNumere);

        try {
            listaNumere.remove(6);
        } catch (Exception e) {
            System.err.println(e);

        }
        System.out.println(listaNumere);

//Remove
        for (int i = 0; i < listaNumere.size(); i++) {
            if (listaNumere.get(i) == 50) {
                listaNumere.remove(i);
            }
        }
        System.out.println(listaNumere);


        itr = listaNumere.iterator();//daca nu ii dau referinta asta,el era la capatul listei din iteratiile anterioare,cu referinta il pozitionez la inceput
        while (itr.hasNext()) {
            if (itr.next() == 11) {
                itr.remove();
            }
        }

        System.out.println(listaNumere);


        List<Integer> listaInlantuita = new LinkedList<>();
//e foarte rapida la eliminarea si adaugarea elementelor
// pt ca se sterge referinta catre elementul care se sterge

        listaInlantuita.add(100);
        listaInlantuita.add(147);
        listaInlantuita.add(65);
        listaInlantuita.add(204);
        listaInlantuita.add(87);

        System.out.println(listaInlantuita);


        listaNumere.addAll(listaInlantuita); //adauga toate elementele din listaInlantuita//concatenare :)
        System.out.println("Lista concatenata" + listaNumere);


        if (listaNumere.contains(100)) {
            System.out.println("Exista 100 ");
        }


        List<Integer> lista = new ArrayList<>();
        lista.addAll(listaNumere);
        System.out.println(lista);
        List<Integer> pare = new ArrayList<>();
        List<Integer> impare = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (listaNumere.get(i) % 2 == 0) {
                pare.add(listaNumere.get(i));
            } else {
                impare.add(listaNumere.get(i));
            }

        }

        System.out.println("Impare: " + impare);
        System.out.println("Pare:" + pare);

        int sum = 0;
        for (int i = 0; i < pare.size(); i++) {
            sum += pare.get(i);

        }


        System.out.println("Suma elem. pare :" + sum);


////////////////////////////////SET////////////////////////(multime)
        //nu poti avea duplicate
        //este neordonat


        Set<String> multime = new HashSet<>();

        multime.add("Unu");
        multime.add("Doi");
        multime.add("Trei");
        multime.add("Patru");
        multime.add("Cinci");
        multime.add("Unu");

        Iterator<String> iterSet = multime.iterator();
        while (iterSet.hasNext()) {
            System.out.println(iterSet.next());

        }

//Collections =defineste metode statice ce pot ajuta in prelucrare(clasa parinte pentru Map,Set,List

        Collections.sort(listaNumere);
        Collections.sort(lista);
//       Collections.sort(multime); //nu pote sorta setul
        System.out.println("Lista sortata : " + lista);


//**********//HashMap//*************
        // asociere intre key->value
        //cheia este Integer ,iar valoarea String
        //put e add
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Pateu");
        hashMap.put(2, "Branza");
        hashMap.put(3, "Rosii");
        hashMap.put(4, "Castraveti");


        System.out.println(hashMap.get(3));


        //hash-ul (se foloseste in criptografie)
        //


        Map<Long, String> hashAngajat = new HashMap<>();
        Angajat angajat1 = new Angajat(1, "Ionescu ciprian", "IT", true);

        Angajat angajat2 = new Angajat(2, "Popescu Ionel", "Marketing", false);
        Angajat angajat3 = new Angajat(3, "Harbuz Viorel", "Contabilitate", false);

        hashAngajat.put(angajat1.getId(), angajat1.getNume());
        hashAngajat.put(angajat2.getId(), angajat2.getNume());
        hashAngajat.put(angajat3.getId(), angajat3.getNume());

        //System.out.println(hashAngajat);


        for (Map.Entry<Long, String> entry : hashAngajat.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


        Map<String, Angajat> hash = new HashMap<>();
        hash.put(angajat1.hash(), angajat1);
        hash.put(angajat2.hash(), angajat2);


        for (Map.Entry<String, Angajat> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue().getNume()+entry.getValue().getDepartament());
        }







    }


}
