package ua.hillel.homeTask_10;

/*Написати програму, яка замість попелюшки сортує числа з початкової колекції на 3 кошика:
в перший - числа, які діляться на 2, в другий - числа, які діляться на 3, в третій - всі інші.
Якщо число ділиться на 2 і на 3, то воно має попасти в обидва кошика. Початкову колекцію з 100 елементів заповнити випадковими цілими числами.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cinderella {
    public static void main(String[] args) {
        final int collectionSize = 100;
        final int randomRangeLimit = 100;

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < collectionSize; i++) {
            list.add(random.nextInt(randomRangeLimit));
        }
        System.out.println("Random number collection " + list);

        List<Integer> divIntoTwo = new ArrayList<>();
        List<Integer> divIntoThree = new ArrayList<>();
        List<Integer> other = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer number = list.get(i);

            if (number % 2 == 0) {
                divIntoTwo.add(number);
            }
            if (number % 3 == 0) {
                divIntoThree.add(number);
            } else {
                if  (number % 2 !=0) {
                    other.add(number);
                }
            }
        }
        System.out.println("1 basket " + divIntoTwo + " - this numbers are divided into 2");
        System.out.println("2 basket " + divIntoThree + " - this numbers are divided into 3");
        System.out.println("3 basked " + other + " - this numbers aren't divided into 2 or 3");
    }
}


