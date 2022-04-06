package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("My");
        stringArrayList.add("nickname");
        stringArrayList.add("is");
        stringArrayList.add("etoSkorp");

        System.out.println(stringArrayList.indexOf("etoSkorp"));  // Возвращает индекс элемента списка по значению
        System.out.println(stringArrayList.get(2));  // Возвращает элемент списка по индексу

        Iterator<String> arrayListIterator = stringArrayList.iterator();  // Удаление элемента списка используя итератор
        while (arrayListIterator.hasNext()) {
            String nextElem = arrayListIterator.next();
            if (nextElem.contains("is")) {
                arrayListIterator.remove();
            }
        }
        System.out.println(stringArrayList);


        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("My");
        stringLinkedList.add("nickname");
        stringLinkedList.add("is");
        stringLinkedList.add("etoSkorp");

        System.out.println(stringLinkedList.indexOf("My"));  // Возвращает индекс элемента списка по значению
        System.out.println(stringLinkedList.get(1));  // Возвращает элемент списка по индексу

        stringLinkedList.remove("etoSkorp");  // Удаление в LinkedList
        stringLinkedList.remove(1);
        System.out.println(stringLinkedList);

        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Реализация");
        myArrayList.add("MyArrayList");
        System.out.println(myArrayList);


        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("first element");
        myLinkedList.add("second element");
        myLinkedList.add("third element");

        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
}