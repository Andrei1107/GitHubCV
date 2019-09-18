package Exercitiul2;

import java.util.LinkedList;
import java.util.List;

public class WareHouse {


    private static WareHouse self = null;

    private List<ChefKnife> chefKnives;
    private List<FishTongs> fishTongs;
    private List<Mortar> mortars;
    private List<BurgerPress> burgerPresses;


    public WareHouse() {
        chefKnives = new LinkedList<>();
        fishTongs = new LinkedList<>();
        mortars = new LinkedList<>();
        burgerPresses = new LinkedList<>();

    }


    public static WareHouse buildWarehouse() {
        if (self == null) {
            self = new WareHouse();
        }


        return self;
    }

    public void addChiefKnives(List<ChefKnife> chefKnives) {
        this.chefKnives.addAll(chefKnives);

        chefKnives.forEach(chefKnife -> {
            this.chefKnives.add(chefKnife);
            printItem(chefKnife);
        });
    }

    public void addChefKnife(ChefKnife chefKnife) {

        chefKnives.add(chefKnife);
        printItem(chefKnife);
    }

    public void listSumOfChefKnives() {

        double sum = chefKnives.stream().map(ChefKnife::getPrice).reduce(0d, Double::sum);

        double sum2 = 0d;

        for (int i = 0; i < chefKnives.size(); i++) {
            sum2 += chefKnives.get(i).getPrice();
        }


        System.out.println(String.format("The sum of chef knivesin the warehouse is %s :", sum));
    }


    public void removeChefKnife(ChefKnife chefKnife) {
        chefKnives.remove(chefKnife);
    }


    public void addFishTongs(FishTongs fishTong) {
        fishTongs.add(fishTong);
        printItem(fishTong);
    }

    public void addMortars(Mortar mortar) {
        mortars.add(mortar);
        printItem(mortar);
    }

    public void addBurgerPress(BurgerPress burgerPress) {
        burgerPresses.add(burgerPress);
    }

    public void addBurgerPressInBulk(int noOfBurgerPress) {
        BurgerPress burgerPress;
        for (int i = 0; i < noOfBurgerPress; ++i) {
            burgerPress = new BurgerPress("DefaultBurgerPress" + i);
            addBurgerPress(burgerPress);

        }
    }


    private <T extends Utensil> void printItem(T item) {
        System.out.println(String.format("Added %s 's %s to warehouse at the price of : %s", item.getName(), item.getClass(), item.getPrice()));
    }


}
