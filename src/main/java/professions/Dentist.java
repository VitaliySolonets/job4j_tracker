package professions;

public class Dentist extends Doctor {
    public void removeTheTooth(Pacient pacient) {
        System.out.println("Tooth removed successfully " + pacient.getName());
    }
}
