public class Dragon extends Creature {

    public Dragon(String name, int threatLevel) {
        super(name, threatLevel);
    }

    @Override
    public void react() {
        System.out.println("The dragon breathes fire!");
    }
}