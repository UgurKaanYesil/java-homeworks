package Odev11;

import java.util.ArrayList;

public class Departman {
    Erkek teamLead;
    ArrayList<Personel> personelList;
    ArrayList<String> assignmentList;

    public Departman(Erkek teamLead) {
        this.teamLead = teamLead;
        this.personelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    public void setTeamLead(Erkek newTeamLead) {
        this.teamLead = newTeamLead;
    }

    public void addPersonel(Personel personel) {
        personelList.add(personel);
    }

    public void removePersonel(Personel personel) {
        personelList.remove(personel);
    }

    public void changePersonel(Personel oldPersonel, Personel newPersonel) {
        int index = personelList.indexOf(oldPersonel);
        if (index != -1) {
            personelList.set(index, newPersonel);
        }
    }

    public void addAssignment(String assignment) {
        assignmentList.add(assignment);
    }

    public void completeAssignment(String assignment) {
        assignmentList.remove(assignment);
    }
}
