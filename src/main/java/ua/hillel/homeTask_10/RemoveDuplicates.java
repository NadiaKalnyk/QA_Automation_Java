package ua.hillel.homeTask_10;


/*Написати програму яка видаляє з колекції цілих чисел всі дублікати, якщо вони є.
Початкову колекцію з 100 елементів потрібно заповнити випадковими числами (ліміт 50).
На екран потрібно вивести обидві колекції та кількість видалених дублікатів.
(За бажанням можна вирішити декількома способами та порівняти, який з них швидше)*/

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        final int collectionSize = 100;
        final int randomRangeLimit = 50;

        List<Integer> list = new ArrayList<>(collectionSize);
        Random random = new Random();
        List distinctList = null;
        int count = 0;
        for (int i = 0; i < collectionSize; i++) {
            list.add(random.nextInt(randomRangeLimit));
        }
        distinctList = list.stream().distinct().collect(Collectors.toList()); // видалення дублікатів з колекції
        count = list.size() - distinctList.size();
        System.out.println("Collection without duplicates: " + distinctList);
        System.out.println("Full random collection: " + list);
        System.out.println("Count of deleted duplicates: " + count);
    }
}

