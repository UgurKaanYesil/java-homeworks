package Odev11;

public class Kadın extends Personel{
    public Kadın(String ad, String soyad, String dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emeklilikYasi() {
        return 60;
    }
}
