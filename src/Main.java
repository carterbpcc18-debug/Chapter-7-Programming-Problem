import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Creature> roster = new ArrayList<>();

        roster.add(new Dragon("Ember", 9));
        roster.add(new Spirit("Whisper", 6));
        roster.add(new Golem("Boulder", 7));

        for (Creature creature : roster) {
            System.out.println("Name: " + creature.getName());
            System.out.println("Threat Level: " + creature.getThreatLevel());
            creature.react();
            System.out.println();
        }
    }
}