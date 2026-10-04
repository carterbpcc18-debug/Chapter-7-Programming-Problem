public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("Ember", 9);
        Spirit spirit = new Spirit("Whisper", 6);

        System.out.println("Dragon Name: " + dragon.getName());
        System.out.println("Dragon Threat Level: " + dragon.getThreatLevel());
        dragon.react();

        System.out.println();

        System.out.println("Spirit Name: " + spirit.getName());
        System.out.println("Spirit Threat Level: " + spirit.getThreatLevel());
        spirit.react();
    }
}