import java.util.*;

public class UserInterface {

    public static void main(String[] args) {

        Controller();
    }

    public static void Controller() {
        Scanner scanner = new Scanner(System.in);

        int choise;


        System.out.println("1.Adauga o carte in biblioteca");
        System.out.println("2.Sterge o carte din biblioteca");
        System.out.println("3.Afiseaza toate cartile din biblioteca");
        System.out.println("4.Imprumuta o carte");
        System.out.println("5.Cauta o carte");
        System.out.println("6.Registru");
        System.out.println("0-Iesiti");
        System.out.println("Selectati o optiune");
        choise = 4000;
        int idCarte;
        char choise2 = ' ';
        char choise3 = ' ';

        while (choise != 0) {
            choise = scanner.nextInt();

            switch (choise) {

                case 1:
                    System.out.println("Adaugati o carte in biblioteca:");
                    adaugaOCarte();
                    break;
                case 2:
                    stergeCarteInterfata();
                    choise2 = scanner.next().charAt(0);

                    switch (choise2) {

                        case 'a':
                            stergeDupaId();

                            break;
                        case 'b':
                            stergeDupaNumeCarte();
                            break;

                        case 'c':
                            stergeDupaEditura();
                            break;

                        case 'd':

                            stergeDupaAutor();
                            break;

                    }

                    break;

                case 3:
                    afiseazaCartile();
                    break;

                case 4:
                    imprumutaCarte();
                    break;

                case 5:
                    cautaCarteInterfata();
                    choise3 = scanner.next().charAt(0);
                    switch (choise3) {

                        case 'a':
                            cautaCarteDupaAutor();
                            break;
                        case 'b':
                            cautaCarteDupaCategorie();
                            break;

                        case 'c':
                            cautaCarteDupaEditura();
                            break;

                        case 'd':
                            cautaCarteDupaNume();
                    }

                    break;

                case 6:
                    registru();

                    break;

                default:
                    System.out.println("Selectati o optiune valida!!");
            }

        }

    }

