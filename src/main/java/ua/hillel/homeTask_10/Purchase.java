package ua.hillel.homeTask_10;

/*Створити програму - список покупок. В список заносяться назва товару та кількість.
Список заповнити випадковими товарами. В кінці потрібно підрахувати загальну кількість всіх доданих товарів*/


import java.util.*;

public class Purchase {
    public static void main(String[] args) {

        Map <String, Integer> map = new HashMap<>();
        map.put ("apples", 10);
        map.put ("bananas", 5);
        map.put ("grapes", 3);
        map.put ("oranges", 4);
        map.put ("mango", 1);

        int countsOfProducts = 0;
        for (int value:  map.values()) {
            countsOfProducts += value;
        }
        System.out.println("List of the products - " + map);
        System.out.println("Your count of product is " + countsOfProducts);
    }
}


