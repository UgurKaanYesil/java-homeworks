package Odev4;

import java.util.ArrayList;
import java.util.List;

public class Departman {
    private String ad;
    private List<Personel> personeller;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setPersoneller(List<Personel> personeller) {
        this.personeller = personeller;
    }

    public Departman(String ad) {
        this.ad = ad;
        this.personeller = new ArrayList<>();
    }

    public void personelEkle(Personel personel) {
        personeller.add(personel);
    }

    public List<Personel> getPersoneller() {
        return personeller;
    }
}
