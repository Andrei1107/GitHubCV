package Exercitiul6;

import java.util.Objects;

public class Employee {

    private String nume;
    private String prenume;
    private static int id;
private int unicID;


public Employee(){

}
    public Employee(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
        this.unicID=id++;
        //sau cu random,dar e mai sigur asa

    }


    public String getNume(){
        return nume;
    }
    public String getPrenume(){
        return prenume;
    }

    public  int getId(){
        return unicID;
    }

//    @Override
//    public String toString() {
//        return "\nAngajatul cu  id-ul "+getId()+" se numeste "+getNume()+" "+
//                getPrenume();
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return unicID == employee.unicID &&
                nume.equals(employee.nume) &&
                prenume.equals(employee.prenume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, unicID);
    }
}
