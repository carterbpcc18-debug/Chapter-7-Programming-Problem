public class Dragon extends Creature {

    public Dragon(String name, int threatLevel) {
        super(name, threatLevel);
    }

    @Override
    public void react() {
        System.out.println("The dragon breathes fire!");
    }

    /*
    This method cannot be overridden because
    verifyContainment() is final in Creature.

    @Override
    public void verifyContainment() {
        System.out.println("Dragon containment verification.");
    }
    */
}