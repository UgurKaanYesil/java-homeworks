package Odev11;

public class Personel {
    String ad;
    String soyad;
    String dogumTarihi;

    public Personel(String ad, String soyad, String dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    public int emeklilikYasi() {
        return 60; // Kadınlar için varsayılan emeklilik yaşı
    }
}
