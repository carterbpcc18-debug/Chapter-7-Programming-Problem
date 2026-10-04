public class Golem extends Creature {

    public Golem(String name, int threatLevel) {
        super(name, threatLevel);
    }

    @Override
    public void react() {
        System.out.println("The golem hardens its stone plating!");
    }
}