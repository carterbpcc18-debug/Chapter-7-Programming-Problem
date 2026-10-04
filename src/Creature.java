public class Creature {
    private String name;
    private int threatLevel;

    public Creature(String name, int threatLevel) {
        this.name = name;
        this.threatLevel = threatLevel;
    }

    public String getName() {
        return name;
    }

    public int getThreatLevel() {
        return threatLevel;
    }

    public void react() {
        System.out.println("The creature reacts to containment.");
    }

    public final void verifyContainment() {
        System.out.println("Official Containment Status");
        System.out.println("Name: " + name);
        System.out.println("Threat Level: " + threatLevel);
    }
}