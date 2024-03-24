package Odev7;

public enum GezegenEnum {
    MERKUR(1, 57.9, 2439.7, 1407.6),
    VENUS(2, 108.2, 6051.8, 5832.5),
    DUNYA(3, 147.1, 6371, 24),
    MARS(4, 227.9, 3389.5, 24.6);

    // Özellikler
    private final int siraNumarasi;
    private final double uzaklik;
    private final double yaricap;
    private final double donmeSuresi;

    GezegenEnum(int siraNumarasi, double uzaklik, double yaricap, double donmeSuresi) {
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
        return "Gezegen [" + name() + ": Sıra Numarası=" + siraNumarasi +
                ", Uzaklık=" + uzaklik + ", Yarıçap=" + yaricap + ", Dönme Süresi=" + donmeSuresi + "]";
    }

    public static void main(String[] args) {
        for (GezegenEnum gezegen : GezegenEnum.values()) {
            System.out.println(gezegen.toString());
        }
    }
}
