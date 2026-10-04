public class Main {
    public static void main(String[] args) {
        Creature creature = new Creature("Test Creature", 5);

        System.out.println("Name: " + creature.getName());
        System.out.println("Threat Level: " + creature.getThreatLevel());

        creature.react();
    }
}