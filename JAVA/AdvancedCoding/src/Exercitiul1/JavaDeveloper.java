package Exercitiul1;

public class JavaDeveloper extends  Developer {

    public JavaDeveloper(){
        super();
        System.out.println("I'm yet a new Java Developer");
    }

    protected void code(String codingLanguage){
        System.out.println("I'm happy coding in "+codingLanguage);
    }


}
