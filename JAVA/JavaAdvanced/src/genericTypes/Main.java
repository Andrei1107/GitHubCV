package genericTypes;

public class Main {


    public static void main(String[] args) {

        Person persoana1 = new Person("Andrei");
        BankAccount bankAccount = new BankAccount(15);

        Pair<Person, BankAccount> p1 = new Pair<>(persoana1, bankAccount);

        Pair<Person, SavingsAccount> p2 = new Pair<>(new Person("Gicu"), new SavingsAccount(5000));

       // System.out.println(p1.getItem1().getName());

        Pair[] pairArray = {p1,p2};

        for (Pair p : pairArray){

                Person person = (Person) p.getItem1();
               Object value=((Person) p.getItem1()).getName();
                BankAccount bankAccount1;

              //try ->catch



        }

    }


}
