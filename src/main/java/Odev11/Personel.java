package Odev11;

public abstract class Personel {
    String ad;
    String soyad;
    String dogumTarihi;

    public Personel(String ad, String soyad, String dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    public abstract int emeklilikYasi();
}
