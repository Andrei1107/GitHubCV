package Exercitiul2;

public class ChefKnife extends Utensil {

    public ChefKnife(String name){
        super(name);
    }


    public ChefKnife(String name,double price){
        super(name,price);

    }

    @Override
    public String toString() {
        return  name;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ChefKnife){
            ChefKnife chefKnife=(ChefKnife)obj;
            return chefKnife.getName().equals(this.getName()) && chefKnife.getPrice() == this.getPrice();
        }
        return  false;
    }
}
