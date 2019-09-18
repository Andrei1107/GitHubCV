package Exercitiul1;

public class Developer extends Person {


    private  CodingLanguage codingLanguage;



    public Developer(){
        super();
        System.out.println("I'm a new developer");
    }
public Developer(CodingLanguage codingLanguage){
        this.codingLanguage=codingLanguage;
}

protected void code(){
    System.out.print("I'm happy coding");
}

public boolean knowsC(){
        return codingLanguage.equals(CodingLanguage.C);
}








    enum CodingLanguage{
        Java,
        C,
Python

    }

}
