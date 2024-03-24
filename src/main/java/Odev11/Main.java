package Odev11;

public class Main {
    public static void main(String[] args) {

        Erkek teamLead = new Erkek("Ahmet", "Yılmaz", "01.01.1970");

        Departman departman = new Departman(teamLead);

        departman.addPersonel(new Personel("Ayşe", "Demir", "01.01.1980"));

        departman.addAssignment("Proje A görevi");

        Erkek newTeamLead = new Erkek("Mehmet", "Kaya", "01.01.1965");
        departman.setTeamLead(newTeamLead);
    }
}
