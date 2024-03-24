package Odev14;

import java.util.Collection;
import java.util.Set;

import static Odev14.MyUtils.findItemInCollection;

public class Main {
    public static void main(String[] args) {
        // MyClass örneği oluşturup alanı yazdır
        MyUtils.MyClass<String> myClass = new MyUtils.MyClass<>("Hello, world!");
        myClass.printField();

        // Bir koleksiyon oluşturalım ve bir öğe aray
        Collection<String> stringCollection = Set.of("apple", "banana", "cherry");
        String foundItem = findItemInCollection(stringCollection, "banana");
        System.out.println("Found item: " + foundItem);

        // Olmayan bir öğe
        String notFoundItem = findItemInCollection(stringCollection, "grape");
        System.out.println("Found item: " + notFoundItem);
    }
}
