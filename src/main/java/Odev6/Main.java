package Odev6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] metinler = {"merhaba", "dunya", "uçak", "güzel","üzüm"};

        String birlesikMetin = birlestirTekrarliKarakterler(metinler);
        System.out.println("Birleştirilmiş Metin: " + birlesikMetin);
    }

    public static String birlestirTekrarliKarakterler(String[] metinler) {
        Set<Character> tekrarliKarakterler = new HashSet<>();
        Set<Character> set1 = new HashSet<>();

        for (String metin : metinler) {
            Set<Character> set2 = new HashSet<>();
            for (char karakter : metin.toCharArray()) {
                if (!set1.add(karakter)) {
                    tekrarliKarakterler.add(karakter);
                }
                set2.add(karakter);
            }
            set1.addAll(set2);
        }

        StringBuilder birlesikMetin = new StringBuilder();
        for (char karakter : tekrarliKarakterler) {
            birlesikMetin.append(karakter);
        }

        return birlesikMetin.toString();
    }
}
