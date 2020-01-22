package org.teckhooi.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * java -ea to enable assert otherwise AssertionError will not be thrown with
 * false assertion.
 * 
 * To compile,
 * javac -d classes src/org/teckhooi/generics/GroceryStore.java
 * 
 * To execute,
 * java -ea -cp classes org.teckhooi.generics.GroceryStore
 *   
 * @author Lim, Teck Hooi
 *   
 */
public class GroceryStore {
    static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static class Fruit extends Plant {
        private int size;

        public Fruit(String name, int size) {
            super(name);
            this.size = size;
        }

        public int getSize() {
            return size;
        }
    }

    static class Apple extends Fruit {
        private String origin;

        public Apple(String name, int size, String origin) {
            super(name, size);
            this.origin = origin;
        }

        public String getOrigin() {
            return origin;
        }
    }

    public static void main(String[] args) {
        GroceryStore store = new GroceryStore();
        List<? super Fruit> fruitsBasket = new ArrayList<>();
        store.fill(fruitsBasket);

        assert(fruitsBasket.size() == 3);

        List<Apple> anotherBasket = new ArrayList<>();
        anotherBasket.add(new Apple("apple", 5, "US"));
        anotherBasket.add(new Apple("apple", 8, "UK"));
        anotherBasket.add(new Apple("apple", 9, "CN"));

        assert(store.getBiggestFruit(anotherBasket).getSize() == 9);
    }

    public void fill(List<? super Fruit> fruitsBasket) {
        fruitsBasket.add(new Apple("apple", 5, "US"));
        fruitsBasket.add(new Apple("apple", 8, "UK"));
        fruitsBasket.add(new Apple("apple", 9, "CN"));

        // Note : This statement compiles because it didn't assign an
        // instant to a variable or return it to the caller as shown below.
        // 
        // fruitsBasket.get(0); // compiles OK
        // Fruit apple = fruitsBasket.get(0);   // compilation error
        //
        // return fruitsBasket.get(0);   // compilation error 
    }

    /**
     * This method accepts List<? extends Fruit> instead of List<Apple> to allow 
     * classes that extend from Fruit to be used as input. 
     *
     * Note : List<Apple> is not a child of List<Fruit> though Apple inherits 
     * from Fruit. It just does not work this way.
     */
    public Fruit getBiggestFruit(List<? extends Fruit> fruits) {
        // Note: This statement is here to highlight that "? extends T" 
        // cannot "consume" new instances. Remember PECS rule.
        // fruits.add(new Apple("apple", 9, "CN"));  // compilation error

        assert(!fruits.isEmpty());
        int len = fruits.size();
        Fruit biggestFruit = fruits.get(0);
        for (int i = 1; i < len; i++) {
            if (fruits.get(i).getSize() > biggestFruit.getSize()) {
                biggestFruit = fruits.get(i);
            }    
        }
        return biggestFruit;
    }
}