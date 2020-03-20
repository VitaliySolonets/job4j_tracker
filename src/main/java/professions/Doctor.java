package professions;

public class Doctor extends Profession {

    public Diagnose heal(Pacient pacient) {
        return new Diagnose();
    }
}
