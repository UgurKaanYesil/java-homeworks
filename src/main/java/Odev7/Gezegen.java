package Odev7;

public class Gezegen {
    private int siraNumarasi;
    private double uzaklik;
    private double yaricap;
    private double donmeSuresi;

    public Gezegen(int siraNumarasi, double uzaklik, double yaricap, double donmeSuresi) {
        this.siraNumarasi = siraNumarasi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public int getSiraNumarasi() {
        return siraNumarasi;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }

    @Override
    public String toString() {
        return "Gezegen [Sıra Numarası: " + siraNumarasi + ", Uzaklık: " + uzaklik +
                ", Yarıçap: " + yaricap + ", Dönme Süresi: " + donmeSuresi + "]";
    }

}
