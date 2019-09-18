package Exercitiul3;

public class Person {

    private String name;
    private String surname;
    private int phone;


    public Person(){
        this.name="";
        this.surname="";
        this.phone=0;
    }

    public Person(String name,String surname,int phone){
        this.name=name;
        this.surname=surname;
        this.phone=phone;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhone() {
        return phone;
    }


    @Override
    public String toString() {
        return getName()+"  "+getSurname()+"  "+getPhone();
    }
}
