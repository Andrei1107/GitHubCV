package collections;

public class Angajat {

    //long cu l mic este primitiva si Long este wrapper class-ul lui
    //eu initializam long cu null si nu am cum sa initializez o primitiva cu null
    //null este tot un obiect
    private Long id;
    private  String nume;
    private String departament;
    boolean areMasina;

    public void setId(long id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void setAreMasina(boolean areMasina) {
        this.areMasina = areMasina;
    }

    public long getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getDepartament() {
        return departament;
    }

    public boolean isAreMasina() {
        return areMasina;
    }

    public Angajat(long id, String nume, String departament, boolean areMasina) {
        this.id = id;
        this.nume = nume;
        this.departament = departament;
        this.areMasina = areMasina;
    }


    public Angajat(){
        this.nume=null;
        this.id=null;
        this.departament=null;
        this.areMasina=false;
    }

public String hash(){

        return id+nume+departament;
}

}
