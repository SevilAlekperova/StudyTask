package HomeWork11;

import java.util.LinkedList;

public class Bucket {
    private LinkedList<Fruits> collectionOfFruits = new LinkedList<>();


    public void putFruit(Fruits fruit){
        if (collectionOfFruits.size() < 8) {
            collectionOfFruits.add(fruit);
        } else {
            System.out.println("Корзина наполнена");
        }
    }

    public Fruits takeFruit (){
        if (collectionOfFruits.size() == 0){
            System.out.println("Корзина пуста!");
            return null;
        } else {
            return collectionOfFruits.removeFirst();
        }
    }

    public void showBucket(){
        System.out.println(collectionOfFruits);
    }
}
