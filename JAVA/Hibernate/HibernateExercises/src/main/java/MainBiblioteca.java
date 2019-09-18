public class MainBiblioteca {

    public static void main(String[] args) {

        Carte biblioteca=new Carte();
        biblioteca.setAutor("Mihai Eminescu");
        biblioteca.setCategorie("Romantism");
        biblioteca.setEditura("Humanitas");
        biblioteca.setNumeCarte("Poezii");
        biblioteca.setNrExemplare(5);
DAOBiblioteca daoBiblioteca=new DAOBiblioteca();
daoBiblioteca.createBook(biblioteca);


    }



}
