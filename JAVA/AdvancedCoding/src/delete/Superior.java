package delete;

public class Superior {
    private String nume;
    private String prenume;


    public Superior(String name, String prenume) {
        this.nume = name;
        this.prenume = prenume;
    }

    public Superior() {

    }


    public String getPrenume() {
        return prenume;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }



}
