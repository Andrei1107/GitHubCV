package Exercitiul2;

import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

ChefKnife chefKnife=new ChefKnife("Delimano Power",225d);
ChefKnife chefKnife2=new ChefKnife("Florin Dumitrescu",175d);



WareHouse wareHouse=WareHouse.buildWarehouse();

wareHouse.addChefKnife(chefKnife);
wareHouse.addChefKnife(chefKnife2);
wareHouse.removeChefKnife(chefKnife);
wareHouse.addChefKnife(new ChefKnife("",0d));
wareHouse.addChefKnife(new ChefKnife("",0d));


wareHouse.addChiefKnives(buildChefKnifeList());
wareHouse.listSumOfChefKnives();


    wareHouse.addBurgerPressInBulk(15);

        System.out.println(chefKnife);
        System.out.println(chefKnife2);
        System.out.println(chefKnife.hashCode());
        System.out.println(chefKnife2.hashCode());
        System.out.println(chefKnife.equals(chefKnife2));
        System.out.println(new ChefKnife("",0d).equals(new ChefKnife("",0d)));
        System.out.println(getI());



    }

    private static int getI() {
        int i = 3;
        return ++i + i++ ;
    }


    private static List<ChefKnife> buildChefKnifeList() {
        ChefKnife chefKnife3 = new ChefKnife("Catalin Scarlatescu", 150d);
        ChefKnife chefKnife4 = new ChefKnife("Sorin Bontea", 250d);
        ChefKnife chefKnife5 = new ChefKnife("Irina Hristu", 200d);

        List<ChefKnife> chefKnives = new LinkedList<>();
        chefKnives.add(chefKnife3);
        chefKnives.add(chefKnife4);
        chefKnives.add(chefKnife5);

        return chefKnives;
    }


}
