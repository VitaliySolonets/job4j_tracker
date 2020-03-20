package professions;

public class Surgeon extends Doctor {
    public void carryOutAnOperation(Pacient pacient) {
        System.out.println("Successful patient operation " + pacient.getName());
    }
}
