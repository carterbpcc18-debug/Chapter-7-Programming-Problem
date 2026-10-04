public class Spirit extends Creature {

    public Spirit(String name, int threatLevel) {
        super(name, threatLevel);
    }

    @Override
    public void react() {
        System.out.println("The spirit fades into mist!");
    }
}