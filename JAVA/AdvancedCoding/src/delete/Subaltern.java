package delete;

public class Subaltern {

    private String nume;
    private String prenume;


    public Subaltern(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public Subaltern(){


    }


    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
}
