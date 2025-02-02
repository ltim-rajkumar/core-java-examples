package com.lt.practice.collections;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        // add() - Add element to the list
        List<String> cities = new ArrayList<String>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Banglore");

        System.out.println("cities; " + cities);
        System.out.println("---------------------");

//        get(index) - return index based element from list
        System.out.println("Get 1 index element - cities.get(1);     " + cities.get(1));
        System.out.println("Get first element   - cities.getFirst(); " + cities.getFirst());
        System.out.println("Get lsat element    - cities.getLast();  " + cities.getLast());

        System.out.println("---------------------");
        String removedCity = cities.remove(1);
        System.out.println("Removed city: " + removedCity);
        System.out.println("Remaining cities: " + cities);

        System.out.println("----- Collections.addAll(<oldListVariable, 'item11', 'item-N'>)----------------");
        boolean isNewItemAdded = Collections.addAll(cities, "Jammu", "Leh");
        System.out.println("isNewItemAdded = " + isNewItemAdded);
        System.out.println(" Old list: " + cities);

//        List<String> newCitiesList = new ArrayList<>();
//        newCitiesList.addAll(cities);
//            OR
        List<String> newCitiesList = new ArrayList<>(cities);
        newCitiesList.add(1, "Chennai");
        System.out.println(" newCitiesList: " + newCitiesList);

        System.out.println("newCitiesList.contains(1) ? " + newCitiesList.contains(21));
        System.out.println("newCitiesList.contains(\"Chennai\") ? " + newCitiesList.contains("Chennai"));

    }

}