    private static void stergeDupaEditura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti editura:");
        String editura = scanner.nextLine();
        DAOBiblioteca.stergeDupaEditura(editura);
        Controller();
    }


    private static void stergeCarteInterfata() {
        System.out.println("Stergeti cartea dupa:");
        System.out.println("a.ID");
        System.out.println("b.Numele cartii");
        System.out.println("c.Numele editurii");
        System.out.println("d.Numele autorului");
        System.out.println("Alegeti o varianta:");
    }


    public static void adaugaOCarte() {
        Scanner scanner = new Scanner(System.in);
        int nrExemplare;
        String input;
        DAOBiblioteca daoBiblioteca = new DAOBiblioteca();
        Carte carte = new Carte();


        System.out.println("Numele cartii:");
        input = scanner.nextLine();
        carte.setNumeCarte(input);
        System.out.println("Autorul:");
        input = scanner.nextLine();
        carte.setAutor(input);
        System.out.println("Categoria:");
        input = scanner.nextLine();
        carte.setCategorie(input);
        System.out.println("Editura:");
        input = scanner.nextLine();
        carte.setEditura(input);
        System.out.println("Numar exemplare:");
        nrExemplare = scanner.nextInt();
        carte.setNrExemplare(nrExemplare);
        daoBiblioteca.createBook(carte);
        Controller();
    }


    public static void stergeDupaAutor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele autorului:");
        String autor = scanner.nextLine();

        DAOBiblioteca daoBiblioteca = new DAOBiblioteca();
        daoBiblioteca.stergeDupaAutor(autor);
        Controller();
    }

    public static void stergeDupaNumeCarte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele cartii:");
        String numecarte = scanner.nextLine();
        DAOBiblioteca.StergeDupaNumeCarte(numecarte);
        Controller();
    }


    public static void stergeDupaId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id-ul cartii:");
        Long id = scanner.nextLong();
        DAOBiblioteca.stergeDupaId(id);
        Controller();
    }

    public static void afiseazaCartile() {
        List<Carte> carti = DAOBiblioteca.afiseazaToateCartile();

        System.out.println("Cartile aflate in biblioteca sunt :");
        System.out.println(" ID         AUTOR                        NUME        CATEGORIE          EDITURA           EXEMPLARE");

        for (Carte c : carti) {
            if ((c.getAutor().length() > 15) || (c.getNumeCarte().length() > 15)) {

                System.out.println(" " + c.getBookId() + "     " + c.getAutor() + "     " + c.getNumeCarte() +
                        "     " + c.getCategorie() + "             " + c.getEditura() + "                " + c.getNrExemplare());
            } else {
                System.out.println(" " + c.getBookId() + "       " + c.getAutor() + "                 " + c.getNumeCarte()
                        + "      " + c.getCategorie() + "      " + c.getEditura() + "                 " + c.getNrExemplare());
            }
        }


        //Controller();
    }

    public static void registru() {
        int nrEditura = 0;
        Map<String, Integer> edituri = new HashMap<String, Integer>();
        Map<String, Integer> autori = new HashMap<String, Integer>();
        List<Carte> carti = DAOBiblioteca.afiseazaToateCartile();


        for (Carte c : carti) {
            Integer j = edituri.get(c.getEditura());
            edituri.put(c.getEditura(), (j == null) ? 1 : j + 1);

        }
        System.out.println("*******REGISTRU**********");
        for (Map.Entry entry : edituri.entrySet()) {
            System.out.println("Sunt " + entry.getValue() + " carti de la editura " + entry.getKey());
        }
        System.out.println("**************************");

        for (Carte c : carti) {
            Integer j = autori.get(c.getAutor());
            autori.put(c.getAutor(), (j == null) ? 1 : j + 1);
        }
        for (Map.Entry entry : autori.entrySet()) {

            System.out.println("Sunt " + entry.getValue() + " carti de la autorul " + entry.getKey());

        }


        Controller();

    }

    public static void cautaCarteInterfata() {

        System.out.println("Cauta cartea dupa:");
        System.out.println("a.Autor");
        System.out.println("b.Categorie");
        System.out.println("c.Editura");
        System.out.println("d.Numele cartii");


    }

    public static void cautaCarteDupaAutor() {
        String autor;
        Scanner scanner = new Scanner(System.in);
        List<Carte> carti = DAOBiblioteca.afiseazaToateCartile();
        System.out.println("Introduceti numele autorului");
        autor = scanner.nextLine();

        for (int i = 0; i < carti.size(); i++) {
            if (carti.get(i).getAutor().contains(autor)) {
                System.out.println(" " + carti.get(i).getBookId() + "     " + carti.get(i).getAutor() + "     " + carti.get(i).getNumeCarte() +
                        "     " + carti.get(i).getCategorie() + "             " + carti.get(i).getEditura() + "                " + carti.get(i).getNrExemplare());

            }
        }
        Controller();
    }

    public static void cautaCarteDupaCategorie() {
        Scanner scanner = new Scanner(System.in);
        List<Carte> carti = DAOBiblioteca.afiseazaToateCartile();


        System.out.println("Introduceti categoria:");
        String categorie = scanner.nextLine();


        for (int i = 0; i < carti.size(); i++) {
            if (carti.get(i).getCategorie().contains(categorie)) {
                System.out.println(" " + carti.get(i).getBookId() + "     " + carti.get(i).getAutor() + "     " + carti.get(i).getNumeCarte() +
                        "     " + carti.get(i).getCategorie() + "             " + carti.get(i).getEditura() + "                " + carti.get(i).getNrExemplare());


            }
        }
        Controller();

    }

    public static void cautaCarteDupaEditura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti editura:");
        String editura = scanner.nextLine();
        List<Carte> carti = DAOBiblioteca.afiseazaToateCartile();

        for (int i = 0; i < carti.size(); i++) {
            if (carti.get(i).getEditura().contains(editura)) {
                System.out.println(" " + carti.get(i).getBookId() + "     " + carti.get(i).getAutor() + "     " + carti.get(i).getNumeCarte() +
                        "     " + carti.get(i).getCategorie() + "             " + carti.get(i).getEditura() + "                " + carti.get(i).getNrExemplare());
            }

        }
        Controller();
    }

    public static void cautaCarteDupaNume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti editura:");
        String numeCarte = scanner.nextLine();
        List<Carte> carti = DAOBiblioteca.afiseazaToateCartile();

        for (int i = 0; i < carti.size(); i++) {
            if (carti.get(i).getEditura().contains(numeCarte)) {
                System.out.println(" " + carti.get(i).getBookId() + "     " + carti.get(i).getAutor() + "     " + carti.get(i).getNumeCarte() +
                        "     " + carti.get(i).getCategorie() + "             " + carti.get(i).getEditura() + "                " + carti.get(i).getNrExemplare());
            }

        }
        Controller();
    }


    public static void imprumutaCarte() {
        Scanner scanner = new Scanner(System.in);
        Long id;
        int updateExemplare;
        List<Carte> carti = DAOBiblioteca.afiseazaToateCartile();
        List<Carte> cartiImprumutate = new LinkedList<Carte>();
        int nrCartiImrumutate;

        afiseazaCartile();

        System.out.println("Cate carti doriti sa imprumutati?");
        nrCartiImrumutate = scanner.nextInt();

        System.out.println("Alege id-ul cartii pe care vrei sa o imprumuti:");
        id = scanner.nextLong();

        int limita = 1;
        while (limita != nrCartiImrumutate) {


            for (int i = 0; i < carti.size(); i++) {
                if (carti.get(i).getBookId() == id) {

                    cartiImprumutate.add(carti.get(i));
                    updateExemplare = carti.get(i).getNrExemplare();
                    updateExemplare--;
                    DAOBiblioteca.update(updateExemplare, carti.get(i).getBookId());


                }


            }
            limita++;
            System.out.println("Alege id-ul cartii pe care vrei sa o imprumuti:");
            id = scanner.nextLong();



        }

        System.out.println("Ai imprumutat");
        for (int i = 0; i < cartiImprumutate.size(); i++) {

            System.out.println(cartiImprumutate.get(i).getAutor() + " ----" + cartiImprumutate.get(i).getNumeCarte());

        }


    }


}


