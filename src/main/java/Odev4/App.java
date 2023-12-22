package Odev4;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // Departman oluştur
        Departman itDepartmani = new Departman("Bilgi İşlem");

        // Personel oluştur
        Personel personel1 = new Personel("Uğur Kaan", "Yeşil", 26);
        Personel personel2 = new Personel("Ayşe", "Demir", 35);

        // Personelleri departmana ekle
        itDepartmani.personelEkle(personel1);
        itDepartmani.personelEkle(personel2);

        // Departmandaki personelleri listele
        List<Personel> departmanPersonelleri = itDepartmani.getPersoneller();
        System.out.println(itDepartmani.getAd() + " Departmanındaki Personeller:");

        for (Personel personel : departmanPersonelleri) {
            System.out.println("Ad: " + personel.getAd() + ", Soyad: " + personel.getSoyad() + ", Yaş: " + personel.getYas());
        }
    }
}
