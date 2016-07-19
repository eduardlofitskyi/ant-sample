package com.lofitskyi.main;

import interfaces.task5.ArrayCollection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        ArrayCollection<Integer> collection = new TestableArrayCollectionImpl<>();
        collection.add(3);
        collection.add(2);
        collection.add(1);
        collection.forEach(System.out::println);
    }
}
