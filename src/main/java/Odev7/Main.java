package Odev7;

public class Main {
    public static void main(String[] args) {
        Gezegen[] gezegenler = new Gezegen[4];
        gezegenler[0] = new Gezegen(1, 57.9, 2439.7, 1407.6);
        gezegenler[1] = new Gezegen(2, 108.2, 6051.8, 5832.5);
        gezegenler[2] = new Gezegen(3, 147.1, 6371, 24);
        gezegenler[3] = new Gezegen(4, 227.9, 3389.5, 24.6);

        for (Gezegen gezegen : gezegenler) {
            System.out.println(gezegen.toString());
        }
    }
}
